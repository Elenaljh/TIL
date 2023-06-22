package ch10_lang패키지;

public class ex08_문자열_비교 {
	public static void main(String[] args) {
//		String 클래스
		
//		변경 불가능한 클래스
//		한번 생성된 String 인스턴스가 갖고 오는 문자열은 읽어 올 수만 있고, 변경할 수는 없다
//		String a = "a", b = "b"; a +=b 연산은 새로운 문자열 "ab"가 생성된 것
		
//		문자열의 선언
		String s1 = "abc";		// 문자열 리터럴 "abc"의 주소가 s1에 저장
		String s2 = "abc";		// 문자열 리터럴 "abc"의 주소가 s2에 저장
		String s3 = new String("abc");	// 새로운 String 인스턴스를 생성
		String s4 = new String("abc");	// 새로운 String 인스턴스를 생성
		
//		리터럴은 클래스가 메모리에 로드 될 때(컴파일 시) 자동적으로 미리 생성됨
//		같은 문자열 내용은 한 번만 저장됨
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s2 : " + s1.equals(s2));
		System.out.println();
		
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s3 == s4 : " + s3.equals(s4));
		System.out.println();
	}
}
