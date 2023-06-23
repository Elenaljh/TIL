package ch11_컬렉션_프레임워크;

import java.util.*;

public class ex14_HashSet_객체_hashcode {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));

		System.out.println(set);
	}
}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) { //equals 오버라이딩
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}

		return false;
	}

	public int hashCode() {
		return Objects.hash(name, age);
	} //hashcode 오버라이딩

	public String toString() {
		return name +":"+ age;
	}
}