package ch08.ch08_2오버라이딩;

public class ex03_super2 {
	public static void main(String args[]) {
		Child2 c = new Child2();
		c.method();
	}
}
class Parent2 { int x=10; }

class Child2 extends Parent2 {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);	// 자식에는 x 값이 없지만 부모의 x를 물려받음
		System.out.println("super.x="+ super.x);
	}
}