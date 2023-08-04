package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {
    //이제 컨트롤러는 MyView를 프론트 컨트롤러에 반환할 것임. 그래서 void가 아닌 MyView가 반환객체가 된다.
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
