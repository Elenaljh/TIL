package ch03_연산자;

public class ex17_비트연산자 {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;

		System.out.printf("x = %d \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %d \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%d | %d = %d \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%d & %d = %d \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%d ^ %d = %d \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
	} // main의 끝

	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);

		return tmp.substring(tmp.length() - 32);
	}
}
