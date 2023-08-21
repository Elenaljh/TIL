package hello.itemservice.domain;

import lombok.Data;

@Data //@Data는 핵심 도메인에 사용하기에는 너무 위험하다(접근권한때문?) 보통은 @Getter, @Setter정도만 사용
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
