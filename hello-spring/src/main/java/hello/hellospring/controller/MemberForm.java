package hello.hellospring.controller;

public class MemberForm {
    private String name; //이 name과 html파일의 name="name"이 매칭이 된다! //이 name에 사용자가 적은 이름이 저장된다.(정확히는 setName을 통해 값이 들어가게 됨)
    //private 필드이기 때문에 함부로 값 못넣음. setter을 통해서 값을 바꿔줄 수 있다.

    public String getName() { //getter
        return name;
    }

    public void setName(String name) { //setter
        this.name = name;
    }

}
