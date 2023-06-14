package ch04_조건문;

import java.util.Scanner;

public class ex02_if_else문 {
	public static void main(String[] args) {
//		if문은 조건식의 논리 값에 따라 실행 여부를 결정함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		String input = sc.nextLine();
		int score = Integer.parseInt(input);
		
//		점수가 60 이상이면 실행
		if(score >= 60) {
			System.out.println("합격 입니다.");
		} else {	// 그 외의 경우 실행
			System.out.println("불합격 입니다.");
		}
	}

}
