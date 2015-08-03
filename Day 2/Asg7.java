import java.util.*;

public class Asg7 {
	private static Scanner in = new Scanner(System.in);
	private static long factorial(int a) {
		long f = 1;
		for (int i = 1; i <= a; i++) f *= i;
		return f;
	}

	public static void main(String[] args) {
		int a = 0, fg = 0;
		while (fg == 0) {
			try {
				System.out.print("\nEnter a number: ");
				a = Integer.parseInt(in.next());
				if (a >= 0) fg = 1;
				else System.out.println("\nInvalid Input! Retry!");
			}
			catch(NumberFormatException e) {
				System.out.println("\nInvalid Input! Retry!");
			}
		}
		System.out.println("\nFactorial of " + a + ": " + factorial(a));
	}
}