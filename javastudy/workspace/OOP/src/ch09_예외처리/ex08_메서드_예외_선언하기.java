package ch09_예외처리;

public class ex08_메서드_예외_선언하기 {
	public static void main(String args[]) {
//		어떤 상황에 어떤 종류의 예외가 발생할 가능성이 있는지 예측이 어려움
//		자바는 메서드를 작성할 때 발생할 가능성이 있는 예외를 명시하여 
//		사용하는 쪽에서 이에 대한 처리를 하도록 강요
//		메서드 선언부에 throws를 사용해서 예외를 던질(미룰) 수 있음
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main에서 예외 처리");
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception {
		method2();
	}	// method1의 끝

	static void method2() throws Exception {
		throw new Exception();
	}	// method2의 끝
}
