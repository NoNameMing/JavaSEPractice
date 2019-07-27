package basicLearingJava;

//矩阵连乘类
public class Matrix {
	private int MN;			//表示矩阵链中矩阵的数目
	private int[] p;		//存放各个矩阵的维数
	private int [][][]A;	//存放要进行连乘的多个矩阵
	private int [][]m;		//用来存放Ai到Aj的最少乘次数
	private int [][]s;		//用来存放Ai到Aj的最后断开位置
	//
	public Matrix()
	{
		MN=0;
		p=new int [MN];
	}
	//构造函数,L为矩阵的数目
	public Matrix(int L)
	{
		MN=L;
		p=new int [MN+1];
		A=new int [MN][][];
		m=new int [MN+1][MN+1];
		s=new int [MN+1][MN+1];
		//随机生成连乘矩阵的维数[1-11]
		for(int i=0;i<=MN;i++)
		{
			p[i]=(int) Math.round(Math.random()*10)+1;
		}
		//随机生成各个矩阵
		for(int i=0;i<MN;i++)
		{
			A[i]=new int [p[i]][p[i+1]];
			CreatMatrix(A[i],p[i],p[i+1]);
		}
	}
	//创建矩阵a，维数为m*n
	private void CreatMatrix(int [][]a,int m,int n)
	{
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=(int) Math.round(Math.random()*99)-50;
	}
	//输出连乘的所有矩阵
	private void printAllM()
	{
		for (int i=0;i<this.MN;i++)
		{
			System.out.println("A"+(i+1)+": "+A[i].length +"*"+A[i][0].length );
			printM(A[i]);
		}
	}
	//输出矩阵a的每个元素
	private void printM(int [][]a)
	{
		for(int i=0;i<a.length ;i++)
		{
			System.out.print("   ");
			for(int j=0;j<a[i].length;j++)
				System.out.print(String.format("%4d", a[i][j]));
			System.out.println();
		}
	}
	public static void main(String [] args)
	{
		Matrix M=new Matrix(7);
		M.printAllM();
		M.matrixChain(M.p,M.m,M.s);
		System.out.print("矩阵链所需的最少乘次数为："+M.m[1][M.MN]);
		System.out.println();
		String []s=new String[M.MN+1];
		for(int i=1;i<=M.MN;i++)
		{
			s[i]="A"+i;
		}
		M.traceback(M.s, 1, M.MN,s);
		for(int i=1;i<=M.MN;i++)
		{
			System.out.print(s[i]);
		}
				
	}
	//作用：计算a，b矩阵的乘积，将结果保存在c中，
	//参数：ra为a的行数，ca为a的列数，rb为b的行数，cb为b的列数
	public static void matrixMultiply(int [][]a,int [][]b,int [][]c,int ra,int ca,int rb,int cb)
	{
		if(ca!=rb)
			throw new IllegalArgumentException("矩阵不可乘");
		//i为乘积矩阵元素的行下标
		for(int i=0;i<ra;i++)
			//j为乘积矩阵元素的列下标
			for (int j=0;j<cb;j++)
			{
				//sum初始化为a中i行第一个原素和b中j列第一个元素的乘积
				int sum =a[i][0]*b[0][j];
				//计算a中第i行和b中第j列对应元素乘积的和
				for(int k=1;k<ca;k++)
					sum+=a[i][k]*b[k][j];
				//将乘积的和赋值给乘积矩阵的相应元素
				c[i][j]=sum;				
			}
	}
	//作用：计算矩阵连乘时，矩阵链的最少乘次数
	//参数：p[0:n]表示矩阵A1,A2...An的维数。Ai为p[i-1]*p[i]
	//     m，用来存放矩阵链的最少乘次数，m[i][j]表示A[i,j]最少乘次数
	//     s，用来存放矩阵链最优次序的断开位置。
	public static void matrixChain(int []p, int [][]m, int [][]s)
	{
		//n为矩阵个数
		int n=p.length-1;
		//矩阵链长度为1,不需要进行乘运算，即m[i][i]值为0
		for (int i=1;i<=n;i++) m[i][i]=0;
		//计算矩阵链长度大于1的m值
		for (int r=2;r<=n;r++)
			//针对长度为r的各个矩阵链A[i,j]计算最少乘次数m
			for(int i=1;i<=n-r+1;i++) 
			{
				int j=i+r-1;
				//计算初始值m[i][j]=m[i][i]+m[i+1][j]+p[i-1]*p[i]*p[j]
				m[i][j]=m[i+1][j]+p[i-1]*p[i]*p[j];
				//记录对应的断开位置i
				s[i][j]=i;
				//断开位置k从i+1到j-1，依次计算m值
				for (int k=i+1; k<j; k++)
				{
					//计算断开位置为k的乘计算次数，保存到t
					int t=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
					//若t比所记录的最少乘计算次数少，则用t替换，并记录新的断开位置
					if (t<m[i][j]) 
					{
						m[i][j]=t;
						s[i][j]=k;
					}
				}
			}
	}
	public static void traceback(int [][]s,int i,int j,String []c)
	{
		if(i==j) return;
		traceback(s,i,s[i][j],c);
		traceback(s,s[i][j]+1,j,c);
		c[i]="("+c[i];
		c[j]=c[j]+")";
		System.out.println("Multiply A"+i+","+s[i][j]+"and A"+(s[i][j]+1)+","+j);
	}
}
