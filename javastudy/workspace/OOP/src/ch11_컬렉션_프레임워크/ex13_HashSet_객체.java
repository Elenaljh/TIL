package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex13_HashSet_객체 {
	public static void main(String[] args) {
		HashSet set = new HashSet(); //모든 타입을 받음

		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10)); //new로 만듦
		set.add(new Person("David",10)); //new로 만듦

		System.out.println(set);	// David가 두개 나옴 - 둘 다 주소값이 다르기 때문에 다른 객체로 인식했기 때문
		//해결방법:
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name +":"+ age;
	}
}