package ch08.ch08_4제어자;

final class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() {
		// ...
	}

	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}

	// ...
}

public class ex09_생성자의_접근제어자 {
	public static void main(String args[]) {
//		Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
	}
}
