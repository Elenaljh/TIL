package hello.jdbc.service;

import hello.jdbc.domain.Member;
import hello.jdbc.repository.MemberRepositoyV0;
import hello.jdbc.repository.MemberRepositoyV1;
import lombok.RequiredArgsConstructor;

import java.sql.SQLException;

@RequiredArgsConstructor
public class MemberServiceV1 {
    
    private final MemberRepositoyV1 memberRepositoy;
    
    public void accountTransfer(String fromId, String toId, int money) throws SQLException {
        Member fromMember = memberRepositoy.findById(fromId);
        Member toMember = memberRepositoy.findById(toId);
        
        memberRepositoy.update(fromId, fromMember.getMoney() - money);
        validation(toMember);
        memberRepositoy.update(toId, fromMember.getMoney() + money);
        
    }

    private static void validation(Member toMember) {
        if (toMember.getMemberId().equals("ex")) {
            throw new IllegalStateException("이체중 예외 발생");
        }
    }
}
