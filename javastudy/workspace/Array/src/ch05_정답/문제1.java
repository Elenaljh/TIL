package ch05_반복문.문제;
import java.util.Scanner;

public class 문제1 {
	/*
	 * 1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 총 합
	 * 2의 배수가 아니면서 3의 배수가 아닌 수의 총 합.
	 * output: 73
	 */
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) // i가 2의 배수가 아니면서 3의 배수가 아닐때만 더함
				sum += i;
		}
		System.out.println(sum);

	}
}
