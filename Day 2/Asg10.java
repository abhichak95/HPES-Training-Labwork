public class Asg10 {
	private static final int N = 5;
	private static char ch = 'A';
	
	public static void main(String[] args) {
		System.out.println();
		for (int i = 1; i <= N; i++) {
			char p = ch;
			for (int j = N-i; j > 0; j--) System.out.print("  ");
			for (int j = 0; j < i; j++) System.out.print(p++ + " ");
			--p;
			for (int j = 0; j < i-1; j++) System.out.print(--p + " ");
			System.out.println();
		}
	}
}