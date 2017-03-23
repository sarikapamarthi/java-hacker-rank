package introduction;

/*add sing() method to bird class and return it*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//class animal contains walk method
class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

// class bird extends parent class animal and contains its own method fly and
// sing
class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	void sing() {
		System.out.println("I am singing");
	}
}

public class InheritanceOne {

	public static void main(String args[]) {// main method
		// object is created for the child class bird
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}
}
