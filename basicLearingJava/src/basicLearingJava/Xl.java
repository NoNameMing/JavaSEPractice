package basicLearingJava;

//最长公共子序列类
public class Xl {
	private char []x;
	private char []y;
	private int xl;
	private int yl;
	
	public Xl(int m,int n)
	{
		xl=m;
		yl=n;
		x=new char [xl];
		y=new char [yl];
		for(int i=0;i<m;i++)
		{
			int t=(int)(Math.random()*8)+65;
			x[i]=(char) t;
		}
		for(int i=0;i<n;i++)
		{
			int t=(int)(Math.random()*8)+65;
			y[i]=(char) t;
		}
	}
	private void print()
	{
		for(int i=0;i<this.xl;i++)
		{
			System.out.print(String.format("%3s", x[i]));
		}
		System.out.println();
		for(int i=0;i<this.yl;i++)
		{
			System.out.print(String.format("%3s", y[i]));
		}
	}
	public static void main(String []args)
	{
		Xl xl1=new Xl(10,12);
		int [][]b=new int [xl1.xl][xl1.yl];
		int lcsl=lcsLength(xl1.x,xl1.y,b);
		xl1.print();
		System.out.println();
		System.out.print("最长公共子序列的长度为："+lcsl);
		System.out.println();
		xl1.lcs(xl1.xl-1,xl1.yl-1,xl1.x, b);
	}
	//计算x和y最长公共子序列的长度，b用来记录标记
	//最优值存放在c[][]中
	public static int lcsLength(char []x,char []y,int [][]b)
	{
		int  m=x.length-1;
		int n=y.length-1;
		int [][]c=new int [m+1][n+1];
		//j=0,最长公共子序列为0
		for(int i=1;i<= m;i++) c[i][0]=0;
		//i=0,最长公共子序列为0
		for(int i=1;i<= n;i++) c[0][i]=0;
		//i,j>0时，计算最长公共子序列的长度
		for(int i=1;i<= m;i++) 
			for (int j=1;j<=n;j++)
			{
				//xi=yj,c[i][j]=c[i-1][j-1]+1
				if (x[i]==y[j]) 
				{
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]=1;
				}
				//xi<>yj,c[i][j]=max{c[i][j-1],c[i-1][j]
				else if (c[i-1][j]>=c[i][j-1])
				{ 
					c[i][j]=c[i-1][j];
					b[i][j]=2;
				}
				else 
				{
					c[i][j]=c[i][j-1];
					b[i][j]=3;
				}        
			}
		return c[m][n];
	}
	//构造最长公共子序列
	public static void lcs(int i,int j,char []x,int [][]b)
	{
		if (i ==0 || j==0) return;
		if (b[i][j]== 1)
		{
			lcs(i-1,j-1,x,b);
			System.out.print(String.format("%3s", x[i]));
		}
		else if (b[i][j]== 2) 
			lcs(i-1,j,x,b);
		else 
			lcs(i,j-1,x,b);
	}
}
