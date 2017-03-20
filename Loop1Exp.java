package introduction;

import java.util.*;

public class Loop1Exp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// getting n value from the user
		int N = in.nextInt();
		// loop for 1 to 10
		for (int i = 1; i <= 10; i++) {
			// multipling i * N
			System.out.println(i + "x" + N + "=" + i * N);
			in.close();
		}
	}
}

