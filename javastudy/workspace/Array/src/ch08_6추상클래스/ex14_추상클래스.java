package ch08.ch08_6추상클래스;

public class ex14_추상클래스 {
	public static void main(String args[]) {
//		추상클래스
//		한 개 이상의 추상 메서드를 가진 클래스
//		객체를 만들 수 없음
//		이용하려면 하위 클래스가 필요

//		추상 메서드
//		구현이 안된 메서드
//		하위 클래스에서 구현이 되어야 함
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.cry();
		dog.cry();
	}
}

abstract class Animal {
	abstract void cry();
	
	void run() {
		System.out.println("run!!!!!!!!!!");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}