package hello.login.web.filter;

import hello.login.web.SessionConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.PatternMatchUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Slf4j
public class LoginCheckFilter implements Filter {

    private static final String[] whitelist = {"/", "/members/add", "/login", "/logout", "/css/*"};

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI();

        HttpServletResponse httpResponse = (HttpServletResponse) response;

        try {
            log.info("인증 체크 필터 시작{}", requestURI);

            if (isLoginCheckPath(requestURI)) { //uri가 화이트리스트에 없다면 (로그인한 사람만 접근 가능한 페이지)
                log.info("인증 체크 로직 실행 {}", requestURI);
                HttpSession session = httpRequest.getSession(false); //세션 가져온다
                if (session == null || session.getAttribute(SessionConst.LOGIN_MEMBER) == null) { //로그인 실패
                    log.info("미인증 사용자 요청 {}", requestURI);
                    //로그인으로 redirect
                    httpResponse.sendRedirect("/login?redirectURL=" + requestURI);
                    //이렇게하면 로그인 페이지로 보내서 로그인했을때, 전에 접근하려고 했던 페이지로 바로 보냄 -> 사용자가 편해짐
                    return;
                }
            }

            chain.doFilter(request, response);//다음 필터로 넘어감
            //화이트리스트에 있는 uri의 경우 위의 if문 안타고 바로 다음 필터로 넘어간다

        } catch (Exception e) {
            throw e; //예외 로깅 가능하지만 톰캣까지 예외를 보내줘야 함.
        } finally {
            log.info("인증 체크 필터 종료 {}", requestURI);
        }
    }

    /**
     * 화이트 리스트의 경우 인증 체크 X
     */
    private boolean isLoginCheckPath(String requestURI) {
        return !PatternMatchUtils.simpleMatch(whitelist, requestURI); //whitelist에 없는 것이 true가 됨
    }
}
