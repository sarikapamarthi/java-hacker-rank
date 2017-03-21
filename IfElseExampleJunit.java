package introduction;

import static org.junit.Assert.*;

import org.junit.Test;

public class IfElseExampleJunit {

	@Test
	public void testCase1() throws Exception {

		String result = IfElseExample.checkingIfElse(6);

		assertEquals("Weird", result);
	}
	
	@Test
	public void testCase2() throws Exception {

		String result = IfElseExample.checkingIfElse(3);

		assertEquals("Weird", result);
	}
	
	@Test
	public void testCase3() throws Exception {

		String result = IfElseExample.checkingIfElse(54);

		assertEquals("Not Weird", result);
	}
}

