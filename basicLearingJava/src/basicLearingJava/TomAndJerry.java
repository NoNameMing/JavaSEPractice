package basicLearingJava;

import java.io.PrintStream;
import java.util.Formatter;

public class TomAndJerry {

	private String name;
	private Formatter f;
	
	public TomAndJerry(String name, Formatter f) { //  构造函数
		this.name = name;
		this.f = f;
	}
	
	public void move(int x, int y) {
		f.format("%s is at (%d,%d)\n", name, x, y); // 格式
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream outAlias = System.out; // System.out 对象
		TomAndJerry tom = new TomAndJerry("Tom", new Formatter(System.err));
		TomAndJerry jerry = new TomAndJerry("Jerry", new Formatter(outAlias));
		tom.move(0, 0);
		jerry.move(4, 6);
		tom.move(3, 4);
		jerry.move(2, 5);
		tom.move(3, 3);
		jerry.move(3, 3);
	}

}
