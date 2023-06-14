package ch05_반복문;

import java.util.Scanner;

public class ex04_while문 {
	public static void main(String[] args) {
//		while문
//		while(조건식)의 형태로 이루어짐
//		조건식이 참이면 반복. 아니면 수행하지 않음
		
		int cnt = 10;
		
		while(cnt-- > 0) { //비교 먼저 하고 cnt에서 1을 뺌
			System.out.println(cnt);
		}
			
		System.out.println("반복문 이후");
	}

}
