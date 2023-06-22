package ch10_lang패키지;

import static java.lang.Math.*;
import static java.lang.System.*;

public class ex13_래퍼클래스 {
	public static void main(String[] args) {
		Integer i  = new Integer(100);
		Integer i2 = new Integer(100);

		out.println("i==i2 ? "+(i==i2));
		out.println("i.equals(i2) ? "+i.equals(i2));
		out.println("i.compareTo(i2)="+i.compareTo(i2));
		out.println("i.toString()="+i.toString());

		out.println("MAX_VALUE="+Integer.MAX_VALUE);
		out.println("MIN_VALUE="+Integer.MIN_VALUE);
		out.println("SIZE=" +Integer.SIZE+" bits");
		out.println("BYTES="+Integer.BYTES+" bytes");
		out.println("TYPE=" +Integer.TYPE);

	}
}
