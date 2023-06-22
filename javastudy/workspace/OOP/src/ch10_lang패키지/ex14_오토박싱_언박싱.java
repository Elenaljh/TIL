package ch10_lang패키지;

import static java.lang.Math.*;
import static java.lang.System.*;

public class ex14_오토박싱_언박싱 {
	public static void main(String[] args) {
		
		Integer num = new Integer(17); // 박싱
		
		int n = num.intValue();        // 언박싱
		
		
		System.out.println(n);
		
		Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱
		char c = ch;        // char c = ch.charValue();           : 오토언박싱
		System.out.println(c);
		
		Integer x = 10;	// new Integer(10)을 자동으로 해줌 - 오토박싱
		
	}
}
