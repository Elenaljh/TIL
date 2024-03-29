package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberSaveControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        //파라미터 값 가져오기
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        //멤버 생성, 리포지토리에 저장
        Member member = new Member(username, age);
        memberRepository.save(member);

        //model에 member 저장 후 논리이름 반환
        model.put("member", member);
        return "save-result";
    }
}
