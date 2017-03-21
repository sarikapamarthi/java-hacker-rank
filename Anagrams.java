package introduction;

/*given two strings A and B
if both A and B contains same characters then it is anagram*/

import java.io.*;
import java.util.*;

public class Anagrams {

	static boolean isAnagram(String a, String b) {

		// changing the string to lower case
		String a1 = a.toLowerCase();
		String b1 = b.toLowerCase();

		// putting string in an array
		char[] ar1 = a1.toCharArray();
		char[] ar2 = b1.toCharArray();
		// sorting both the array
		Arrays.sort(ar1);
		Arrays.sort(ar2);

		// checking if both the array is equal
		boolean retval = Arrays.equals(ar1, ar2);
		return retval;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}

