package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import net.bytebuddy.asm.MemberAttributeExtension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    //테스트 돌릴때 메모리 비워줘야함. 메모리 관리를 하기 위해 MemoryMemberRepository불러오자
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository); //Dependency Injection
    }

    @AfterEach //콜백메서드: 각 메서드가 끝날때마다 호출되어 작동
    public void afterEach() {
        memberRepository.clearStore();
    } //만드는이유: 클래스 전체를 테스트돌려봤을 때 findAll()과 findByName()에서 만든 데이터가 겹쳐서 오류남
    //각 메서드를 테스트한 후 메모리를 비워주면 위의 오류는 안생긴다.
    //각 테스트는 다른 테스트와 의존관계 없이 독립적으로 실행되어야한다.(중요)

    @Test
    void 회원가입_join() { //테스트명은 과감하게 한글로 써도 된다., 정상적으로 기능하는지 확인은 하는데 중복회원이 존재하는 예외적 상황을 검증하지는 못함
        //1. given😊
        Member member = new Member();
        member.setName("Hello");
        //2.when😊
        Long saveId = memberService.join(member); //member을 repository에 저장하고 id 반환
        //3.then😊
        Member findMember = memberService.findOne(saveId).get(); // get()으로 optional 벗겨내서 member를 받아냄
        //memberService.findOne(saveId).get(); + ctrl+alt+V (= introduce variable)
        assertThat(member.getName()).isEqualTo(findMember.getName()); //import static 쉽게하는법, Assertions: asserj를 import해야함
        //alt+Enter -> static 어쩌고 클릭
    }

    @Test //중복회원정보 받았을때 예외 잘 터뜨리는지 확인 (중요함)
    public void 중복_회원_예외() {
        //1. given😊
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring"); //동명이인 만들었음

        //2. when😊
        memberService.join(member1);
//        try {
//            memberService.join(member2); //동명이인을 join함 -> 오류가 터져야함
//            fail();
//        } catch (IllegalStateException e) {
//            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다."); //중복회원 감지했을 때 오류메세지 정상적으로 내보내는지 테스트
//        } //try-catch보다 더 좋은 문법이 있음
        assertThrows(IllegalStateException.class, () -> memberService.join(member2));//try-catch보다 더 좋은 문법
        // () -> memberService.join(member2) 로직을 실행했을 때 IllegalStateExeption이라는 예외가 나오는지 테스트하는 메소드임.
        // 코드 리팩토링(?): ctrl+alt+V
        // join메서드에 member2집어넣었을 때 IllegalStateException 나오면 성공.

        // 이제 에러 문구도 잘 나오는지 테스트해보자
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

        //3. then😊

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}