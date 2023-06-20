package ch08.ch08_5다형성;

public class ex10_참조변수_형변환 {
	public static void main(String args[]) {
//		다형성
//		조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 만듬
		
//		조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다
//		자손타입의 참조변수로 조상타입의 인스턴스는 참조 불가능
		
//		참조변수의 형변환
//		서로 상속관계에 있는 클래스 사이에서 형 변환 가능. 
//		자손 -> 조상(up-casting): 형변환 생략 가능
//		조상 -> 자손 (down-casting): 형변환 생략 불가능
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;    // car = (Car)fe;에서 형변환이 생략됨
//		car.water();
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가
		fe2.water();
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}