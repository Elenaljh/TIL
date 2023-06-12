package ch02_변수;

import java.util.Scanner;

public class ex11_형변환 {
	public static void main(String[] args) {
//		형변환(casting)
//		데이터를 다른 형으로 변환하는 것
//		데이터 변환은 정보를 잃어버릴 수 있으므로 주의해야 한다
//		작은 크기의 데이터 형에서 큰 크기의 데이터형으로 변환하는 것은 안전함
//		ex) int -> double
//		큰 데이터형에서 작은 데이터 형으로 변환할 때 정보를 잃어버릴 수 있다
//		ex) double -> int
		
		int x = 65;
//		아스키 코드 65번은 대문자 A를 의미함
//		정수 타입을 문자형으로 캐스팅 하면 아스키코드에 매핑되는 문자가 출력됨
		System.out.println((char)x);
//		실수형 타입으로 변환
		System.out.println((double)x);
		
		double d = 32.3;
		int d1 = (int)d;
//		실수형을 정수형으로 캐스팅 하면 소수점 이하가 날아감.
//		즉 데이터의 손실 발생
		System.out.println(d1);
		
//		다시 실수형으로 캐스팅 해도 날아간 소수점 이하의 값은 복구되지 않음
		double d2 = (double)d1;
		System.out.println(d2);
		
		System.out.println('C' + 'A');
	}
}
