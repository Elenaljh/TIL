package ch08.ch08_7인터페이스;

public class ex15_인터페이스 {
	public static void main(String args[]) {
//		인터페이스
//		일종의 추상클래스

//		인터페이스의 제약사항
//		1. 모든 멤버변수는 public static final 이어야 하며 생략 가능
//		2. 모든 메서드는 public abstract 이며 생략 가능
		Cat c = new Cat();
		Dog d = new Dog();

		c.cry();
		d.cry();
	}
}

interface Animal {
	void cry();
}

class Cat implements Animal {
	public void cry() {
		System.out.println("냐옹냐옹!");
	}
}

class Dog implements Animal {
	public void cry() {
		System.out.println("멍멍!");
	}
}
