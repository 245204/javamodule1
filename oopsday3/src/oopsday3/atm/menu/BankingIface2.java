package oopsday3.atm.menu;

import oopsday3.atm.NegativeAmountException.NegativeAmountException;
import oopsday3.atm.exception.InsufficcientFundsException;

public interface BankingIface2 {
	public double withdraw(double amount,int actno) throws InsufficcientFundsException;
	public double deposit(double deposit,int actno ) throws NegativeAmountException ;
	public double BalanceEnquiry(int actno);
}
