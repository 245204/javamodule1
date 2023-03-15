package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFactorial {
	 Calculator calc=new Calculator();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("Before test Exceuted");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After exceuting all test cases");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before each test");
	}
	

	@After
	public void tearDown() throws Exception {
		System.out.println("After each Test");
	}

	@Test
	public void testFactorial() {
		int n=5;
		int expectedValue=120;
		int actualValue=calc.factorial(n);
		assertEquals(expectedValue,actualValue);
	}
	
	/*
	 * @Test public void testFactorial2() { fail("Not yet implemented"); }
	 */

}
