package ch05_반복문.문제;

public class 문제4 {
	/*
	 * 2x + 4y = 10의 모든 해를 구하시오. x, y는 음이 아닌 정수이다.
	 * 
	 * output 
	 * x=1 y=2 
	 * x=3 y=1 
	 * x=5 y=0
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (x * 2 + y * 4 == 10) {
					System.out.println("x=" + x + " y=" + y);
				} // end of if
			} // end of for y
		} // end of for x

	}
}
