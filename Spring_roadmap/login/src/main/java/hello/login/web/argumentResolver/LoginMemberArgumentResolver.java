package hello.login.web.argumentResolver;

import hello.login.domain.member.Member;
import hello.login.web.SessionConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
public class LoginMemberArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        log.info("supportParameter 실행");

        boolean hasLoginAnnotation = parameter.hasParameterAnnotation(Login.class); //파라미터 앞에 @Login 붙어있는지 검사
        boolean hasMemberType = Member.class.isAssignableFrom(parameter.getParameterType());

        return hasLoginAnnotation && hasMemberType;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

        log.info("resolveArgument 실행");

        HttpServletRequest request = (HttpServletRequest) webRequest.getNativeRequest(); //webRequest에서 HttpServletRequest뽑기 위함
        HttpSession session = request.getSession(false); //세션 받아옴(로그인 했으면 세션이 있겠지)
        if (session == null) {
            return null; //세션이 null이면 @Login붙은 파라미터 값을 null로 만들거임 -> 로그인 하지 않았으니 null을 HomeController의 member변수에 넣게 될 것
        }

        return session.getAttribute(SessionConst.LOGIN_MEMBER); //로그인했으면 loginMember에 해당 멤버 객체를 저장한다.
    }
}
