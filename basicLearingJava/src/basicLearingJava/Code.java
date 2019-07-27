package basicLearingJava;

class Code implements Comparable<Code> {
	 
	public char val;
	public double freq;
	public Code left, right, parent;
	public Code(char val, double freq) {
		this.val = val;
		this.freq = freq;
	}
 
	@Override
	public int compareTo(Code c) {
		double d = freq - c.freq;
		return d > 0 ? 1 : (d == 0 ? 0 : -1);
	}
}

