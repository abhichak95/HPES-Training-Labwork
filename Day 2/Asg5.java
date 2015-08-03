import java.util.*;

public class Asg5 {
	private static Scanner in = new Scanner(System.in);
	private static boolean isPrime(int a) {
		if (a == 1) return false;
		if (a % 2 == 0) return false;
		for (int i = 3; i*i <= a; i++) {
			if (a % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int a = 0, fg = 0;
		while (fg == 0) {
			try {
				System.out.print("\nEnter a number: ");
				a = Integer.parseInt(in.next());
				fg = 1;
			}
			catch(NumberFormatException e) {
				System.out.println("\nInvalid Input! Retry!\n");
			}
		}
		if (isPrime(a)) System.out.println("\nNumber is PRIME");
		else System.out.println("\nNumber is NOT PRIME");
	}
}