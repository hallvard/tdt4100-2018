package eksamensforelesning2018;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name; 
	private List<Account> accounts ; 
	
	
	public Person(String name, long pnr) {
		this.name = name ; 	
		
	
	}
	public Person(String name) {
		this.name = name;
		accounts = new ArrayList<Account>(); 
	}
	
	public void addAccount(Account acc) {
		if(accounts.contains(acc)) {
			return ; 
		}
		
		accounts.add(acc);
		
		acc.setOwner(this);
	}

	public void removeAccount(Account acc) {
		accounts.remove(acc);
	}
	
	public boolean validatePnr(long pnr) {
		String spnr = Long.toString(pnr);
		if(spnr.length()!=11) {
			return false; 
		}
		int dag = Integer.parseInt(spnr.substring(0, 2)); 
		int mnd = Integer.parseInt(spnr.substring(2, 4));
		if (dag<1 || dag>31) {
			return false; 
		}
		if(mnd<1 || mnd>12) {
			return false; 
		}
		
		return true; 
													
		
		
	}
	

	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String toString() {
		return name; 
	}
	
	public static void main(String[] args) {
		Person henrik = new Person("henrik"); 
		Person vegard = new Person("vegard"); 
		Account brukskonto = new Account(1000); 
		Account sparekonto = new Account(500); 
		Account regningskonto = new Account(5);
		henrik.addAccount(brukskonto);
		System.out.println(brukskonto);
		vegard.addAccount(brukskonto);
		vegard.addAccount(sparekonto);
		System.out.println(brukskonto);
		System.out.println(sparekonto);
		System.out.println(vegard.accounts); 

	}
	
	
}
