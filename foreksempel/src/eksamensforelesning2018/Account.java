package eksamensforelesning2018;

public class Account {
	
	private int money ; 
	private static double rente; 
	
	public Account(int money, double rente) {
		this.money = money ; 
		this.rente = rente ; 
	}
	
	public boolean checkNotNegative(int amount) {
		if (amount<0) {
			return false;  
		}
		return true; 
	}
	
	public Account(int money) {
		
		this(money, 0.02); 
		/*
		this.money = money ; 
		this.rente = 0.02;
		*/
	}
	public Account() {
		this(0, 0.02); 
	}
	
	public int getMoney() {
		return money; 
	}
	public double getRente() {
		return rente; 
	}
	
	public void setRente(double rente) {
		
		this.rente = rente; 
		
	}
	
	public void deposit(int amount) {
		if(this.checkNotNegative(amount)) {
			this.money += amount; }
		else {
			throw new IllegalArgumentException("Ugyldig input");
		}
	}
	
	public void withdraw(int amount) {
		if(this.checkNotNegative(amount)) {
		this.money -= amount; }
		else {
			throw new IllegalArgumentException("Ugyldig input");

		}
	}
	
	public static void main(String[] args) {
		Account acc = new Account(); 
		Account.checkNotNegative(-50); 
	}
}
