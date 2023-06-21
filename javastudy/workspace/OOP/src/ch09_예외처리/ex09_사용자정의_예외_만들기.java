package ch09_예외처리;

public class ex09_사용자정의_예외_만들기 {
	public static void main(String args[]) {
		String name = null;
		try {
			method(name);
		} catch (MyException e) {
			System.out.println("에러메세지: " + e.getMessage());
			System.out.println("에러코드: " + e.getErrCode());
			e.printStackTrace();
		}
	}

	private static void method(String name) throws MyException {
		if(name == null) {
			throw new MyException("사용자 정의 예외가 발생했습니다");
		}
	}
	

}

@SuppressWarnings("serial")
class MyException extends Exception {
	private final int ERR_CODE;	// 에러 코드를 저장할 상수
	
	public MyException(String msg, int errCode) {
		super(msg);	// Exception 클래스의 생성자를 활용
		ERR_CODE = errCode;
	}
	
	public MyException(String msg) {
		this(msg, 100);		// 에러 코드 값이 입력되지 않으면 디폴트 값으로 100을 부여
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
}