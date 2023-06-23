package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex10_HashSet {
	public static void main(String[] args) {
		Object[] objArr = { "1", 1, "2", "2", "3", "3", "4", "4", "4" };	// "1"과 1은 다름
		Set set = new HashSet();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장한다.
		}
		// HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);
	}
}
