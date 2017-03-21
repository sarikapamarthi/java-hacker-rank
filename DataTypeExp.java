package introduction;

import java.util.*;
import java.io.*;

class DataTypesExp {
	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		//iterating user input
		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127) // byte
					System.out.println("* byte");
				else if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)//short
					System.out.println("* short");
				else if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)//int
					System.out.println("* int");
				else if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)//long
					System.out.println("* short");
			} catch (Exception e) {//error msg
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}
}

