package introduction;

import java.io.*;
import java.util.*;

public class StringTokensExp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// assigning string tokenizer 
		StringTokenizer tokenizer = new StringTokenizer(s, " !,?.\\_'@");
		// counting each strings as no of tokens
		System.out.println(tokenizer.countTokens());

		while (tokenizer.hasMoreElements()) {
			System.out.println(tokenizer.nextToken());
		}
		scan.close();
	}
}

