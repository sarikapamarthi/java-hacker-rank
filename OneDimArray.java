package introduction;

/*n defines the no of values in an array
 a defines the array
 val defines the integers to be stored inside the array
 get the array values from user and print it on the console
*/

import java.util.*;

public class OneDimArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			// int val = scan.nextInt();
			// a[i] = val;
			a[i] = scan.nextInt();
		}
		scan.close();

		// Prints each sequential element in array a
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
