import java.util.*;

public class Rhombus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int side = -1;
		while(side <= 0) {
			try {
				System.out.print("\nEnter the side of Rhombus: ");
				side = Integer.parseInt(in.nextLine());
				if (side <= 0) System.out.println("\nInvalid Input! Try again!");
			}
			catch(InputMismatchException e) {
				System.out.println("\nInvalid Input! Try again!");
				//return;
			}
			catch(NumberFormatException e) {
				System.out.println("\nInvalid Input! Try again!");
			}
		}
		System.out.println("\n");
		for (int i = 1; i <= side; i++) {
			for (int j = side-i; j >= 0; j--) System.out.print(" ");
			for (int j = 0; j < side; j++) System.out.print("* ");
			System.out.println("");
		}
		System.out.println("");
	}
}