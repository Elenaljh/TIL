package ch03_연산자;

public class ex07_산술연산자 {
	public static void main(String[] args) {
//		산술 연산자
//		산술 연산자는 덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/), 나머지 계산(%)이 있다
//		산술연산의 우선순위는 사칙연산과 같다.
//		기본적으로 같은 우선순위일 경우 왼쪽에서 오른쪽으로 연산한다.
//		흔히 생각하는 사칙연산처럼 소괄호()를 이용하여 우선순위를 변경할 수 있다.

		int a = 13;
		int b = 4;
		
//		덧셈
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a + b = " + (a + b));
		
//		뺄셈
		System.out.println("a - b = " + (a - b));
		
//		곱셈
		System.out.println("a * b = " + (a * b));
		
//		나눗셈
//		정수(int)끼리 나눗셈을 하면 나머지는 버리고 몫만 남음. 즉 소수점 이하를 버림.
		System.out.println("a / b = " + (a / b));
		
	}
}
