package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository()); //이 로직을 호출해서 memberService를 스프링 컨테이너에 빈으로 등록함
        //이놈 생성자 괄호 안에 memberRepository 넣어주려면 MemberRepository도 컨테이너에 등록해야 함
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository(); //MemberRepository는 인터페이스. 인터페이스는 new로 객체생성X
        // 따라서 구현체인 MemoryMemberRepository를 생성함.
    }

    //스프링 작동할 때: 우선 memberService와 memberRepository를 스프링 빈으로 등록, 그리고 등록된 repository를
    // memberService 안에 넣어준다.
}
