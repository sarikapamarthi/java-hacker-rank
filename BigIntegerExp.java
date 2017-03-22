package introduction;

import java.math.BigInteger;

/*given two integers a and b
return sum a +b
return a * b*/

import java.util.*;

public class BigIntegerExp {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		// assigning datatype Biginteger to a and b
		BigInteger a = new BigInteger(sc.nextLine());
		BigInteger b = new BigInteger(sc.nextLine());

		// adding a and b
		BigInteger sum = a.add(b);
		// product of a and b
		BigInteger product = a.multiply(b);

		// printinh the output on the console
		System.out.println(sum);
		System.out.println(product);

	}

}

