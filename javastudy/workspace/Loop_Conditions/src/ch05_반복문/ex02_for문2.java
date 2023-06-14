package ch05_반복문;

public class ex02_for문2 {
	public static void main(String[] args) {
//		for문
//		반복 횟수를 알고 있을 때 적합함
//		for(초기화; 조건식; 증감식) 으로 구성되어 있음
//		만약 초기화 하는 경우에 둘 이상의 변수가 필요하면 콤마','로 구분하여 사용할 수 있음
		
//		1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("#######################################");
		
		int sum = 0;
		
//		1부터 10까지의 합
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
