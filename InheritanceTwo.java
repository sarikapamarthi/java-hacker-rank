package introduction;

/*create a class named Arithmetic that adds two integers and returns it as sum
create a child class Adder that inherits from parent*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//class Arithmetic with a method add which returns the sum value
class Arithmetic {
	public int add(int a, int b) {
		return a + b;
	}
}

// child class Adder extends the parent class Arithmetic
class Adder extends Arithmetic {

}

public class InheritanceTwo {
	public static void main(String[] args) {// main method
		// Create a new Adder object
		Adder a = new Adder();

		// Print the name of the superclass on a new line
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

		// Print the result of 3 calls to Adder's `add(int,int)` method as 3
		// space-separated integers:
		System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
	}
}

