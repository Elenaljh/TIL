package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex04_priority_queue {
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);  
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);

		System.out.println(pq); // pq의 내부 배열을 출력

		Object obj = null;

		// PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
		while((obj = pq.poll())!=null) // 비어있으면 null 나오기 때문에
			System.out.println(obj);
	}
}
