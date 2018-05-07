package eksamensforelesning2018;

public interface ObservableBank {
	
	public void addListener(BankListener listener) ; 
	
	public void removeListener(BankListener listener) ; 
	
	public void fireTransactionHappened(Account acc, int amount); 

}
