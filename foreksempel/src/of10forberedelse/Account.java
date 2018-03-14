package of10forberedelse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Account {

	private double balance;
	private double interestRate;
	private Stack<Double> transactions ; 

	public Account(double balance, double interestRate) {
		transactions = new Stack(); 
		checkNotNegative(balance, "Balance");
		this.balance = balance;
		setInterestRate(interestRate);
	}
	
	public Account(){
		
	}

	protected void checkNotNegative(double value, String valueName) {
		if (value < 0) {
			throw new IllegalArgumentException(valueName + " cannot be negative: " + value);
		}
	}

	public String toString() {
		return String.format("[Account balance=%f interestRate=%f", balance, interestRate);
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		checkNotNegative(interestRate, "Interest rate");
		this.interestRate = interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		checkNotNegative(amount, "Amount");
		balance = balance + amount;
		transactions.add(-amount);
	}
	
	public void withdraw(double amount) {
		checkNotNegative(amount, "Amount");
		double newBalance = balance - amount;
		if (newBalance < 0) {
			throw new IllegalArgumentException("The balance cannot become negative: " + newBalance);
		}
		balance = newBalance;
		transactions.add(amount);
	}
	public void undo() {
		double amount = transactions.pop(); 
		if (amount<0) {
			this.withdraw(-amount);
		}
		else {
			this.deposit(amount);
		}
	}
	
	public void addInterest() {
		deposit(balance * interestRate / 100);		
	}
	
	public static void main(String[] args) {
		Account acc1 = new Account(2000, 3.5); 
		System.out.println(acc1); 
		acc1.deposit(200);
		System.out.println(acc1); 
		acc1.undo();
		System.out.println(acc1); 
		Account acc2 = new Account(6000, 0.45); 
		
		Account acc3 = new Account(5000, 2.0); 
		
		List<Account> bank = Arrays.asList(acc1, acc2, acc3); 
		Comparator<Account> comparator = new Comparator<Account>() {

			@Override
			public int compare(Account o1, Account o2) {
				return (int) (o1.getBalance()-o2.getBalance());
			}
			
		};
		
		System.out.println(bank);
		Collections.sort(bank, ( a,  b) -> (int) (a.getBalance()-b.getBalance()));
		
	
		
		System.out.println(bank);

	}
}
