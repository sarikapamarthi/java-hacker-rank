package introduction;

/*string denoting s
two integers denoting start and end characters(substring) where start to end -1 
constraints 1 < s < 100
o < start < end < n-1*/

import java.util.*;

public class SubstringExp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		// extracting substring within the user given range
		String Substring = S.substring(start, end);
		System.out.println(Substring);
		in.close();
	}
}

