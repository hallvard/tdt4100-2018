package eksamensforelesning2018;

public class Account implements Comparable<Account>{
	
	private int money ; 
	private double rente; 
	private static int accountCounter = 0; 
	private int id ; 
	private Person owner ; 
	
	public Account(int money, double rente) {
		this.money = money ; 
		this.rente = rente ; 
		this.id = accountCounter++; 
	}
	
	public void setOwner(Person p) {
		if(owner==p) {
			return; 
		}
		Person oldOwner = owner ; 
		owner = p; 
		if(p!= null) {
			p.addAccount(this);
		}
		if(oldOwner!= null) {
			oldOwner.removeAccount(this);
		}
	}
	
	public static boolean checkNotNegative(int amount) {
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
	
	public String toString() {
		return money +": " + owner; 
	}
	
	public Person getOwner() {
		return owner; 
	}
	public static void main(String[] args) {
		Account acc = new Account(); 
		
	}

	public int compareTo(Account o) {
		//Returnere et positivt tall, hvis dette objekter er større
		//0 Hvis de er like
		//Et negativt tall hvis dette objektet er mindre
		return this.getMoney()-o.getMoney();
	}
}
