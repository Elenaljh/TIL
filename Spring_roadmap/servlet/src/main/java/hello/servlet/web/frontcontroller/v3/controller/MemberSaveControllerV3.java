package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {
    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public ModelView process(Map<String, String> paramMap) {
        //Map에서 파라미터 정보 가져옴
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        //새로운 멤버객체 생성 후 리포지토리에 저장
        Member member = new Member(username, age);
        memberRepository.save(member);

        //ModelView 객체 만들고 앞에서 만든 멤버 객체 집어넣은 후 반환
        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;
    }
}
