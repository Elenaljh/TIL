package ch07_2클래스와객체;

import java.util.Scanner;

public class ex02_클래스2 {
	public static void main(String args[]) {
//		클래스 = 객체를 정의해 놓은 것. 객체의 설계도(틀) 
//		클래스는 객체를 생성하는데 사용
		
//		객체 = 실제로 존재하는 것. 사물, 개념
//		유형객체. 책상, 의자, 자동차, TV같은 사물들
//		무형객체. 수학공식, 개념
		
//		인스턴스(instance)
//		클래스로부터 만들어진 객체. 하나의 예시라고 생각하면 됨.
		
//		객체의 구성요소
//		속성: 멤버변수
//		기능: 메서드
		
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

		t1.channel = 7;    // channel 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}

}
