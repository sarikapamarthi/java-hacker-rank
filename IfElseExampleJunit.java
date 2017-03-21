package introduction;

import static org.junit.Assert.*;

import org.junit.Test;

public class IfElseExampleJunit {

	@Test
	public void testCase1() throws Exception {

		String result = IfElseExample.checkingIfElse(6);

		assertEquals("Weird", result);
	}
}

