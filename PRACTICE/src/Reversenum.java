import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("enter number: ");
		int num=n.nextInt();
		int reversed=0;
		
		
		while(num !=0) {
			
			int digit=num%10;
			reversed = reversed*10+digit;
			num/=10;
		}
			System.out.println("Rev number: "+reversed); 
	}

}
