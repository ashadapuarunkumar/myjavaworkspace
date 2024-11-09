import java.util.Scanner;

		public class doublesum {

			public static void main(String[] args) {
				    Scanner in=new Scanner(System.in);
						Double num1,num2;   //variable declaration
						
						//Object creation
						 
						
						System.out.println("enter first number: ");
						num1=in.nextDouble();
						
						System.out.println("enter second name: ");
						num2=in.nextDouble();
						
						//calculate total
						Double sum=num1 + num2;
						
						//display results
						System.out.println("sum of "+num1+ " and " +num2+ " is " +sum);
					
						in.close();

	}

}
