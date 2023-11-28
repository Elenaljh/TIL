package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@Slf4j
class MemberRepositoyV0Test {

    MemberRepositoyV0 repository = new MemberRepositoyV0();

    @Test
    void crud() throws SQLException {

        //save (create)
        Member member = new Member("memberV100", 10000);
        repository.save(member);

        //findById (read)
        Member findMember = repository.findById(member.getMemberId());
        log.info("findMember={}", findMember);
        assertThat(findMember).isEqualTo(member);
        //member과 findMember는 실질적으로 다른 객체인데 Equal to 하면 같게 나오는 이유는
        //Member.java가면 @Data를 썼는데, 이 안에 @EqualsAndHashCode가 있기 때문이다.
        //그럼 a.equals(b)를 했을 떄 필드값만 같으면 같은 객체라고 판단하게 된다.

        //update: money:10000 -> 20000
        repository.update(member.getMemberId(), 20000);
        Member updatedMember = repository.findById(member.getMemberId());
        //assertThat(updatedMember).isEqualTo(member);
        // updatedMember은 리포지토리에서 수정된 member, member은 그냥 리포지토리에 저장된적도 없던 객체
        assertThat(updatedMember.getMoney()).isEqualTo(20000);


        //delete
        repository.delete(member.getMemberId());
        assertThatThrownBy(() -> repository.findById(member.getMemberId()))
                .isInstanceOf(NoSuchElementException.class);
    }


}