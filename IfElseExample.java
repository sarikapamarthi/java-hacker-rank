package introduction;

import java.util.*;

/*
 * If n is odd, print Weird If n is even and in the inclusive range of 2 to 5 ,
 * print Not Weird If n is even and in the inclusive range of 6 to 20, print
 * Weird If n is even and greater than 20, print Not Weird
 */

public class IfElseExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String ans = checkingIfElse(n);
		
		System.out.println(ans);
		sc.close();

	}

	public static String checkingIfElse(int n) {

		String ans = "";
		
		// checking if n is odd
		if (n % 2 == 1) {
			ans = "Weird";
		} else { // if n is even
			// checking if n is inclusive of range 2 to 5
			if (n >= 2 && n <= 5) {
				// System.out.println("Not Weird");
				ans = "Not Weird";
			} else if (n >= 6 && n <= 20) { // checking if n is inclusive of range 6 to 20
				// System.out.println("Weird");
				ans = "Weird";
			} else { // if n is greater then 20
				// System.out.println("Not Weird");
				ans = "Not Weird";
			}
		}
		
		// printing the value for n
		return ans;
	}
}
