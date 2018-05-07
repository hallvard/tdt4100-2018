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
	
	@Test
	public void testFail() {
		Account acc = new Account(1000); 
		try {
			acc.withdraw(-50);
			
			fail();
		}
		catch(IllegalArgumentException e) {
			
		}
	}
	@Test
	public void testAccountWithMoreMoneyThan() {
		assertEquals(2, bank.getAccountsWithMoreMoneyThan(2500).size());
		Account a = new Account(10000); 
		bank.addAccount(a);
		assertEquals(a, bank.getAccountsWithMoreMoneyThan(6000).get(0)); 
	}
	
	@Test
	public void testApplyForLoan() {
		Person p = new Person("Vegard");
		assertTrue(bank.applyForLoan(p, 750000));
		assertFalse(bank.applyForLoan(p, 400000));
		Person e = new Employee("hallvard");
		assertTrue(bank.applyForLoan(e, 0));
	}

}
