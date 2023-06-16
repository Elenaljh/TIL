package ch06_배열.문제;

import java.util.Arrays;
import java.util.Scanner;

public class 문제1 {
	/*
	 * 배열 arr에 5개의 정수를 입력받고 합을 구하여라.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];

		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]에 들어갈 값을 입력하시요 > ", i);
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
//		int sum = 0;
//		
//		for(int x: arr) {
//			sum += x;
//		}
//		
//		System.out.println(sum);
	}
}
