package eksamensforelesning2018;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Bank implements Iterable<Account>, ObservableBank{
	
	private List<Account> accounts = new ArrayList<Account>(); 
	private Map<Person, Collection<Account>> bank = new HashMap<>(); 
	private Collection<BankListener> lyttere = new ArrayList<>(); 
	private BankIO io = new BankIO() ; 
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
			this.fireTransactionHappened(acc, amount);

		}
	}
	public List<Person> getCustomers() {
	
		return accounts.stream().map(account->account.getOwner()).distinct().collect(Collectors.toList());
	}
	
	public boolean isCustomer(Person p) {
		return accounts.stream().allMatch(a->a.getOwner()==p); 
	}
	
	public List<Account> getMyAccounts(Person p) {
		return accounts.stream().filter(a->a.getOwner()==p).collect(Collectors.toList());
		/*
		List<Account> a = new ArrayList<Account>(); 
		for(Account accs: accounts) {
			if(accs.getOwner()==p) {
				a.add(accs); 
			}
		}
		return a; */
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
		this.fireTransactionHappened(acc, amount);
	}
	
	public boolean applyForLoan(Person p, int salary) {
		if(salary>600000 || p instanceof Employee) {
			if(p instanceof Employee) {
				((Employee) p).sayHello();
			}
			return true; 
		}
		return false; 
	}

	
	public static void main(String[] args) {
		Person henrik = new Person("henrik"); 
		Person vegard = new Person("vegard"); 
		Account brukskonto = new Account(1500); 
		Account sparekonto = new Account(2000); 
		Account regningskonto = new Account(1000);
		
		
		henrik.addAccount(regningskonto);
		vegard.addAccount(brukskonto);
		vegard.addAccount(sparekonto);
		
		Bank bank = new Bank(); 
		
		bank.addAccount(regningskonto);
		bank.addAccount(brukskonto);
		bank.addAccount(sparekonto);
		
		bank.accounts.sort((o1, o2)->o1.getMoney()-o2.getMoney());
		bank.getAccountsWithMoreMoneyThan(1800);
		
		
		/*
		BankListener skatt = new Skatteetaten(10000); 
		
		bank.addListener(skatt);
		
		bank.deposit(brukskonto, 2000);
		bank.deposit(sparekonto, 90000000);
		bank.withdraw(sparekonto, 4);
		System.out.println(bank.accounts);
		
		
		bank.save("teeest.txt");
		bank.load("teeest.txt");
		System.out.println(bank.accounts);
		*/
		

		


	}

	@Override
	public Iterator<Account> iterator() {
		return accounts.iterator(); 
	}

	@Override
	public void addListener(BankListener listener) {
		if (!lyttere.contains(listener)) {
			lyttere.add(listener); 
		}
	}

	@Override
	public void removeListener(BankListener listener) {
		lyttere.remove(listener); 
		
	}

	@Override
	public void fireTransactionHappened(Account acc, int amount) {
		
		for(BankListener listener: lyttere) {
			listener.transactionHappened(acc, amount);
		}
		//lyttere.stream().forEach(l->l.transactionHappened(acc, amount));
	}
	
	public void save(String filename){
		try {
		
		io.save(filename, accounts);
		}
		catch(FileNotFoundException e) {
			e.getStackTrace();
			
			System.out.println("dritt..");
		}
	}
	
	public void load(String filename) {
		this.accounts = io.load(filename);
	}
	
	
	

}
