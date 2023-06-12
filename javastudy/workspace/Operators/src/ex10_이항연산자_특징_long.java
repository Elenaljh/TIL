package ch03_연산자;

public class ex10_이항연산자_특징_long {
	public static void main(String args[]) { 
		int a = 1000000;    // 1,000,000   1백만 
		int b = 2000000;    // 2,000,000   2백만 
//		int타입과 int 타입의 연산결과는 int타입
//		이미 범위가 넘어간 상태에서 long타입에 저장되므로 원하는 값이 안나옴 
		long c = a * b;       // a * b = 2,000,000,000,000 ?

		System.out.println(c);
	}
}
