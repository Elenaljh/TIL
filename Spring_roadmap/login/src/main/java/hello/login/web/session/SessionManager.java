package hello.login.web.session;

import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class SessionManager {

    private static final String SESSION_COOKIE_NAME = "mySessionId";
    // 동시성 이슈가 있기 때문에 (동시에 여러 스레드가 접근하기 때문에) concurrentHashMap 사용
    private Map<String, Object> sessionStore = new ConcurrentHashMap<>();

    /**
     * 세션 생성
     * * sessionId 생성(임의의 추정 불가능한 랜덤 값)
     * * 세션 저장소에 sessionId와 보관할 값 저장
     * * sessionId로 응답 쿠키를 생성해서 클라이언트에 저장
     */
    public void createSession(Object value, HttpServletResponse response) {
        // sessionId 생성(임의의 추정 불가능한 랜덤 값), 값을 세션에 저장
        String sessionId = UUID.randomUUID().toString();
        sessionStore.put(sessionId, value); //UUID와 쿠키 진짜 값 저장

        //쿠키 생성 - 키: mySessionId, 값: 위에서 만든 sessionId(UUID)
        Cookie mySessionCookie = new Cookie(SESSION_COOKIE_NAME, sessionId);
        response.addCookie(mySessionCookie); // response에 쿠키를 같이 보냄
    }

    /**
     * 세션 조회
     */

    public Object getSession(HttpServletRequest request) {
        //브라우저의 request에서 키="mySessionId":값=UUID인 쿠키를 찾아서 sessionCookie에 저장
        Cookie sessionCookie = findCookie(request, SESSION_COOKIE_NAME);
        //만약 sessionCookie에 아무것도 없으면 null 반환
        if (sessionCookie == null) {
            return null;
        }
        //sessionCookie가 존재하면 sessionStore에서 키=UUID인 값=member을 반환
        return sessionStore.get(sessionCookie.getValue());
    }

    /**
     * 세션 만료
     */
    public void expire(HttpServletRequest request) {
        Cookie sessionCookie = findCookie(request, SESSION_COOKIE_NAME);
        if (sessionCookie != null) {
            sessionStore.remove(sessionCookie.getValue());
        }
    }


    public Cookie findCookie(HttpServletRequest request, String cookieName) {
        // Cookie[] cookies = request.getCookies(); -> 쿠키는 배열로 반환된다!
        if (request.getCookies() == null) { //응답에 쿠키정보 없으면 null 반환
            return null;
        }
        return Arrays.stream(request.getCookies())
                .filter(cookie -> cookie.getName().equals(cookieName))
                .findAny()
                .orElse(null); // 응답에 쿠키 - 키="mySessionId"가 존재하면 반환 / 만약에 mySessionId가 없으면 null 반환
    }

}
