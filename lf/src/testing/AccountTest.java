package testing;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class AccountTest extends TestCase {

	private Account account;
	private double epsilon = 0.2;
	
	@Before
	public void setUp() {
		account = new Account(1000.0, 5.0);
	}
	
	@Test
	public void testGetters() {
		assertEquals(1000.0, account.getBalance(), epsilon);
		assertEquals(5.0, account.getInterestRate(), epsilon);
	}
	
	
	@Test // Avdekker feil
	public void testSetInterestRate() {
		account.setInterestRate(10);
		assertEquals(10.0, account.getInterestRate(), epsilon);
		try {
			account.setInterestRate(-2.0);
			fail("Account can not have negative interest rate");
		} catch (IllegalArgumentException e) {
			assertEquals(10.0, account.getInterestRate(), epsilon);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException, was " + e.getClass());
		}
	}
	
	@Test
	public void testDeposit() {
		account.deposit(100);
		assertEquals(1100.0, account.getBalance(), epsilon);
		try {
			account.deposit(-100);
			fail("Should not be able to deposit negative amounts");
		} catch (IllegalArgumentException e) {
			assertEquals(1100.0, account.getBalance(), epsilon);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException, was " + e.getClass());
		}
	}
	
	
	@Test // Avdekker feil
	public void testWithdraw() {
		account.withdraw(100);
		assertEquals(900.0, account.getBalance(), epsilon);
		try {
			account.withdraw(-100);
			fail("Should not be ablte to withdraw negative amounts");
		} catch (IllegalArgumentException e) {
			assertEquals(900.0, account.getBalance(), epsilon);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException, was " + e.getClass());
		}
		
		try {
			account.withdraw(10000.0);
			fail("Should not be able to withdraw more money than account has");
		} catch (IllegalArgumentException e) {
			assertEquals(900.0, account.getBalance(), epsilon);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException, was " + e.getClass());
		}
		
	}
	
	
	@Test // Avdekker feil
	public void testAddInterest() {
		account.addInterest();
		assertEquals("Expected " + String.valueOf(1050.0) + " was " + String.valueOf(account.getBalance()),
					1050.0, account.getBalance(), epsilon);
	}
	
	
}
