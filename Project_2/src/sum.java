import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
				int num1,num2,sum;   //variable declaration
				num1=num2=0; //variable Initialization
				
				//Object creation
				Scanner in = new Scanner (System.in);
				
				System.out.println("enter first number: ");
				num1=in.nextInt();
				
				System.out.println("enter second name: ");
				num2=in.nextInt();
				
				//calculate total
				sum=num1 + num2;
				
				//display results
				System.out.println("sum of "+num1+ " and " +num2+ " is " +sum);
			

	}

}
