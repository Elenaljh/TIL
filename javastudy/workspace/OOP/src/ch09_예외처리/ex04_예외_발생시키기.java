package ch09_예외처리;

public class ex04_예외_발생시키기 {
	public static void main(String args[]) {
//		키워드 throw를 사용ㅎ서 프로그래머가 고의로 예외를 발생 시킬 수 있음
		
//		1. 연산자 new를 이용하여 발생시키려는 예외 클래스의 객체를 만듬
//		2. 키워드 throw를 이용하여 예외를 발생시킴
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;	 // 예외를 발생시킴
		//  throw new Exception("고의로 발생시켰음.");

		} catch (Exception e)	{
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}
}
