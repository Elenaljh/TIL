package hello.servlet.web.frontcontroller.v2.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v2.ControllerV2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSaveControllerV2 implements ControllerV2 {
    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //parameter로 들어온 정보 파싱
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        //member 객체 생성 후 리포지토리에 저장
        Member member = new Member(username, age);
        memberRepository.save(member);

        //Model에 데이터를 보관한다
        request.setAttribute("member", member); //request객체 내부 저장소(Map)에 member가 저장됨

        //view가 jsp로 넘어감
        return new MyView("/WEB-INF/views/save-result.jsp");
    }
}
