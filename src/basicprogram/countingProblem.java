package basicprogram;

public class countingProblem {

	public static void main(String[] args) {
		int n = 1258;
		int c = 0;
		while(n != 0) {
			n /= 10;
			c++;
		}
		System.out.println("Digits:" + c);
	}
}
