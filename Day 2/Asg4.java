import java.util.*;

public class Asg4 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		double grade = 0.0;
		int fg = 0;
		char ch = 'F';
		while(fg == 0) {
			try {
				System.out.print("\nEnter the obtained marks: ");
				grade = Double.valueOf(in.next());
				fg = 1;
			}
			catch (NumberFormatException e) {
				System.out.println("\nInvalid Input! Retry!\n");
			}
		}
		if (grade >= 90.0) ch = 'A';
		else if (grade >= 80.0) ch = 'B';
		else if (grade >= 70.0) ch = 'C';
		else if (grade >= 60.0) ch = 'D';
		else grade = 'F';
		System.out.println("\nGrade: " + ch);
	}
}