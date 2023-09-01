package hello.exception.resolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.exception.exception.UserException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class UserHandlerExceptionResolver implements HandlerExceptionResolver {

    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        try {
            if (ex instanceof UserException) {
                log.info("UserException resolver to 400");
                String acceptHeader = request.getHeader("accept"); //accept값 저장
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST); //status를 400으로 저장

                if ("application/json".equals(acceptHeader)) { //accept = json일 때
                    Map<String, Object> errorResult = new HashMap<>(); //errorResult 만든다
                    errorResult.put("ex", ex.getClass()); //"ex":ex.getClass() 저장
                    errorResult.put("message", ex.getMessage()); //"message":ex.getMessage() 저장

                    String result = objectMapper.writeValueAsString(errorResult);//객체(json)를 문자로 바꿈

                    response.setContentType("application/json"); //response의 contenttype을 json으로 저장
                    response.setCharacterEncoding("utf-8"); //response encoding을 utf-8로 지정
                    response.getWriter().write(result); //http응답 body에 json이 들어감
                    return new ModelAndView(); //빈 modelandview 반환 -> 위에서 세팅한 response가 서블릿 컨테이너까지 넘어감
                } else {
                    //text/html 등이 넘어올 때
                    return new ModelAndView("error/500"); //template/error/500.html이 호출된다.
                }
            }
        } catch (IOException e) {
            log.error("resolver ex", e);
        }
        return null;
    }
}
