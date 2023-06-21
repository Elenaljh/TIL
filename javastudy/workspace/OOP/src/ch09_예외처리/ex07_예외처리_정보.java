package ch09_예외처리;

public class ex07_예외처리_정보 {
	public static void main(String args[]) {
//		예외 발생시 예외 클래스의 인스턴스에 발생한 예외에 대한 정보가 들어있음
//		getMessage()와 printStackTrace()를 통해 이 정보들을 얻을 수 있음
		
//		printStackTrace(): 예외발생 당시의 콜스택에 있던 메서드의 정보와 예외 메세지를 화면에 출력
//		getMessage(): 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻을 수 있음
		
		System.out.println(1);			
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외발생!!!
			System.out.println(4); 	 // 실행되지 않는다.
		} catch (ArithmeticException e)	{
			e.printStackTrace();
			System.out.println("예외메시지 : " + e.getMessage());
		}	// try-catch의 끝
		System.out.println(6);
	}
}
