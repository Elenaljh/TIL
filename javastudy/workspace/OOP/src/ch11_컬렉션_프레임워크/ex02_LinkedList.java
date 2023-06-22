package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex02_LinkedList {
	public static void main(String[] args) {
//		컬렉션 프레임워크
//      데이터 군을 저장하는 클래스들을 표준화한 설계
//		컬렉션은 데이터 그룹. 프레임워크는 표준화된 프로그래밍 방식을 의미

//		List 인터페이스
//		중복을 허용 하면서 저장 순서가 유지되는 컬렉션

		List list1 = new LinkedList(); // 리스트 선언

		// 리스트에 값 저장
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		// list1의 1번 원소부터 3번 원소까지 저장
		List list2 = new LinkedList(list1.subList(1, 4));
		print(list1, list2);

		Collections.sort(list1); // list1과 list2를 정렬한다.
		Collections.sort(list2); // Collections.sort(List l)
		print(list1, list2);
		// list1은 list2의 모든 원소를 포함하고 있는가?
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		// list1에서 list2에 포함된 객체들을 삭제한다.
//		인덱스를 뒤에서부터 돌려야 삭제에 영향을 받지 않음
		for (int i = list1.size() - 1; i >= 0; i--) {
			if (list2.contains(list1.get(i)))
				list1.remove(i);
		}
		print(list1, list2);
	}

	static void print(List list1, List list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}

}
