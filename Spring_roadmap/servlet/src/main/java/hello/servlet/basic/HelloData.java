package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter //롬복 쓰면 getter, setter 함수 따로 쓰지 않아도 됨
public class HelloData {
    private String username;
    private int age;
}
