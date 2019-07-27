package basicLearingJava;

public class LotteryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 10;
		
		// allocate triangular array
		int[][] odds = new int [MAX + 1][];
		for (int n = 0; n <= MAX; n++)
			odds[n] = new int[n + 1];
		
		// fill triangular array
		for (int n = 0; n < odds.length; n++)
			for (int k = 0; k < odds[n].length; k++)
			{
				int lotteryOdds = 1;
				for (int i = 1; i <= k; i++)
					lotteryOdds = lotteryOdds * (n - i + 1) / i;
				
				odds[n][k] = lotteryOdds;
			}
			
		for (int[] row : odds)	
		{
			for (int odd : row)
				System.out.printf("%4d", odd);
			System.out.println();
		}
		
	}

}
