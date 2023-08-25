package hello.login.web;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import hello.login.web.session.SessionManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;
    private final SessionManager sessionManager;

    //@GetMapping("/")
    public String home() {
        return "home";
    }

    //@GetMapping("/")
    public String homeLogin(@CookieValue(name="memberId", required = false) Long memberId, Model model, HttpServletRequest request) {

        log.info("@CookieValue 작동확인 -> memberId = {}", memberId);

        if(memberId == null) {
            log.info("로그인 아직 안했음");
            return "home";
        }

        //로그인
        Member loginMember = memberRepository.findById(memberId); //리포지토리에서 회원 검색
        if (loginMember == null) { //해당 회원 없으면 home 띄움
            log.info("로그인은 했는데 db에 해당 회원이 없음");
            return "home";
        }

        //로그인 성공시 model에 저장한 후 loginHome 띄움
        model.addAttribute("member", loginMember);
        log.info("로그인 성공!");
        return "loginHome";
    }

    //@GetMapping("/")
    public String homeLoginV2(Model model, HttpServletRequest request) {

        //세션 관리자에 저장된 회원 정보 조회
        Member member = (Member)sessionManager.getSession(request); //getSession은 Object를 반환하기 때문에 Member으로 캐스팅한다.

        //로그인
        if (member == null) { //해당 회원 없으면 home 띄움
            return "home";
        }

        //로그인 성공시 model에 저장한 후 loginHome 띄움
        model.addAttribute("member", member);
        return "loginHome";
    }

    //@GetMapping("/")
    public String homeLoginV3(Model model, HttpServletRequest request) {

        HttpSession session = request.getSession(false);//true로 하면 로그인하지 않은 사람도 페이지에 접근하는 순간 세션이 만들어짐.

        if (session == null) {
            return "home";
        }

        Member loginMember = (Member)session.getAttribute(SessionConst.LOGIN_MEMBER); //object 타입 반환하기 때문에 Member로 캐스팅

        //세션에 회원 데이터가 없으면 home
        if (loginMember == null) { //해당 회원 없으면 home 띄움
            return "home";
        }

        //로그인 성공시 model에 저장한 후 loginHome 띄움
        model.addAttribute("member", loginMember);
        return "loginHome";
    }

    @GetMapping("/")
    public String homeLoginV3Spring(
            @SessionAttribute(name=SessionConst.LOGIN_MEMBER, required = false) Member loginMember,
            Model model
    ) {

        //세션에 회원 데이터가 없으면 home
        if (loginMember == null) { //해당 회원 없으면 home 띄움
            return "home";
        }

        //로그인 성공시 model에 저장한 후 loginHome 띄움
        model.addAttribute("member", loginMember);
        return "loginHome";
    }

}