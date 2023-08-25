package hello.login.web;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;

    //@GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/")
    public String homeLogin(
            @CookieValue(name="memberId", required = false) Long memberId, Model model, HttpServletRequest request) {

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
}