package ch09_예외처리;

public class ex05_예외_발생과_catch블록 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4); // 실행되지 않는다.
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		} // try-catch의 끝
		System.out.println(6);
	}
}
