package ch09_예외처리;

public class ex01_try_catch {
	public static void main(String args[]) {
//		프로그램 오류
//		프로그램이 실행 중 어떤 원인에 의해 오작동을 하거나 비정상적으로 종료되는 원인을 에러 또는 오류라고 함

//		발생 시점에 따른 분류
//		컴파일 에러: 컴파일 시에 발생하는 에러
//		런타임 에러: 실행 시에 발생하는 에러

//		런타임 시 발생할 수 있는 오류
//		1. 에러: 프로그램 코드에 의해 수습될 수 없는 심각한 오류
//		2. 예외: 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류

//		자바는 실행 시 발생할 수 있는 오류를 클래스로 정의함
//		예외 클래스들은 두 그룹으로 나뉘어 짐
//		1. Exception 클래스들: 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
//		2. RuntimeException 클래스들: 프로그래머의 실수로 발생하는 예외
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4); // 실행되지 않는다.
		} // try-catch의 끝
		System.out.println(5);

	}
}
