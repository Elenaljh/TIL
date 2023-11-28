package hello.jdbc.service;

import hello.jdbc.domain.Member;
import hello.jdbc.repository.MemberRepositoyV2;
import hello.jdbc.repository.MemberRepositoyV3;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 트랜잭션 - 트랜잭션 매니저
 */
@Slf4j
@RequiredArgsConstructor
public class MemberServiceV3_1 {

//    private final DataSource dataSource;
    private final PlatformTransactionManager transactionManager; //구현체는 따로 주입받아야 함
    private final MemberRepositoyV3 memberRepository;
    
    public void accountTransfer(String fromId, String toId, int money) throws SQLException {
        //트랜잭션 시작
        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
        //트랜잭션 매니저가 datasource를 알고 있기 때문에 커넥션 얻고 트랜잭션 시작함 (setAutoCommit(false)도 함)
        //그리고 트랜잭션 동기화 매니저에 커넥션 저장함. 그리고 나서 비즈니스 로직이 시작됨.

        try {
            //비즈니스 로직
            bizLogic(fromId, toId, money); //connection 넘길 필요 없어서 파라미터에서 con 제거
            transactionManager.commit(status);  //로직 성공시 커밋

        } catch (Exception e) {
            transactionManager.rollback(status);  //실패시 롤백
            throw new IllegalStateException(e);
        }
        
    }

    private void bizLogic(String fromId, String toId, int money) throws SQLException {
        Member fromMember = memberRepository.findById(fromId);
        Member toMember = memberRepository.findById(toId);

        memberRepository.update(fromId, fromMember.getMoney() - money);
        validation(toMember); //중간에 예외 터지면 커밋하기 전에 catch 구문으로 간다.
        memberRepository.update(toId, fromMember.getMoney() + money);
    }

    private static void release(Connection con) {
        if (con != null) {
            try {
                con.setAutoCommit(true); //커넥션을 반환하기 전에 오토커밋 켜기
                con.close();
            } catch (Exception e) {
                log.error("error", e);
            }
        }
    }

    private static void validation(Member toMember) {
        if (toMember.getMemberId().equals("ex")) {
            throw new IllegalStateException("이체중 예외 발생");
        }
    }
}
