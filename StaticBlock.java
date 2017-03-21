package introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticBlock {
	public static boolean flag = true;
	public static int B;// static variable
	public static int H;// static variable
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		// if B and H is negative print error msg"
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}
	}

	public static void main(String[] args) {
		if (flag) {// if B and H is positive
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class

/*
 * If b <=0 or h <=0 , the output should be
 * "java.lang.Exception: Breadth and height must be positive" without quotes.
 * 
 * return b * h if both are greater than zero
 */
