package ch05_반복문;

import java.util.Scanner;

public class ex03_중첩for문 {
	public static void main(String[] args) {
//		for문
//		반복 횟수를 알고 있을 때 적합함
//		for(초기화; 조건식; 증감식) 으로 구성되어 있음
//		만약 초기화 하는 경우에 둘 이상의 변수가 필요하면 콤마','로 구분하여 사용할 수 있음
		
		Scanner sc = new Scanner(System.in);
		System.out.print("별을 출력할 라인 수를 입력하세요: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
