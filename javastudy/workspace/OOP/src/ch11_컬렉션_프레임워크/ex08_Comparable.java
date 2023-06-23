package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex08_Comparable {
	public static void main(String[] args) {

		ArrayList<User> list = new ArrayList<>();
		list.add(new User("김자바", "KimJava"));
		list.add(new User("이자바", "LeeJava"));
		list.add(new User("배자바", "BaeJava"));
		list.add(new User("홍자바", "HongJava"));
		list.add(new User("을자바", "EulJava"));
		
		System.out.println("a".compareTo("b"));		// -1. 교환이 이루어지지 않음
		
		Collections.sort(list); // compareTo()를 이용하여 정렬한다

		for (int i = 0; i < list.size(); i++) {
			System.out.println(((User) list.get(i)).getEngName());
		}
	}
}

class User implements Comparable<User> {
	String name;
	String engName;

	public User(String name, String engName) {
		this.name = name;
		this.engName = engName;
	}

	public String getName() {
		return name;
	}

	public String getEngName() {
		return engName;
	}

	@Override
	public int compareTo(User user) {
		return this.engName.compareTo(user.engName);	// 사전순 정렬 
	}
}