package ch07.ch07_4메서드오버로딩;

public class ex12_메서드_오버로딩 {
	public static void main(String args[]) {
//		오버로딩
//		한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도 
//		매개변수의 개수 또는 타입이 다르면 같은 이름으로 메서드를 정의할 수 있음
		
//		오버로딩의 조건
//		1. 메서드의 이름이 같아야 한다
//		2. 매개변수의 개수 또는 타입이 달라야 한다.

//		위의 조건을 만족하지 못하면 중복 정의로 간주되어 컴파일 시 에러 발생.
//		리턴 타입은 오버로딩을 구현하는데 영향을 주지 못함
		
//		대표적인 예: println()
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과:"    + mm.add(3,3));
		System.out.println("mm.add(3L, 3) 결과: "  + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과: "  + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L,3L));

		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
   }
}

class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}

	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}

	int add(int[] a) {		// 배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i < a.length;i++) 
			result += a[i];
		
		return result;
	}
}