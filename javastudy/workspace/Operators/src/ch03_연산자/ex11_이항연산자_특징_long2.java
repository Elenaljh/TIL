package ch03_연산자;

public class ex11_이항연산자_특징_long2 {
	public static void main(String args[]) { 
		long a = 1000000 * 1000000;
		long b = 1000000 * 1000000L;	// long * int -> long * long -> long. 값 손실 없음

		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
