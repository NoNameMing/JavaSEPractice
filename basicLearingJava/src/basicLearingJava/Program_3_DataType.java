package basicLearingJava;

public class Program_3_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean booleanA = true; //true not TRUE
		boolean booleanB = 5 < 3; //false
		
		System.out.println(booleanA);
		System.out.println(booleanB);
		// if (c) {System.out.println(b);} 
		// Type mismatch: cannot convert from int to boolean
		
		/* 以下为整型 */
		byte byteA = (byte) -128;
		byte byteB = (byte) 127; // 主要用于二进制 范围 -128 到 127
		System.out.println(byteA);
		System.out.println(byteB);
		byte byteC = (byte) -129;
		byte byteD = (byte) 128;
		System.out.println(byteC);
		System.out.println(byteD);
		short shortA = 32767; // 2 ^ 15 - 1
		int intA = 2147483647; // 2 * 10 ^ 10 and more
		long longZero  = 2147483647; // 隐式 int 变成 long 不写L有可能报错
		long longA = 100000000000L; // 9 * 10 ^ 19 and more 
		long longB = 1000000000000l; 
		/* 以下为浮点型 */
		float floatA = 1.23f; // 
		System.out.println(floatA == 1.2299999999999f); // true
		// 无限接近会被认为相等
		
		/* char类型 */
		char charA = '\u4e0a';
		System.out.println(charA);
		
	}

}
