package testException;

import org.junit.Test;

public class TellerTest {
	
	Teller teller=new Teller();
	
	@Test(expected=IllegalAccessException.class)
	public void testVallidateUnAcceptedCurrency()
	{
		teller.validateTransaction("AUSD", 100);
	}
	
	
	
	@Test(expected =InvalidTransactionAmountException.class)
	public void testValidateNegativeAmount()
	{
			teller.validateTransaction("EUR", -100);
		
	}

}
