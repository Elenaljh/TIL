package ch05_반복문;

import java.util.Scanner;

public class ex09_break_continue {
	public static void main(String[] args) {
//		while문
//		while(조건식)의 형태로 이루어짐
//		조건식이 참이면 반복. 아니면 수행하지 않음

		int cnt = 0;

//		조건식에 true를 넣으면 항상 참이기 때문에 무한루프가 돌게 됨
		while (true) {
//			cnt 값이 짝수이면 아래 로직은 무시
			if (++cnt % 2 == 0) {
				continue;
			}

//			cnt 값이 10보다 커지면 반복문 탈출
			if (cnt > 10) {
				System.out.println("반복문 탈출!");
				break;
			}

			System.out.println(cnt);

		} // end of while
	}

}
