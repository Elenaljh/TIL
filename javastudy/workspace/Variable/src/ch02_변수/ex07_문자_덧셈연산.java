package ch02_변수;

public class ex07_문자_덧셈연산 {
	public static void main(String[] args) {
		String name = "Ja" + "va";	// 문자끼리 덧셈은 이어쓰기
		String str = name + 8.0;	// 문자열 + 실수는 실수형이 문자로 바뀌어서 저장됨  

		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
}
