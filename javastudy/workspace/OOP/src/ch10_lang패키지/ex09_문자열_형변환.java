package ch10_lang패키지;

public class ex09_문자열_형변환 {
	public static void main(String[] args) {
		int x = 10;
		String s1 = x + "";	// any type + 문자열 = 문자열
		System.out.println(s1);
		
		String s2 = "132";
		int y = Integer.parseInt(s2);
		System.out.println(y + 1);	// y가 int형이기 때문에 132 + 1 = 133의 결과가 나와야 됨
	}
}
