package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring{

	@Test
	public void test() {
		JUnitFunctions junitstring = new JUnitFunctions();
		String result = junitstring.addString("capstone", "project");
		assertEquals("capstoneproject", result);
		
	}

}