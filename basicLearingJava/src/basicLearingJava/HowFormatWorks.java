package basicLearingJava;

import java.math.BigInteger;
import java.util.Formatter;

public class HowFormatWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter f = new Formatter(System.out);
		
		char u = 'a';
		System.out.println("u = 'a'");
		f.format("s: %s\n" , u);
		f.format("c: %c\n" , u);
		f.format("b: %b\n" , u);
		f.format("h: %h\n" , u);
		
		int v = 121;
		System.out.println("v = 121");
		f.format("d: %d\n", v);
		f.format("c: %c\n", v);
		f.format("b: %b\n", v);
		f.format("s: %s\n", v);
		f.format("x: %x\n", v);
		f.format("h: %h\n", v);
		
		BigInteger w = new BigInteger("5000000000000");
		System.out.println("w = new BigInteger(\"5000000000000\")");
		f.format("d: %d\n", w);
		f.format("b: %b\n", w);
		f.format("s: %s\n", w);
		f.format("x: %x\n", w);
		f.format("h: %x\n", w);
		
		double x = 179.543;
		System.out.println("x = 179.543");
		f.format("b: %b\n", x);
		f.format("s: %s\n", x);
		f.format("f: %f\n", x);
		f.format("e: %e\n", x);
		f.format("h: %h\n", x);
		
		HowFormatWorks h = new HowFormatWorks();
		System.out.println("h = new Conversion()");
		f.format("b: %b\n", h);
		f.format("s: %s\n", h);
		f.format("h: %h\n", h);
		
		boolean z = false;
		System.out.println("z = false");
		f.format("b: %b\n", z);
		f.format("s: %s\n", z);
		f.format("h: %h\n", z);
	}

}
