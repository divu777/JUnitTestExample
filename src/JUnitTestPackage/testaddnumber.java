package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumber {

	@Test
	public void test() {
		JUnitFunctions junitnumbers = new JUnitFunctions();
		int result = junitnumbers.addNumbers(100, 200);
		assertEquals(300, result);
		
	}

}