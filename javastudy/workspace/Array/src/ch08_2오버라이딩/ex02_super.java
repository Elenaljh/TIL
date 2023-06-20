package ch08.ch08_2오버라이딩;

public class ex02_super {
	public static void main(String args[]) {
//		super
//		자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조 변수
//		상속받은 멤버와 자신의 클래스에 정의된 멤버의 이름이 같을 때 super를 붙여서 구분함
//		상속받은 멤버도 this로 접근이 가능하기 때문에 멤버가 중복 정의되어 서로 구별해야 하는 경우에만 super를 사용하는 것을 권장

		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x = 10;	// 부모의 x 값은 10
}

class Child extends Parent {
	int x = 20;	// 자식의 x 값은 20

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}