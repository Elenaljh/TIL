package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements ControllerV4 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        //리포지토리 안 모든 객체를 찾아서 리스트에 저장
        List<Member> members = memberRepository.findAll();

        // model에 members 저장한다.
        model.put("members", members);

        //논리이름 반환
        return "members";
    }
}
