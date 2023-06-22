package ch10_lang패키지;

import static java.lang.Math.*;
import static java.lang.System.*;

public class ex12_Math_올림_버림_반올림 {
	public static void main(String args[]) {
		System.out.println("floor() - 버림");
		
		System.out.println(Math.floor(10.0));     // 10.0
		System.out.println(Math.floor(10.3));     // 10.0
		System.out.println(Math.floor(10.9));     // 10.0
		
		System.out.println();
		System.out.println("ceil() - 올림");
		
		System.out.println(Math.ceil(10.0));      // 10.0
		System.out.println(Math.ceil(10.1));      // 11.0
		System.out.println(Math.ceil(10.0023001)); // 11.0
		
		System.out.println();
		System.out.println("round() - 반올림");
		
		System.out.println(Math.round(10.0));     // 10
		System.out.println(Math.round(10.4));     // 10
		System.out.println(Math.round(10.5));     // 11
	}
}
