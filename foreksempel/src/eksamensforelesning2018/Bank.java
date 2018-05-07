package eksamensforelesning2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		return accounts.stream().mapToInt(a->a.getMoney()).sum(); 
		/*
		int total = 0; 
		for(Account acc: accounts) {
			total += acc.getMoney(); 
		}
		return total; 
		*/
	}
	
	public void deposit(Account acc, int amount) {
		if(accounts.contains(acc)) {
			acc.deposit(amount);
		}
	}
	public List<Person> getCustomers() {
	
		return accounts.stream().map(account->account.getOwner()).distinct().collect(Collectors.toList());
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
	public List<Account> getAccountsWithMoreMoneyThan(int amount) {
	
		return accounts.stream().filter(account->account.getMoney()>amount).collect(Collectors.toList());
		/*
		  List<Account> accs ; 
		  for(Account a: accounts) {
			 if(a.getMoney()>amount) {
				 accs.add(a);
			 }
		 }
		 return accs ; 
		 */
	}

	public void withdraw(Account acc, int amount) {
		acc.withdraw(amount);
	}
	
	public static void main(String[] args) {
		Person henrik = new Person("henrik"); 
		Person vegard = new Person("vegard"); 
		Account brukskonto = new Account(2000); 
		Account sparekonto = new Account(2000); 
		Account regningskonto = new Account(5);
		
		
		henrik.addAccount(regningskonto);
		vegard.addAccount(brukskonto);
		vegard.addAccount(sparekonto);
		
		Bank bank = new Bank(); 
		
		bank.addAccount(regningskonto);
		bank.addAccount(brukskonto);
		bank.addAccount(sparekonto);
		bank.addAccount(new Account(500));
		bank.addAccount(new Account(10000));
		bank.addAccount(new Account(850));
		
		for(Account acc: bank) {
			
		}

		
		System.out.println(bank.accounts);
		
		bank.accounts.sort((o1, o2) -> o1.getMoney()-o2.getMoney());
		System.out.println(bank.accounts);

		


	}

	@Override
	public Iterator<Account> iterator() {
		return accounts.iterator(); 
	}
	
	
	

}
