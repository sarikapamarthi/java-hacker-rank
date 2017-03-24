package introduction;

import java.util.*;
import java.io.*;

/*output:
	Hello I am a motorcycle, I am a cycle with an engine.
	My ancestor is a cycle who is a vehicle with pedals.*/
//parent class
class BiCycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

// child class extends parent class
class MotorCycle extends BiCycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	// In this the parent class method is kept in temp
	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}

class MethodOverridingTwo {
	public static void main(String[] args) {
		MotorCycle M = new MotorCycle();
	}
}

