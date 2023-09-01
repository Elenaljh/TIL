package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

//junit5부터는 클래스 앞에 public 없어도 된다
class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance(); //static으로 고정했던 객체이므로 new로 새로 생성 불가.
    // 그냥 getInstance로 불러오면 된다. 싱글톤 비스무리한 느낌

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save() {
        //given (주어진 상황)
        Member member = new Member("hello", 20);

        //when (실행)
        Member savedMember = memberRepository.save(member);
        //then (결과)
        Member findMember = memberRepository.findById(savedMember.getId());
        assertThat(findMember).isEqualTo(savedMember);
    }

    @Test
    void findAll() {
        //given
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 30);

        memberRepository.save(member1);
        memberRepository.save(member2);

        //when
        List<Member> result = memberRepository.findAll();

        //then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(member1, member2);
    }
}
