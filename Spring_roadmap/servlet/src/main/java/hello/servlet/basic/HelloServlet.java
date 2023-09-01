package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username"); //쿼리 파라미터 읽어오기
        System.out.println("username = " + username); //쿼리 파라미터로 뭘 입력했는지 찍어줌

        response.setContentType("text/plain"); // 응답메시지 파싱해줌(?)
        response.setCharacterEncoding("utf-8"); //ContentType이랑 CharacterEncoding은 헤더정보
        response.getWriter().write("hello " + username); //http 메세지 바디에 들어간다
    }
}
