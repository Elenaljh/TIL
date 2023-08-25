package hello.login.web;

public interface SessionConst {
    String LOGIN_MEMBER = "loginMember";
    //public static final String LOGIN_MEMBER = "loginMember"; //만약 그냥 class로 만들 경우에는 이렇게 쓴다.
    //SessionConst는 앞으로 new를 이용해 객체를 만드려는 클래스가 아니다. 따라서 abstract를 넣어서 추상 클래스로 만들거나
    //아예 interface로 만드는 것이 좋다. (interface는 다 public이다)
}
