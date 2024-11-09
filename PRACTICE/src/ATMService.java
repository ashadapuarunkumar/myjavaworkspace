
public class ATMService {

	public  int balance=7000; 
	
	public  int balance() {
		return balance;
		
	}
	public  void deposite(int amount) {
		balance=balance+amount;
	}
	public  void withdraw(int amount) {
		balance=balance-amount;	
	}
}
