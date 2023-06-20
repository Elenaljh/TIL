package ch08.ch08_1상속;

class Tv {
	boolean power; // 전원상태(on/off)
	int channel;	// 채널

	void power()       {   power = !power; }
	void channelUp()   {   ++channel;      }
	void channelDown() {   --channel;      }
}

class SmartTv extends Tv {  // CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;     // 캡션상태(on/off)
	void displayCaption(String text) {
		if (caption) {   // 캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}

public class ex01_상속 {
	public static void main(String args[]) {
//		상속
//		기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
//		보다 적은 양의 코드로 새로운 클래스를 작성할 수 있음
//		코드를 공통으로 관리하기 때문에 추가 및 변경이 용이 -> 높은 생산성과 유지보수
		
//		조상 클래스: 부모 클래스, 상위(super) 클래스
//		자손 클래스: 자식 클래스, 하위 클래스
		
//		자식 클래스는 조상의 모든 멤버를 상속받음
//		조상 클래스가 변경되면 자손 클래스는 자동적으로 변경됨
//		자손 클래스가 변경되어도 조상 클래스는 영향 받지 않음
//		생성자는 상속되지 않음
		
		SmartTv stv = new SmartTv();
		stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();			// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;	// 캡션(자막) 기능을 켠다.	       
		stv.displayCaption("Hello, World");
	}
}
