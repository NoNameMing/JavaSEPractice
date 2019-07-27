package basicLearingJava;

import java.util.Scanner;

public class BuyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入是不是会员，是y否n");
		String a = sc.next();
		
		System.out.println("请输入购物金额");
		double b = sc.nextDouble();
		
		if (a.equals("y")) {
			b = b * 0.8;
		}
		else {
			if(b >= 200) {
			b = b * 0.75;
			}
			else if (b >= 100) {
			b = b * 0.9;
			}
		}
		System.out.println("实际支付: " + b);
	}

}
