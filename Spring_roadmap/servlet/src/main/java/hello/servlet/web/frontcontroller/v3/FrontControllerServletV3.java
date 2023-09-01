package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v3.controller.MemberFormControllerV3;
import hello.servlet.web.frontcontroller.v3.controller.MemberListControllerV3;
import hello.servlet.web.frontcontroller.v3.controller.MemberSaveControllerV3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerServletV3", urlPatterns = "/front-controller/v3/*")
public class FrontControllerServletV3 extends HttpServlet {

    private Map<String, ControllerV3> controllerMap = new HashMap<>();
    public FrontControllerServletV3() {
        controllerMap.put("/front-controller/v3/members/new-form", new MemberFormControllerV3());
        controllerMap.put("/front-controller/v3/members/save", new MemberSaveControllerV3());
        controllerMap.put("/front-controller/v3/members", new MemberListControllerV3());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String requestURI = request.getRequestURI(); //주소창에 입력된 uri 받음

        ControllerV3 controller = controllerMap.get(requestURI); //각 요청(uri)에 맞는 컨트롤러 가져옴
        if (controller == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        // 1. paramMap을 만든다 (자세한 로직은 따로 함수로 뺐음)
        Map<String, String> paramMap = createParamMap(request);
        // 2. 넘겨받은 논리이름을 이용해서 상세경로 만들기
        ModelView mv = controller.process(paramMap);
        String viewName = mv.getViewName();//논리이름 ex.new-form
        MyView view = viewResolver(viewName);//논리이름을 상세 경로에 삽입해서 경로이름 완성

        view.render(mv.getModel(), request, response);

    }

    private MyView viewResolver(String viewName) {
        return new MyView("/WEB-INF/views/" + viewName + ".jsp");
    }

    private static Map<String, String> createParamMap(HttpServletRequest request) {
        //1. 일단 request에서 파라미터 다 꺼내서 paramMap에 저장하자
        Map<String, String> paramMap = new HashMap<>();
        request.getParameterNames().asIterator()  //일단 parameterNames를 다 꺼낸다 (key)
                .forEachRemaining(paramName -> paramMap.put(paramName, request.getParameter(paramName)));
        //각 파라미터 이름에 할당된 값들을 꺼내서 paramMap에 키:값 형태로 저장한다.
        return paramMap;
    }
}
