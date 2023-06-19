package ch07_2클래스와객체;

import java.util.Scanner;

public class ex01_클래스 {
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
		
		Tv t; // Tv인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv(); // Tv인스턴스를 생성한다.
		t.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
	}

}

class Tv {
	// Tv의 속성(멤버변수)
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; // 채널

	// Tv의 기능(메서드)
	void power() {
		power = !power;
	} // TV를 켜거나 끄는 기능을 하는 메서드

	void channelUp() {
		++channel;
	} // TV의 채널을 높이는 기능을 하는 메서드

	void channelDown() {
		--channel;
	} // TV의 채널을 낮추는 기능을 하는 메서드
}