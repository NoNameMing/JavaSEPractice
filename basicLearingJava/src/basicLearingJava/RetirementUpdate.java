package basicLearingJava;

import java.util.*;

public class RetirementUpdate{
	public static void main(String[] args) {
		String input;
		// read inputs
		Scanner in = new Scanner(System.in);

		System.out.println("How Much Money Do You Need To Retire");
		double goal = in.nextDouble();

		System.out.println("How Much Money Will You Contribute Each Year");
		double payment = in.nextDouble();

		System.out.println("Interest rate in %: ");
		double interestRate = in.nextDouble();

		double balance = 0;
		int years = 0;

		// update version
		do{
			balance += payment;
			balance += interestRate * balance / 100;
			
			years++;
			System.out.printf("After year %d, your balance is %,.2f%n", years, balance);
			System.out.printf("Exit?(Y/N)");
			input = in.next(); //.next()方法
		}
		while (input.equals("N"));
	}
}
