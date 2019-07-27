package basicLearingJava;

public class stringDemo {
	static String str = "jntm";
	static String greeting = "hello";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 判断空串 或者 null
		 */
		System.out.println("判断空串和null的Demo");
		System.out.println(str.length() == 0); // == 只能连接 int 空串法1
		System.out.println(str.equals("")); // 空串法2
		System.out.println(str == null); // null
		System.out.println(str != null && str.length() !=0); // 非空非null
		System.out.println("------------------分割------------------");
		
		System.out.println("码点测试");
		int cpCount = greeting.codePointCount(0, greeting.length()); // 码点数量
		System.out.println(cpCount);
		
		char first = greeting.charAt(0); // 返回位置n的代码单元 n位于 0 到 len - 1
		char last = greeting.charAt(4);
		System.out.println(first);
		System.out.println(last);
		
		// 得到第 i 个码点
		int index = greeting.offsetByCodePoints(0, 1); // 得到第 1 个码点
		int cp = greeting.codePointAt(index);
		System.out.println("第1个码点: " + cp);
		
		// 依次查看每个码点
		String sentence = "I love Jane";
		int i = 0;
		int cp2 = sentence.codePointAt(i);
		if (Character.isSupplementaryCodePoint(cp2)) i += 2; 
		else i++;
		
		// 回退操作
		i--;
		if (Character.isSupplementaryCodePoint(cp2)) i--;
		cp2 = sentence.codePointAt(i);
		
		int[] codePoints = str.codePoints().toArray(); // 转为数组
		String setence = new String(codePoints, 0, codePoints.length);
		
		/*
		 * 将小段字符串连接成一个字符串
		 */
		
		StringBuilder builder = new StringBuilder(); // 构建一个空的字符串构建器件
		builder.append("best");  // append 方法延长
		builder.append("china");
		String completedString = builder.toString(); // 必要时转为string
		System.out.println(completedString);
	}
	
}
