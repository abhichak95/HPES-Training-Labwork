import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		int a = -1;
		Scanner in = new Scanner(System.in);
		while(a < 0) {
			try {
				if (args.length == 1) a = Integer.parseInt(args[0]);
				else {
					System.out.print("\nEnter a number: ");
					a = Integer.parseInt(in.next());
				}
			}
			catch(InputMismatchException e) {

			}
			catch(NumberFormatException e) {

			}
		}
		long ans = 1;
		for (int i = 1; i <= a; i++) ans *= i;
		System.out.println("\nBy iterative method:\nFactorial of " + a + ": " + ans);
		ans = FactorialRecur(a);
		System.out.println("\n\nBy recursive method:\nFactorial of " + a + ": " + ans);
	}

	public static long FactorialRecur(int a) {
		if (a == 0 || a == 1) return 1;
		return a*FactorialRecur(a-1);
	}
}