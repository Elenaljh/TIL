package ch07.ch07_3변수와메서드;

public class ex10_재귀함수_팩토리얼 {
	public static void main(String args[]) {
		System.out.println(factorial(4)); // FactorialTest.factorial(4)
	}

	static long factorial(int n) {
		long result = 0;

		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1); // 메서드 자신을 호출한다.
		}
		
		return result;
	}
}