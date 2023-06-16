package ch06_배열.문제;

import java.util.Arrays;
import java.util.Scanner;

public class 문제2 {
	/*
	 * 0 ~ 9 사이의 숫자 10개를 입력받고 각 숫자의 개수를 카운팅하는 프로그램을 만들어라
	 * 
	 * ex)
	 * input
	 * 1
	 * 2
	 * 3
	 * 3
	 * 3
	 * 4
	 * 5
	 * 5
	 * 6
	 * 8
	 * 
	 * output
	 * 0:0개 1:1개 2:1개 3:3개 4:1개 5:2개 6:1개 7:0개 8:1개 9:0개
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i = 0; i < 10; i++) {
			int x = sc.nextInt();
			arr[x]++;
		}
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d:%d개 ", i, arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
