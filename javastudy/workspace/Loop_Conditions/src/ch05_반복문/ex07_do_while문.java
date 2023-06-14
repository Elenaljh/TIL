package ch05_반복문;

public class ex07_do_while문 {
	public static void main(String[] args) {
//		do~while문
//		기본적인 구조는 while문과 같으나 조건식과 블럭의 순서를 바꿔놓은 것
//		while문과 반대로 블럭을 먼저 수행한 후에 조건식을 확인함
//		조건이 맞지 않더라도 최소한 한번은 수행할 것이 보장됨
		
		int x = 5;
		// 4 이상일 때만 반복하는 조건을 걸었지만 반복문 실행 후에 조건을 확인하기 때문에 한번은 수행됨
		do {
			System.out.println(x);
		} while(x < 4);
		
	}

}
