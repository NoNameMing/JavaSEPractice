package basicLearingJava;

import java.util.Scanner;

public class inputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("hello, talk to me, lonely ming"); 
		String whatToSay = in.nextLine(); // input my words (able to contains " ")
		System.out.println("give out ur point to ur status");
		int point = in.nextInt(); // input int
		System.out.println("whats ur weight");
		double weight = in.nextDouble(); // input double
	}

}
