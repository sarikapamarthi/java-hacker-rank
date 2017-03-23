package introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UsernameChecker {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// parsing integer to string
		int testcase = Integer.parseInt(in.nextLine());

		// if testcase is greater than zero
		while (testcase > 0) {
			String Username = in.nextLine();

			// assigning a pattern for username
			String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

			// pattern.compile method
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(Username);

			if (m.find()) {

				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
			testcase--;
		}
	}
}
