import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
		
		ATMService service=new ATMService();
		
		Scanner p=new Scanner(System.in);
		int option=0;
		do {
			System.out.println("XYZ ATM SERVICES");
			System.out.println("----------------");
			System.out.println("1.Deposite");
			System.out.println("2.Withdraw");
			System.out.println("3.Balance");
			System.out.println("0. Exit");
			System.out.println("Please enter your option:");
			option=p.nextInt();
			
			
			switch (option) {
			case 1:
				System.out.println("Enter Deposit Amount: ");
				int depositAmount=p.nextInt();
				service.deposite(depositAmount);
				System.out.println("Deposit successful!!");
				break;
			case 2:
				System.out.println("Enter Withdraw Amount");
				int withdrawAmount=p.nextInt();
				if(withdrawAmount > service.balance()) {
					System.out.println("Insufficient Balance!!");
				}else if(withdrawAmount > 100 ) {
					System.out.println("100/500 Notes available");
				}else if(withdrawAmount != withdrawAmount%10000000 ) {
						System.out.println("100/500 Notes available");
				}else {
					System.out.println("Withdraw processing....");
				}
				service.withdraw(withdrawAmount);
				System.out.println("Withdraw successful!!");
				break;
			case 3:
				int balance=service.balance();
				System.out.println("Balance "+balance);
				break;
			case 0:
				System.out.println("Bye!!");
				System.exit(0);   //shut down JVM
			default:
				System.out.println("Invalid Option!");
				break;
	
			}
		
		 
	} while (option !=0);

}
}
