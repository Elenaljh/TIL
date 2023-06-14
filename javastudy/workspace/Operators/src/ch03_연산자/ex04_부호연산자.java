package ch03_연산자;

public class ex04_부호연산자 {
	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);	// -10 * 1인 -10을 출력

		i = -10;
		i = -i;
		System.out.println(i);	// -10 * (-1)인 10을 출력
	}
}
