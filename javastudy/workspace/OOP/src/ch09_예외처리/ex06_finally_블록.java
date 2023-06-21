package ch09_예외처리;

public class ex06_finally_블록 {
	public static void main(String args[]) {
//		finally 블럭은 try-catch문과 함께 예외의 발생여부에 상관없이 실행
//		finally 블럭은 try-catch문과 함께 예외의 발생여부에 상관없이 실행
		
		method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아왔습니다.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return;		// 현재 실행 중인 메서드를 종료한다.
		} catch (Exception e)	{
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 finally블럭이 실행되었습니다.");
		}
	}	// method1메서드의 끝
}
