package eksamensforelesning2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
	
	private Collection<Account> accounts = new ArrayList<Account>(); 
	private Map<Person, List<Account>> bank = new HashMap(); 
	
	public void addAccount(Account acc) {
		if(!accounts.contains(acc)) {
			accounts.add(acc);
		}
	}
		
	public void removeAccount(Account acc) {
		accounts.remove(acc);
	}
	public void addAccount(Person p, Account a) {
	
		if(bank.containsKey(p)) {
			bank.get(p).add(a);
			return ;
		}
		bank.put(p, Arrays.asList(a));
		
		for(Person person: bank.keySet()) {
			if(bank.get(person).contains(a)) {
				bank.get(person).remove(a);
			}
		}
		
		
	}
	
	
	public int getTotalAmountOfMoneyInBank() {
		int total = 0; 
		for(Account acc: accounts) {
			total += acc.getMoney(); 
		}
		return total; 
	}
	
	public void deposit(Account acc, int amount) {
		if(accounts.contains(acc)) {
			acc.deposit(amount);
		}
	}
	public List<Account> getMyAccounts(Person p) {
		List<Account> a = new ArrayList<Account>(); 
		for(Account accs: accounts) {
			if(accs.getOwner()==p) {
				a.add(accs); 
			}
		}
		return a; 
	}

	public void withdraw(Account acc, int amount) {
		acc.withdraw(amount);
	}
	
	public static void main(String[] args) {
		Person henrik = new Person("henrik"); 
		Person vegard = new Person("vegard"); 
		Account brukskonto = new Account(1000); 
		Account sparekonto = new Account(500); 
		Account regningskonto = new Account(5);
		
		henrik.addAccount(regningskonto);
		vegard.addAccount(brukskonto);
		vegard.addAccount(sparekonto);
		
		Bank bank = new Bank(); 
		
		//bank.addAccount(regningskonto);
		bank.addAccount(brukskonto);
		bank.addAccount(sparekonto);
	
		
		System.out.println(bank.getTotalAmountOfMoneyInBank()); 

	}
	
	
	

}
