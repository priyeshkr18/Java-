public class Main {

	// Static method inside the class
	static int countDigits(int x) {
			int res = 0;
			while (x != 0) {
					x /= 10;
					res++;
			}
			return res;
	}

	public static void main(String[] args) {
			int x = 12345;
			int result = countDigits(x);
			System.out.println("Number of digits in " + x + " is: " + result);
	}
}
