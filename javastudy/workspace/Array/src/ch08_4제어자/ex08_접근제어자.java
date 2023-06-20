package ch08.ch08_4제어자;

public class ex08_접근제어자 {
	public static void main(String args[]) {
//		접근제어자
//		멤버 또는 클래스를 외부에서 접근하는데 제한을 두는 역할을 함
		
//		종류
//		private: 같은 클래스 내에서만 접근 가능 
//		default: 같은 클래스, 같은 패키지 내에서 접근 가능
//		protected: 같은 클래스, 같은 패키지, 자손클래스에서 접근 가능
//		public: 같은 클래스, 같은 패키지, 자손 클래스, 전체 다 접근 가능

//		접근 범위
//		public > protected > (default) > private
		
//		접근 제어자를 사용하는 이유
//		1. 외부로부터 데이터를 보호하기 위해
//		2. 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해
		
//		getter
//		객체로부터 값을 불러오는 메서드. get멤버변수이름() 형태로 사용
		
//		setter
//		객체의 값을 설정하는 메서드. set멤버변수이름() 형태로 사용
		Time t = new Time();
		System.out.println(t);
        
        t.setHour(5);
        System.out.println(t);
        System.out.println(t.getHour());
        
        t.setHour(t.getHour()+1);   // 현재시간보다 1시간 후로 변경한다. 
        System.out.println(t);      // System.out.println(t.toString());과 같다.
		
	}
}

class Time {
	private int hour = 1;
	private int minute = 10;
	private int second = 25;
	

//	getter
	public int getHour() {
		return hour;
	}

//	setter
	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}

//	getter
	public int getMinute() {
		return minute;
	}

//	setter
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

//	getter
	public int getSecond() {
		return second;
	}

//	setter
	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

//	객체의 멤버 변수 상태를 보는데 주로 사용. 출력 함수를 통해 반환되는 형태 그대로 출력 됨
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}