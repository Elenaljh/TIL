package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex05_iterator {
	public static void main(String[] args) {
		Collection<String> list = new ArrayList<>();	// 다른 컬랙션 객체를 사용할 수 있음
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	} 
}
