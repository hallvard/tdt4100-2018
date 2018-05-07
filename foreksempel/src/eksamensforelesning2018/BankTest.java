package eksamensforelesning2018;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BankTest extends TestCase{
	Bank bank; 
	
	@Before
	public void setUp() throws Exception {
		bank = new Bank(); 
		bank.addAccount(new Account(1000));
		bank.addAccount(new Account(2000));
		bank.addAccount(new Account(3000));
		bank.addAccount(new Account(4000));

	}

	@Test
	public void testGetTotalAmount() {
		assertEquals( 10000, bank.getTotalAmountOfMoneyInBank());
	}

}
