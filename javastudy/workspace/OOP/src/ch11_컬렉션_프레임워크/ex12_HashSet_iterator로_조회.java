package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex12_HashSet_iterator로_조회 {
	public static void main(String[] args) {
		Set set = new HashSet();

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
