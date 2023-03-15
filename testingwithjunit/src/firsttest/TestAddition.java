package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAddition {
	Calculator calc=new Calculator();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before execution begins");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after excetutionof all test cases");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test");
	}

	@Test
	public void testAddition() {
		int a=2;
		int b=1;
		int expectedValue=3;
		int actualValue=calc.addition(a, b);
		assertEquals(expectedValue,actualValue);
		
	}

}
