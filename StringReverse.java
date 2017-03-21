package introduction;

import java.io.*;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		// reversing the given string
		String reverse = S.substring(1) + S.charAt(0);
		System.out.println(reverse);
	}
}

