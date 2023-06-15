package ch06_배열;

import java.util.Arrays;

public class ex02_배열2 {
	public static void main(String[] args) {
//		배열
//		같은 타입의 여러 변수를 하나의 묶음으로 다루는 것

//		선언
//		타입[] 변수이름. ex) int[] scores;
//		타입 변수이름[]; ex) int scores[];

//		생성
//		변수이름 = new 타입[길이];	
//		ex) scores = new int[10]; 길이가 10인 int 배열 생성

//		배열의 인덱스
//		인덱스의 범위는 0부터 길이-1까지

//		배열 길이 확장하는 방법
//		1. 더 큰 배열을 새로 만든다.
//		2. 기존의 배열 내용을 새로운 배열에 복사한다

		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = { 100, 95, 80, 70, 60 };
		char[] chArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
		}

		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1; // 1~10의 값을 배열에 저장
		}

		// 배열에 저장된 값들을 출력한다.
		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		System.out.println();

		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
//		예외적으로 char 배열은 println으로 출력하면 각 요소가 구분자 없이 그대로 출력됨
		System.out.println(chArr);
	}

}
