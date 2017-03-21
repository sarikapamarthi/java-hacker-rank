package introduction;

/*string A and B
sum the string A and B = string/length()
check if A or B comes before in dictionary
print the two string with first character in upper case
*/


import java.util.*;

public class StringIntroduction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		// adding the length of the both string
		int length = A.length() + B.length();
		System.out.println("length of two is : " + length);

		// comparing the String
		int cmp = A.compareTo(B);
		System.out.println("cmp " + cmp);

		// checking the lexical order
		String lexicalOrder = (A.compareTo(B) > 0) ? "YES" : "NO";
		System.out.println("Compare value is : " + lexicalOrder);

		// printing the first character in upper case
		System.out
				.println(A.toUpperCase().charAt(0) + A.substring(1) + " " + B.toUpperCase().charAt(0) + B.substring(1));

		sc.close();

	}

}

