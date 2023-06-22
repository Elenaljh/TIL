package ch10_lang패키지;

public class ex02_equals2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if (p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
	}
}

class Person {
	long id;

	public boolean equals(Object obj) {
		if (obj instanceof Person)
			return this.id == ((Person) obj).id;
		else
			return false;
	}

	Person(long id) {
		this.id = id;
	}
}