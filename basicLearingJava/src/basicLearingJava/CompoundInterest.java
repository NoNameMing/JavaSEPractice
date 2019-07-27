package basicLearingJava;

/*
* 2D Array --- 用于计算利率
*/

public class CompoundInterest
{
	//  1实操 2看语法 3总结 
	public static void main(String[] args) {
		final double STARTRATE = 10;
		final int NRATES = 6; // int 打成了 double
		final int NYEARS = 10;

		// set interest rates to 10% ... 15%
		double[] interestRate = new double[NRATES]; // 注意 Java 数组定义方式
		for (int j = 0; j < interestRate.length; j++)
			interestRate[j] = (STARTRATE + j) / 100.0;

		double[][] balances = new double[NYEARS][NRATES]; // 注意定义方式

		// set initial balances to 1000
		for (int j = 0; j < balances[0].length; j++) // 
			balances[0][j] = 1000;

		// compute interest for next years
		for (int i = 1; i < balances.length; i++) // 错误1
			for (int j = 0; j < balances[i].length; j++)
				balances[i][j] = balances[i - 1][j] * interestRate[j] + balances[i - 1][j];

		// print one row of interest rates --- 打印利率
		for (int j = 0; j < interestRate.length; j++) 
			System.out.printf("%9.0f%%", 100 * interestRate[j]);
		System.out.println(); // 重要的换行

		// print balance table 
		for(double[] row : balances)
		{
			// print table row
			for (double b : row) 
				System.out.printf("%10.2f", b); // 这里printf 打成了 println
			System.out.println();
		}
	}
}
