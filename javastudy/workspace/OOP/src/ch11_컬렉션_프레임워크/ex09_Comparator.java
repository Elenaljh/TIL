package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex09_Comparator {
	public static void main(String[] args) {
		String[] strArr = { "cat", "Dog", "duck", "tiger" };

		Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); // 역순 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator<String> {
	public int compare(String o1, String o2) {
			String c1 = o1;
			String c2 = o2;
			return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경한다.
											// 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
	}
}
