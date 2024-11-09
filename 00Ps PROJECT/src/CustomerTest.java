
public class CustomerTest {
	public static void main(String[]args) {
		BankAccount account1=new BankAccount(123456781234l,"amar","SBIN0203053","janagam" );
		BankAccount account2=new BankAccount(123456781233l,"amar","HDFC0203053","Hyd" );
		BankAccount account3=new BankAccount(123456781222l,"amar","SBUN0203053","PDPL" );
		
		
		BankAccount[] customerBankAccounts= {account1,account2,account3};
		
		Customer customer=new Customer(111,"amar",customerBankAccounts);
		customer.displayCustomerDetails();
		
	}
}
