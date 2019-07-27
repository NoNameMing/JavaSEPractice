package basicLearingJava;

//电路步线
public class WireSet {
	private int n;		//导线的数目
	private int m;		
	private int []c;	//存放导线
	private int [][]size;
	private int []net;	//存放最大公共不相交子集
	//构造函数：根据num的值所表示的导线的数目，进行初始化
	public WireSet(int num)
	{
		n=num;
		c=new int [n+1];
		size=new int [n+1][n+1];
		net=new int [n+1];
		//对c[]进行赋初值，为1-n的任一个排列
		c[1]=(int)(Math.random()*(n)+1);
		int i=2;
		while(i<=n)
		{
			int f=0;
			int t=(int)(Math.random()*(n)+1);
			for(int j=1;j<i;j++)
			{
				if (c[j]==t) 
				{
					f=1;
					break;
				}
			}
			if (f==0){
				c[i]=t;
				i++;
			}
		}
	}
	//用来输出相关信息
	public void print()
	{
		//输出上端线路编号
		System.out.print("上端线路编号：");
		for(int i=0;i<=n;i++)
		{
			System.out.print(String.format("%3d", i));
		}
		System.out.println();
		System.out.println();
		//输出下端线路编号
		System.out.print("下端线路编号：");
		for(int i=0;i<=n;i++)
		{
			System.out.print(String.format("%3d", c[i]));
		}
		System.out.println();
		//输出最大不相交子集的个数
		System.out.print("最大不相交子集的大小为："+size[n][n]);
		System.out.println();
		//输出最大不相交子集中的各个导线
		System.out.print("上端线路编号：");
		for(int i=this.m-1;i>=0;i--)
		{
			System.out.print(String.format("%3d", this.net[i]));
		}
		System.out.println();
		System.out.print("下端线路编号：");
		for(int i=this.m-1;i>=0;i--)
		{
			System.out.print(String.format("%3d", c[this.net[i]]));
		}
		
	}
	public static void main(String []args){
		WireSet ws= new WireSet(10);
		//计算最优值
		ws.mnset(ws.c, ws.size);
		//构造最优解
		ws.m=ws.traceback(ws.c, ws.size, ws.net);
		//输出结果
		ws.print();
		
	}
	//[]c：导线上下两端对应的关系:i=c[j],上端i导线对应下端j导线
	//size[][]：用来记录最大不相交子集的大小
	public static void mnset(int []c,int [][]size)
	{
		int n=c.length-1;
		//j<c[1],i=1,最大不相交子集为空
		for(int j=0;j<c[1];j++)
			size[1][j]=0;
		//j≥c[1],i=1,最大不相交子集
		for(int j=c[1];j<=n;j++)
			size[1][j]=1;
		for(int i=2;i<n;i++)
		{
			for(int j=0;j<c[i];j++)
				size[i][j]=size[i-1][j];
			for(int j=c[i];j<=n;j++)
				size[i][j]=Math.max(size[i-1][j],size[i-1][c[i]-1]+1);
		}
		size[n][n]=Math.max(size[n-1][n],size[n-1][c[n]-1]+1);
	}
	public static int traceback(int []c,int [][]size ,int []net)
	{
		int n=c.length-1;
		int j=n;
		int m=0;
		for(int i=n;i>1;i--)
			if(size[i][j]!=size[i-1][j])
			{
				net[m++]=i;
				j=c[i]-1;
			}
		if(j>=c[1])
			net[m++]=1;
		return m;
	}
}
