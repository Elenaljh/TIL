package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//동시성 문제가 고려되어있지 않음. 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
public class MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository(); //싱글톤 인스턴스 만든다(?) - static 사용하면 됨ㅇㅇ

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository() {}

    public Member save(Member member) {
        member.setId(++sequence);  //id 생성
        store.put(member.getId(), member);  //member id(key)와 member객체(value) map에 저장
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values()); //store에 있는 값들을 꺼내서 ArrayList에 담아서 반환한다.
        //이렇게 하는 이유는 반환된 List를 조작해도 store의 데이터에 영향이 가지 않기 때문이다 (store 보호하기 위함)
    }

    public void clearStore() {
        store.clear();
    }
}
