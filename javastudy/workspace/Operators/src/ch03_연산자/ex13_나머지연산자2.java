package ch03_연산자;

public class ex13_나머지연산자2 {
	public static void main(String[] args) {
		// 나누는 수의 부호 무시
		// 나누어지는 수의 부호만 보면 됨
		System.out.println(-10 % 8);	
		System.out.println(10 % -8);
		System.out.println(-10 % -8);
	}
}
