package ch03_연산자;

public class ex16_비교연산자_문자열 {
	public static void main(String[] args) {
//		문자열의 경우 큰따옴표로 선언한 경우와 new 객체를 이옹하여 선언한 경우에 따라 문자열 비교의 결과가 다르게 나타날 수 있음
//		자세한 내용은 String을 배울때 다룰 예정
//		지금은 문자열 비교시 equals() 메서드를 사용하는것이 좋다는 것만 인지하면 됨
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); 
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}
}
