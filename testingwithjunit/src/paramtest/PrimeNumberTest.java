package paramtest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import org.junit.Test;

@RunWith(Parameterized.class)
public class PrimeNumberTest {
	
	private final Integer inputNumber;
	private final Boolean expectedResult;
	private PrimeNumber primeNumber;//obj ref
	
	@Before
	public void initialize() {
	
    primeNumber=new PrimeNumber();
}
	
	
public PrimeNumberTest(Integer inputNumber,Boolean expectedResult) {
	this.inputNumber=inputNumber;
	this.expectedResult=expectedResult;
}
@Parameterized.Parameters
public static Collection primeNumber() {
	return Arrays.asList(new Object[][]{
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true},
			{24,false},
			{10,true}}
	);		
}

	@Test
	public void testValidator() {
		System.out.println("Parameterized number is"+inputNumber);
		assertEquals(expectedResult,primeNumber.validate(inputNumber));
		
	}

}
