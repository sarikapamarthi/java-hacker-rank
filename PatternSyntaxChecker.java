package introduction;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		// if testcse is greater than zero
		while (testCases > 0) {
			String pattern = in.nextLine();

			try {
				Pattern pat = Pattern.compile(pattern);// pattern.compile method
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}

