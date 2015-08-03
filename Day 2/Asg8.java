import java.util.*;

public class Asg8 {
	private static Scanner in = new Scanner(System.in);

	private static void printFib(int n) {
		int a = 1, b = 1;
		if (n == 0) {
			System.out.println("\nNo element to display!");
			return;
		}
		System.out.println("\nFibonacci Series: ");
		if (n == 1) {
			System.out.println(a);
			return;
		}
		else {
			for (int i = 0; i < n; i++) {
				System.out.print(a + " ");
				int tmp = a;
				a = b;
				b += tmp;
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int a = 0, fg = 0;
		while (fg == 0) {
			try {
				System.out.print("\nEnter the number of terms of Fibonacci Series: ");
				a = Integer.parseInt(in.next());
				if (a >= 0) fg = 1;
				else System.out.println("\nInvalid Input! Retry!");
			}
			catch(NumberFormatException e) {
				System.out.println("\nInvalid Input! Retry!");
			}
		}
		printFib(a);
	}
}