package introduction;

/*string  s contains the string to be compared
integer k contains the value
find smallest and largest string inlexicographical order 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringCompareExp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		int length = sc.nextInt();
		String smallest = "";
		String largest = "";

		// iterating the given string
		for (int i = 0; i <= S.length() - length; i++) {
			System.out.println("i value : " + i);

			// getting substring
			String subString = S.substring(i, i + length);
			System.out.println("substring : " + subString);

			if (i == 0) {// checking if substring is smaller
				smallest = subString;
			}

			System.out.println(subString + ":" + largest + ":" + subString.compareTo(largest));

			if (subString.compareTo(largest) > 0) {// checking for larger
													// substring
				largest = subString;
				System.out.println("largest : " + largest);
			} else if (subString.compareTo(smallest) < 0)
				smallest = subString;

			System.out.println("smallest : " + smallest);
		}
		System.out.println(smallest);
		System.out.println(largest);

	}
}

