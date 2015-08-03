import java.util.*;
public class Asg2 {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int a = 0, b = 0, fg = 0;
		while(fg == 0) {
			try {
				System.out.print("\nEnter two numbers: ");
				a = Integer.parseInt(in.next());
				b = Integer.parseInt(in.next());
				fg = 1;
			}
			catch(NumberFormatException e) {
				System.out.println("\nInvalid Input! Retry!\n");
			}
		}
		if (a < b) System.out.println("\nNumber " + a + " is smaller.");
		else if (b < a) System.out.println("\nNumber " + b + " is smaller.");
		else System.out.println("\nBoth numbers are equal.");
	}
}