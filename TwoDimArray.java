package introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDimArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// assigning array length
		int arr[][] = new int[6][6];
		int sum, final_sum = 0;
		// iterating through the array
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		// iterating through the array and adding the sum of the values
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];
				final_sum = Math.max(sum, final_sum);
			}
		}
		System.out.println(final_sum);

		in.close();
	}
}

