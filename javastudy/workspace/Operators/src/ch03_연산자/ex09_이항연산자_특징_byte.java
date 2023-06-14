package ch03_연산자;

public class ex09_이항연산자_특징_byte {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);	// byte + byte - > int * int -> int 로 변환됨
		System.out.println(c);	// 300이 byte의 범위를 넘어가기 때문에 데이터 손실이 발생하여 44가 저장됨
	}
}
