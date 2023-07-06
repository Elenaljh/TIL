package hello.hellospring.service;

import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.domain.Member;
import java.util.List;

import java.util.Optional;

//Service는 비즈니스와 비슷한 용어를 쓰고 Repository는 보다 개발에 초점을 맞춘 용어를 쓴다.
public class MemberService { //테스트 간편하게 하기: 클래스명에 커서 두고 ctrl+shift+t -> JUnit 선택...
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository; //memberRepository를 내가 직접 new를 통해 생성하는게 아니라 이
        // 함수를 통해 외부에서 넣어주게 만든다.
    }

   //회원가입
    //1트
//    public Long join(Member member) {
//        //같은 이름이 있는 중복회원X
//        Optional<Member> result = memberRepository.findByName(member.getName());
            //Ctrl+Alt+V: extract -> introduce variables shortcut
//        result.ifPresent(m -> {
//            throw new IllegalStateException("이미 존재하는 회원입니다.");
//        });
        // 값이 null일 가능성이 있으면 일단 optional로 감싼다. 그러면 여러 메소드를 쓸 수 있다.
        // optional을 까고 싶으면 .get()으로 깐다. 권장하지는 않는다.
        // optional에서 ifPresent: https://sin0824.tistory.com/25 참고
        // 근데 위와 같이 쓰면 좀 더러워보여서 optional 쓸때는 보통 아래처럼 쓴다.

    //2트
//    public Long join(Member member) {
//        //같은 이름이 있는 중복회원X
//        memberRepository.findByName(member.getName()) //이 결과는 Optional임. 왜냐면 findByName이 Optional을 반환하기 때문
//            .ifPresent(m -> {         //ifPresent(): optional 클래스의 메서드임
//                throw new IllegalStateException("이미 존재하는 회원입니다.");
//             });
        // 이 코드도 좀 더러워보임. (Ctrl+Alt+Shift+T)Refactor -> Extract Method(Ctrl+Alt+M) -> validateDuplicateMember로 바꾸기

    //3트
    public Long join(Member member) {
        //같은 이름이 있는 중복회원X
        validateDuplicateMember(member); //중복 회원 검증
        memberRepository.save(member); //검증 통과하면 저장
        return member.getId();
    }

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
