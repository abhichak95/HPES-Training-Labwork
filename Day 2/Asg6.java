public class Asg6 {
	private static int N = 5;

	public static void main(String[] args) {
		int ctr = 1;
		//System.out.println();
		for (int i = 1; ctr <= N; i++) {
			int sum = 0;
			int num = i;
			int digit = 0;
			while (num != 0) {
				digit = num%10;
				num /= 10;
				sum += Math.pow(digit, 3);
			}
			if (sum == i) System.out.println("\nArmstrong Number " + ctr++ + ": " + i);
		}
	}
}