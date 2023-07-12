package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller //컨트롤러는 어쩔 수 없음. 컴포넌트 스캔으로 컨테이너에 등록해야 함
public class MemberController {
    private final MemberService memberService;
    @Autowired //컨트롤러는 컴포넌트 스캔 방식이므로 autowired를 사용해서 다른 빈과 연결
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value = "/members/new") //회원가입 누르면 localhost:8080/members/new 페이지로 이동하게 함
    public String createForm() {
        return "members/createMemberForm"; //members파일의 createMemberForm.html을 띄운다.
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) { //create메서드가 실행됨. MemberForm.java로 가보자
        Member member = new Member(); //member 객체를 만든다.
        member.setName(form.getName()); //form에서 private field인 name을 getName으로 꺼내서 setName을 통해 member객체의 이름으로 정해준다.

        memberService.join(member); //중복회원인지 검증한 후 member객체를 memberRepository에 저장한다.

        return "redirect:/"; //회원가입이 끝나면 홈 화면으로 보내버린다.
    }

    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}
