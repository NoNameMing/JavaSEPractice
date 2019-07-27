package basicLearingJava;

public class enumTest {
	/*
	 * 不能定义在 main 中
	 */
	static enum size { SMALL, MEDIUM, EXTRA_LARCE };
	static size s = size.MEDIUM;
	
	static String e = ""; // an empty String
	static String greeting = "Hello";
	static String sGreeting = greeting.substring(0, 3); // substring
	
	static String hello = "hello";
	static String world = "world";
	static String hw = hello + world; // 拼接
	
	static String name = "DCG"; 
	static int age = 21;
	static String xg = name + age; // 拼接2 from int to String
	
	static String joinMethod = String.join(" *_ATTETION_* ", "S", "M", "L", "XL"); //定界符
	
	static String greeting2 = greeting.substring(0, 3) + "p!"; // 自创修改字符串法则

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s);
		
		System.out.println(greeting);
		System.out.println(sGreeting); // syso greeting from sGrting[0] to sGrting[2]
									   // easy to calculate the length from the num in []
		System.out.println(hw);
		System.out.println(xg);
		System.out.println(joinMethod);
		System.out.println(greeting2);
		System.out.println(greeting.equals(hello)); // 判断字符串是否相等
		System.out.println(greeting.equalsIgnoreCase(hello)); // 判断字符串是否相等(忽略大小写)
		System.out.println(greeting == sGreeting); // 最好不用 == 判断 String 相等问题
		System.out.println(greeting.compareTo("Hellp")); // compareTo函数 0 对 -1 错
	}

}
