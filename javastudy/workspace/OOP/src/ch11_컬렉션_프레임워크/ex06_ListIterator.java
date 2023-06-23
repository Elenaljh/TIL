package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex06_ListIterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		ListIterator<String> it = list.listIterator();

		while(it.hasNext()) {
			System.out.print(it.next() + " "); // 순방향으로 진행하면서 읽어온다.
		}
		System.out.println();

		while(it.hasPrevious()) {
			System.out.print(it.previous()+ " "); // 역방향으로 진행하면서 읽어온다.
		}
		System.out.println();
	}
}
