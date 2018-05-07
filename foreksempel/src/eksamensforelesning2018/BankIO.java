package eksamensforelesning2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class BankIO {
	
	public void save(String filename, Collection<Account> accounts) throws FileNotFoundException{
		
		PrintWriter writer = new PrintWriter(filename); 
		
		for(Account account: accounts) {
			writer.println(Integer.toString(account.getMoney())+":"+account.getOwner().getName());
		}
		
		
		writer.flush(); 
		writer.close(); 
		
		
	}
	
	public List<Account> load(String filename) {
		List<Account> accounts = new ArrayList<>(); 
		try {
			Scanner scanner = new Scanner(new File(filename));
			while(scanner.hasNext()) {
				
				String line = scanner.nextLine(); 
				//String[] arr = line.split(":");
			
				int money = Integer.parseInt(line.substring(0, line.indexOf(":")));
				String owner = line.substring(line.indexOf(":")+1); 
				Account acc = new Account(money); 
				Person p = new Person(owner); 
				acc.setOwner(p);
				accounts.add(acc);
			}
			
			scanner.close(); 
		}
		catch(FileNotFoundException e) {
			System.out.println("Filnavnet finnes ikke");
		}
		return accounts; 
	}
	
}
