package basicLearingJava;

import java.util.Random;

public class UsingStringBuilder {
	public static Random rand = new Random(47);
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for(int i = 0; i < 26; i++) {
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length() - 2, result.length()); // 删了 ", "
		result.append("]");	
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
		Random rand2 = new Random(47);
		System.out.println(rand2);
	}

}

// javap -c WitherStringBuilder