package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex07_Arrays {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][]	arr2D = {{11,12,13}, {21,22,23}};
		
		System.out.println("배열 출력 메서드");
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
		System.out.println();

		int[] arr2 = Arrays.copyOf(arr, arr.length);	
		int[] arr3 = Arrays.copyOf(arr, 3);          
		int[] arr4 = Arrays.copyOf(arr, 7);		// 원본 배열의 길이를 넘어가면 0으로 채움
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);  
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);  // 원본 배열의 길이를 넘어가면 0으로 채움
		System.out.println("배열 복사");
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		System.out.println();
		
		int[] arr7 = new int[5];
		System.out.println("fill");
		Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]
		System.out.println("arr7="+Arrays.toString(arr7));
		System.out.println();

		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println("배열 비교");
		System.out.println(Arrays.equals(str2D, str2D2));     // false. 배열에 저장된 배열의 주소를 비교하기 때문에
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true. 다차원 배열은 deepEquals 이용.
		System.out.println();
	}
}
