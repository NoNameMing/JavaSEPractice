package basicLearingJava;

public class Program2_1 {
	// PSVM
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "welcome to java!";
		System.out.println(greeting);
		for(int i = 0; i < greeting.length(); i++)
			System.out.print("= ");
		System.out.println();//只打印一个空行
		System.out.print("+");
		// System.out 是一个对象 调用println方法
		// object.method(parameters)
	}

}