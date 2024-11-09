import java.util.Scanner;

public class condition_3 {

	public static void main(String[] args) {
		
		int x,y,max,min,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enterfirst number: ");
		x=sc.nextInt();
		
		System.out.println("Enter second number: ");
		y=sc.nextInt();
		
		System.out.println("enter third number: ");
		z=sc.nextInt();
		
		
		max=(x>y) && (x>z) ? x: (y>z)?y:z;
		min=(x<y) && (x<z) ? x: (y<z)?y:z ;
		
		System.out.println("Max of " +x+ " and " +y+" is "+max);
		System.out.println("Min of " +x+ " and " +y+" is "+min);
		
	}

}
