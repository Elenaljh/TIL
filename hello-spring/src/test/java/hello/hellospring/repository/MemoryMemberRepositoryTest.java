package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;


public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();
    // 테스트주도개발(TDD): 테스트를 먼저 만들고 구현클래스 만들기
    // 지금 우리가 한거: 구현클래스 먼저 만들고 테스트 돌림
    // 테스트 관련해서는 꼭 깊이있게 공부하길 바람! (협업할때 매우 중요)

    @AfterEach //콜백메서드: 각 메서드가 끝날때마다 호출되어 작동
    public void afterEach() {
        repository.clearStore();
    } //만드는이유: 클래스 전체를 테스트돌려봤을 때 findAll()과 findByName()에서 만든 데이터가 겹쳐서 오류남
    //각 메서드를 테스트한 후 메모리를 비워주면 위의 오류는 안생긴다.
    //각 테스트는 다른 테스트와 의존관계 없이 독립적으로 실행되어야한다.(중요)

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        assertThat(member).isEqualTo(result); //static import: line4

    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }

}
