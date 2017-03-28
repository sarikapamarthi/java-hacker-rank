package introduction;

/*given two integers x and y
compute x/y
constraints:
x and y is not 32-bit signed integer and y is zero exception should occur*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionalHandling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {// try block
			int x = sc.nextInt();
			int y = sc.nextInt();
			// computing x / y
			int c = x / y;
			System.out.println(c);
		} catch (InputMismatchException e1) {// catch block 1
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e2) {// catch block 2
			System.out.println("java.lang.ArithmeticException: / by zero");
		}

	}
}
