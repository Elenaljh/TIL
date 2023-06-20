package ch08.ch08_2오버라이딩;

public class ex04_조상클래스_생성자 {
	public static void main(String args[]) {
//		super()
//		조상 클래스의 생성자를 호출하는데 사용됨
//		자손 클래스의 생성자 첫줄에서 사용 해야 됨.
//		모든 클래스의 첫 줄에는 생성자 this() 또는 super()를 호출해야 함
//		그렇지 않으면 컴파일러가 자동적으로 super()를 생성자 첫 줄에 생성함
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
		
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y); // Point(int x, int y)를 의미함
		this.z = z;
	}
}