package eksamensforelesning2018;

public class SavingsAccount extends Account{
	
	private int maxWithdrawals ; 
	private int withdrawals = 0; 
	public SavingsAccount(int maxWithdrawals, int amount) {
		super(amount); 
		this.maxWithdrawals = maxWithdrawals; 	
	}
	
	public SavingsAccount(int maxWithdrawlas) {
		super(); 
		this.maxWithdrawals = maxWithdrawlas; 
	}
	
	@Override
	public void withdraw(int amount) {
		if(withdrawals < maxWithdrawals) {
			super.withdraw(amount);
			withdrawals ++; 
		}
	}
	
	
}
