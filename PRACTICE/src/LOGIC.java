import java.util.Scanner;

public class LOGIC {

	public static void main(String[] args) {
		
		int x,y,max,min;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enterfirst number: ");
		x=sc.nextInt();
		
		System.out.println("Enter second number: ");
		y=sc.nextInt();
		
		max=(x>y) ? x : y;
		min=(x<y) ? x: y;
		
		System.out.println("Max of " +x+ " and " +y+" is "+max);
		System.out.println("Min of " +x+ " and " +y+" is "+min);
		
	}

}
