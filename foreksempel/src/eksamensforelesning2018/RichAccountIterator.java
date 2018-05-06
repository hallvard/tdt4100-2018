package eksamensforelesning2018;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class RichAccountIterator implements Iterator<Account>{
	
	List<Account> accounts = new ArrayList<Account>(); 
	int amount ; 
	int count = 0; 
	public RichAccountIterator(List<Account> accounts, int amount) {
		this.accounts = accounts ; 
		this.amount = amount; 
	}
	
	@Override
	public boolean hasNext() {
		for(int i=count; i<accounts.size(); i++ ) {
			if(accounts.get(i).getMoney()>amount) {
				return true ; 
			}
		}
		return false; 
	}

	@Override
	public Account next() {
		if(!hasNext()) {
			throw new NoSuchElementException();}
		for(int i=count; i<accounts.size(); i++ ) {
			
			if(accounts.get(i).getMoney()>amount) {
				count = i+1;
				return accounts.get(i) ; 
			}
		}
		return null ;
	}

}
