package hello.itemservice.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>(); //static 사용 주의, 실제로는 해시맵 쓰지마
    //동시에 여러 쓰레드가 접근하면 concurrentHashMap, atomicLong 등을 사용해야 한다.
    private static long sequence = 0L; //static 주의

    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }

    public List<Item> findAll() {
        return new ArrayList<>(store.values()); //한번 arraylist로 감싸서 반환. 나중에 arraylist에 장난질쳐도 실제 store.values에 영향없게
    }

    public void update(Long itemId, Item updateParam) {
        //이 메서드에서는 id를 사용하지 않음. 이럴거면 Itemname, price, quantity만 있는 클래스를 하나 더 만들어야함
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }

    public void clearStore() {
        store.clear();
    }
}
