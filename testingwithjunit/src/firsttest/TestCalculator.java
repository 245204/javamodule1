package firsttest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestCalculator {
	Calculator calc;
	
	
	
	@Before
	public void setUp()
	{
		calc=new Calculator();
	}
	
	
    @Test
    public void testPowerZero() {
    	int inputBase=0;
    	int exp=0;
    	int expectedValue=0;
    	int actualValue=(int)calc.power(inputBase,exp);
    	assertEquals(expectedValue,actualValue);
    	
    }
    
   
	public void testPower() {
		int inputBase=2;
		int exp= 3;
		int  expectedValue=8;
		int  actualValue=calc.power(inputBase, exp);
		assertEquals(expectedValue,actualValue);
		//fail("Not yet implemented");
	}

}
