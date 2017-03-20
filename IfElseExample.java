package Introductions;


import java.util.*;



public class IfElseExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		ans = checkingIfElse( n,  ans );
		sc.close();

	}


public static String checkingIfElse(int n, String ans ){

	// checking if n is odd
			if (n % 2 == 1) {
				ans = "Weird";
			}
			// if n is even
			else {
				// checking if n is inclusive of range 2 to 5
				if (n >= 2 && n <= 5) {
					System.out.println("Not Weird");
				}

				// checking if n is inclusive of range 6 to 20
				else if (n >= 6 && n <= 20) {
					System.out.println("Weird");
				}
				// if n is greater then 20
				else {
					System.out.println("Not Weird");
				}

			}
			// printing the value for n
			System.out.println(ans);
			return ans;
}
}
/*
 * If n is odd, print Weird If n is even and in the inclusive range of 2 to 5 ,
 * print Not Weird If n is even and in the inclusive range of 6 to 20, print
 * Weird If n is even and greater than 20, print Not Weird
 */rl = ssh://git@github.com/sarikapamarthi/java-hacker-rank.git

import java.util.*;



public class IfElseExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";

		// checking if n is odd
		if (n % 2 == 1) {
			ans = "Weird";
		}
		// if n is even
		else {
			// checking if n is inclusive of range 2 to 5
			if (n >= 2 && n <= 5) {
				System.out.println("Not Weird");
			}

			// checking if n is inclusive of range 6 to 20
			else if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			}
			// if n is greater then 20
			else {
				System.out.println("Not Weird");
			}

		}
		// printing the value for n
		System.out.println(ans);
		sc.close();

	}
}
/*
 * If n is odd, print Weird If n is even and in the inclusive range of 2 to 5 ,
 * print Not Weird If n is even and in the inclusive range of 6 to 20, print
 * Weird If n is even and greater than 20, print Not Weird
 */
