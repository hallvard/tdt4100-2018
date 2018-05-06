package eksamensforelesning2018;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {
	
	@Override
	public int compare(Account o1, Account o2) {
		return o2.getMoney()-o1.getMoney(); 
	}

}
