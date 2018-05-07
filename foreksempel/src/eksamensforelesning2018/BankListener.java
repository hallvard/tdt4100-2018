package eksamensforelesning2018;

public interface BankListener {
	
	public void transactionHappened(Account account, int amount); 
}
