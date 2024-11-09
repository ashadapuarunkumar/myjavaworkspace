
import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
//		HomeWork1 work= new HomeWork1();
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int option=0;
		do {
			System.out.println("1.Reverese of a number");
			System.out.println("2.sum of digits in a number");
			System.out.println("3.count degits in a numbear");
			System.out.println("4.Exit");
			System.out.println("plese choose a number");
			option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Reverese of the given number is");
				//int rev=HomeWork1.rev(num);
				//System.out.println(rev);
				
				break;
			case 2:
				System.out.println("sum of digits of the numbe is");
				int sum=HomeWork1.sum(num);
				System.out.println(sum);
				break;
			case 3:
				System.out.println("count degits of a given numbear is");
				int count=HomeWork1.count(num);
				System.out.println(count);
				break;
			case 4:
				System.out.println(" Sucessfully Exited");
				break;
			default:
				System.out.println("invalid option");
				break;
			}
			System.out.println("");
			}while(option!=4);
		    
           
	}

}