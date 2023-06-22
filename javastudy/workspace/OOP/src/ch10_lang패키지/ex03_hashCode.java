package ch10_lang패키지;

public class ex03_hashCode {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
//		String str1 = new String("abc");
//		String str2 = str1;

		System.out.println(str1.equals(str2));
//		string 클래스는 문자열의 값이 같으면 동일한 해시코드를 반환함
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
//		identityHashCode()는 객체의 주소값으로 해시코드를 생성함
//		해시코드는 같지만 서로 다른 객체임을 확인 가능
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
