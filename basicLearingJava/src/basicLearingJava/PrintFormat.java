package basicLearingJava;

import java.util.Date;

public class PrintFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * printf 方法学习
		 */
		System.out.printf("%tc", new Date()); // 打印当前日期
		
		double x = 10000.0 / 3.0;
		System.out.println(" " + x); // 打印最大非0数字位数打印输出 x
		
		System.out.printf("%8.2f", x); // 8位 输出一个空格和7个字符
		System.out.println();
		// System.out.printf("Hello," %s. Next year, youll be %d", name, age);
		System.out.printf("%,.2f", 10000.0 / 3.0); // 分隔符
		System.out.println();
		System.out.printf("%s %tB %<te, %<tY", "Due date:", new Date());
	}
	

}
