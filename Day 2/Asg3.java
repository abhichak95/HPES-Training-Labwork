import java.util.*;

public class Asg3 {
	private final static int N = 5;
	public static void main(String[] args) {
		Random rng = new Random();
		for (int i = 0; i < N; i++)
			System.out.println("Random Number " + (i+1) + ": " + Math.abs(rng.nextInt()+1)%101);
	}
}