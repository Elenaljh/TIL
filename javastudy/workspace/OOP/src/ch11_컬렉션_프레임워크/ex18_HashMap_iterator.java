package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex18_HashMap_iterator {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);

		Set set = map.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
		}

		set = map.keySet(); //이게 제일 효율적임 - 일단 키만 가져와서 값은 get메서드로 읽는것
		System.out.println("참가자 명단 : " + set);

		Collection values = map.values();
		it = values.iterator();

		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}
}