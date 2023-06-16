package ch05_반복문.문제;
import java.util.Scanner;

public class 문제3 {
	/*
	 * 1+(-2)+3+(-4)+.... 계속 반복했을때 몇까지 더해야 총 합이 100이 되는지 구하시오
	 * 
	 * output: 199
	 */
	public static void main(String[] args) {

//		int sum = 0;
//		int s = 1;
//		int num = 0;
//		
//		for (int i = 1;; i++, s = -s) {
//			num = s * i;
//			sum += num;
//			
//			if (sum == 100)
//				break;
//		}
//		System.out.println(num);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int sum = 0;
		int s = 1;
		int num = 0;
		int i = 1;
		
		while(true) {
			num = s * i++;
			sum += num;
			
			if (sum == 100)
				break;
			s = -s;
			
		}	// end of while
		
		System.out.println(num);

	}
}
