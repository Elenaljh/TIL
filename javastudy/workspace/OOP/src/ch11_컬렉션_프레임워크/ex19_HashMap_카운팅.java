package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex19_HashMap_카운팅 {
	public static void main(String[] args) {
		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

		Map<String, Integer> map = new HashMap();

		for(int i=0; i < data.length; i++) {
//			if(map.containsKey(data[i])) {
//				int value = (int)map.get(data[i]);
//				map.put(data[i], value+1);  // 기존에 존재하는 키면 기존 값을 1증가
//			} else {
//				map.put(data[i], 1);	    // 긱존에 존재하지 않는 키는 값을 1로 저장
//			}
			int value = map.containsKey(data[i]) ? map.get(data[i]) + 1 : 1;
			map.put(data[i], value);
			
		}

		Iterator it = map.entrySet().iterator();	// entrySet은 키와 값 쌍을 가지는 Set

		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();	
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " : " + value );
		}
	} // main
}