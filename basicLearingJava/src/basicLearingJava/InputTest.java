package basicLearingJava;

import java.io.Console;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		// get first input
		System.out.println("Whats your name");
		String name = in.nextLine();
		
		// get second input
		System.out.println("How old are you");
		int age = in.nextInt();
		
		// display it!
		System.out.println("Hello " + name + "," + age + " old you will be the best!");
		
		// NoPointerException
		Console cons = System.console();
		String username = cons.readLine();
		char[] pswrd = cons.readPassword();
	}

}
