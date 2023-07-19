package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    //4트시 삭제: private final MemberRepository memberRepository = new MemoryMemberRepository();

    //1트: private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); //정액할인
    //2트: private final DiscountPolicy discountPolicy = new RateDiscountPolicy(); //정률할인 (OCP, DIP 위반)
    //3트: private DiscountPolicy discountPolicy; //NullPointerException 발생 -> 어떻게 문제해결?
    //누군가 클라이언트인 OrderServiceImpl에 DiscountPolicy의 구현체를 대신 생성하고 주입해줘야 함
    // → AppConfig 생성(구현객체 생성, 연결 담당)

    //4트: 생성자
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
