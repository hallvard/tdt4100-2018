package eksamensforelesning2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Bank implements Iterable<Account>{
	
	private List<Account> accounts = new ArrayList<Account>(); 
	private Map<Person, Collection<Account>> bank = new HashMap<>(); 
	
	public void addAccount(Account acc) {
		if(!accounts.contains(acc)) {
			accounts.add(acc);
		}
	}
		
	public void removeAccount(Account acc) {
		accounts.remove(acc);
	}
	public void addAccount(Person p, Account a) {
		
		for(Person person: bank.keySet()) {
			if(bank.get(person).contains(a)) {
				bank.get(person).remove(a);
			}
		}
		
		if(bank.containsKey(p)) {
			bank.get(p).add(a);
			return ;
		}
		bank.put(p, Arrays.asList(a));
		
		
		
		
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
		Account brukskonto = new Account(1500); 
		Account sparekonto = new Account(2000); 
		Account regningskonto = new Account(5);
		
		henrik.addAccount(regningskonto);
		vegard.addAccount(brukskonto);
		vegard.addAccount(sparekonto);
		
		Bank bank = new Bank(); 
		
		bank.addAccount(regningskonto);
		bank.addAccount(brukskonto);
		bank.addAccount(sparekonto);
		
		
		RichAccountIterator it = new RichAccountIterator(bank.accounts, 1000);
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println(bank.getTotalAmountOfMoneyInBank()); 

	}

	@Override
	public Iterator<Account> iterator() {
		// TODO Auto-generated method stub
		return accounts.iterator(); 
	}
	
	
	

}
