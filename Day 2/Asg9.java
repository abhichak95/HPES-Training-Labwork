public class Asg9 {
	private static final int N = 5;

	public static void main(String[] args) {
		System.out.println();
		for (int i = 1; i <= N; i++) {
			for (int j = N-i; j >= 1; j--) System.out.print(" ");
			for (int j = 1; j <= i; j++) System.out.print("*");
			System.out.println();
		}
	}
}