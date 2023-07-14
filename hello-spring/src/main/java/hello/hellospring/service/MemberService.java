package hello.hellospring.service;

import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import java.util.Optional;

@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository; //memberRepository를 내가 직접 new를 통해 생성하는게 아니라 이
        // 함수를 통해 외부에서 넣어주게 만든다.
    }

    // 회원가입
    public Long join(Member member) {
            validateDuplicateMember(member); //중복 회원 검증
            memberRepository.save(member); //검증 통과하면 저장
            return member.getId();
    }

    // 중복확인
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> { //ifPresent(): optional 클래스의 메서드임
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }


    //전체 회원 조회
    public List<Member> findMembers() {
            return memberRepository.findAll();
    } //findAll()이 List를 반환하기 때문임

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    } //findById()가 Optional을 반환하기 때문임

}
