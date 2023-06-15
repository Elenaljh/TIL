package ch06_배열;

import java.util.Arrays;

public class ex03_배열의복사 {
public static void main(String[] args) {
		
		int[] arr = new int[5];

		// 배열 arr에 1~5를 저장한다.
		for(int i=0; i < arr.length;i++) 
			arr[i] = i + 1;

		System.out.println("arr: " + Arrays.toString(arr));
		
		int[] arr2 = new int[arr.length];	// 복사해서 값을 넣을 배열
		System.arraycopy(arr, 0, arr2 , 0, arr.length);
		
		System.out.println("arr2: " + Arrays.toString(arr2));
	}

}
