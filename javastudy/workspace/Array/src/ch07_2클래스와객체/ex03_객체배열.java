package ch07.ch07_2클래스와객체;

import java.util.Scanner;

public class ex03_객체배열 {
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
		
		Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열

		// Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for(int i=0; i < tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; // tvArr[i]의 channel에 i+10을 저장
		}

		for(int i=0; i < tvArr.length;i++) {
			tvArr[i].channelUp();  // tvArr[i]의 메서드를 호출. 채널이 1증가
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}

}
