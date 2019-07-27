package basicLearingJava;

// import net.mindview.util.Print.*;

public class LabeledFor {
	public static void main(String[] args) {
		int i = 0;
		outer: // cant have statements here
		for (; true;) {
			inner: // cant have statements here
			for (; i < 10; i++) {
				System.out.println("i = " + i);
				if (i == 2) {
					System.out.println("continue");
					continue;
				}
				if (i == 3) {
					System.out.println("break"); // Otherwise i never
					// gets incremented
					i++;
					break;
				}
				if (i == 7) {
					System.out.println("continue outer");
					i++;
					continue outer;
				}
				if (i == 8) {
					System.out.println("break outer");
					i++;
					break outer;
				}
				for (int k = 0; k < 5; k++) {
					if (k == 3) {
						System.out.println("continue inner");
						continue inner;
					}
				}
			}
		}
	}
}
