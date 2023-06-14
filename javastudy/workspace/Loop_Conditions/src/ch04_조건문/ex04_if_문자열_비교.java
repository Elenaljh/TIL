package ch04_조건문;


public class ex04_if_문자열_비교 {
	public static void main(String[] args) {
//		문자열의 경우 큰따옴표로 선언한 경우와 new 객체를 이옹하여 선언한 경우에 따라 문자열 비교의 결과가 다르게 나타날 수 있음
//		자세한 내용은 String을 배울때 다룰 예정
//		지금은 문자열 비교시 equals() 메서드를 사용하는것이 좋다는 것만 인지하면 됨
		
		String s1 = "문자열";
		String s2 = "문자열";
		String s3 = new String("문자열");
		String s4 = new String("문자열");
		
//		같다
		System.out.println("큰 따옴표에 있는 문자열과 비교하는 경우");
		if (s1 == "문자열") {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열이 다릅니다.");
		}
		
//		같다
		System.out.println("큰따옴표로 선언된 문자열과 비교하는 경우");
		if (s1 == s2) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열이 다릅니다.");
		}
		
//		다르다
		System.out.println("new 객체로 선언된 문자열과 비교하는 경우");
		if (s1 == s3) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열이 다릅니다.");
		}
//		
//		같다
		System.out.println("new 객체로 선언된 문자열과 비교하는 경우. using equals method");
		if (s1.equals(s3)) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열이 다릅니다.");
		}
		
//		다르다
		System.out.println("new 객체로 선언된 문자열끼리 비교하는 경우");
		if (s3 == s4) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열이 다릅니다.");
		}
		
//		같다
		System.out.println("new 객체로 선언된 문자열끼리 비교하는 경우. using equals method");
		if (s3.equals(s4)) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열이 다릅니다.");
		}

	}

}
