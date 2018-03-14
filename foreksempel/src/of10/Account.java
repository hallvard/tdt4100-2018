package of10;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class Account {

	private double balance;
	private double interestRate;
	private Stack<Double> undo = new Stack(); 
	private Stack<Double> redo = new Stack(); 

	public Account(double balance, double interestRate) {
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
		undo.add(-amount); 
		redo = new Stack(); 
	}
	
	public void withdraw(double amount) {
		checkNotNegative(amount, "Amount");
		double newBalance = balance - amount;
		if (newBalance < 0) {
			throw new IllegalArgumentException("The balance cannot become negative: " + newBalance);
		}
		balance = newBalance;
		undo.add(amount);
		redo = new Stack(); 
	}
	public void undo() {
		double amount = undo.pop();
		if(amount>0) {
			this.deposit(amount);
		}
		else {
			this.withdraw(-amount);
		}
		this.redo.add(amount);
	}
	
	public void redo() {
		try {
		double amount = redo.pop(); 
		if (amount>0) {
			this.withdraw(amount);
		}
		else {
			this.deposit(-amount);
		}}
		catch(EmptyStackException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public void addInterest() {
		deposit(balance * interestRate / 100);		
	}
	
	public static void main(String[] args) {
		Account acc1 = new Account(2000, 0.5); 
		System.out.println(acc1);
		acc1.deposit(5000);
		System.out.println(acc1);
		acc1.undo();
		System.out.println(acc1);
		acc1.deposit(2000);
		acc1.redo();
		System.out.println(acc1);
		
		Account acc2 = new Account(1500, 0.5); 
		Account acc3 = new Account(25000, 0.5); 
		
		List<Account> bank = Arrays.asList(acc1, acc2, acc3); 
		/*
		Comparator<Account> comp = new Comparator<Account>() {

			@Override
			public int compare(Account o1, Account o2) {
				return (int) (o1.getBalance()-o2.getBalance()); 
			}
			
		}; 
		
		System.out.println(bank);
		Collections.sort(bank, (o1, o2) -> (int) (o1.getBalance()-o2.getBalance()));
		System.out.println(bank);
		*/
	}
}
