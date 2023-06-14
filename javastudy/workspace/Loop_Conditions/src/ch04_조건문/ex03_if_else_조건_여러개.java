package ch04_조건문;

import java.util.Scanner;

public class ex03_if_else_조건_여러개 {
	public static void main(String[] args) {
//		if문은 조건식의 논리 값에 따라 실행 여부를 결정함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		String input = sc.nextLine();
		
		int score = Integer.parseInt(input);
		
//		if문의 로직은 위에서부터 검사함
//		만약에 90점 이상이면 그 아래 else if의 조건들은 확인하지 않음
//		즉 순서를 바꿔쓰면 예상치 못한 결과가 나옴
		if (score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else if(score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
