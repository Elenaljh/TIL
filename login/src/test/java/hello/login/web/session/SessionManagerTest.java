package hello.login.web.session;

import hello.login.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.assertj.core.api.Assertions.*;


public class SessionManagerTest {

    SessionManager sessionManager = new SessionManager();

    @Test
    void sessionTest() {
        //test시에 진짜 response 객체(톰캣이 제공)를 사용하기 어려우므로 스프링이 가짜 response객체 제공해줌
        MockHttpServletResponse response = new MockHttpServletResponse();

        //세션 생성
        Member member = new Member(); //member 생성
        sessionManager.createSession(member, response); //웹브라우저에 응답 보냈다고 가정
        // 1. 세션 저장소에 UUID:member 저장
        // 2. "mySessionId":UUID 를 브라우저에 cookie로 보냄

        //요청에 응답 쿠키 저장
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setCookies(response.getCookies()); //브라우저에서 쿠키 담아서 요청보냈다고 가정


        // 세션 조회
        Object result = sessionManager.getSession(request); //키가 UUID인 값=member을 result에 저장
        assertThat(result).isEqualTo(member); //찾은 member이 처음 만든 member객체와 동일한지 검증

        //세션 만료
        sessionManager.expire(request);
        Object expired = sessionManager.getSession(request);
        assertThat(expired).isNull();
    }
}
