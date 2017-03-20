package introduction;

import java.util.*;
import java.io.*;

class Loops2 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		// no of query t
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {

			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			double temp = a;
			for (int y = 0; y < n; y++) {
				temp = temp + Math.pow(2, y) * b;
				System.out.print((int) temp + " ");
				
			}
			
			System.out.println("");
		}
		in.close();
	}
}

/*
 * t = no of query a = series value 1 b = series value 2 a,b < n value print the
 * series a + 2 pow 0 * b , a + pow 1 * b so on s0,s1 ,s2...sn-1
 */
