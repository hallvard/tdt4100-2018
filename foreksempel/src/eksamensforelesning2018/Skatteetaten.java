package eksamensforelesning2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Skatteetaten implements BankListener{
	
	int minAmount ; 
	Map<Account, List<Integer>> transactions = new HashMap<>(); 
	
	public Skatteetaten(int minAmount) {
		this.minAmount = minAmount; 
	}
	
	@Override
	public void transactionHappened(Account account, int amount) {
		if(amount>minAmount || transactions.containsKey(account)) {
			System.out.println(account + " : " + amount);
			if(transactions.containsKey(account)) {
				transactions.get(account).add(amount);
			}
			else {
				transactions.put(account, new ArrayList<>(Arrays.asList(amount)));
			}
		}
		
	}
	
	
	
}
