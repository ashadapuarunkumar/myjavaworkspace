import java.util.*;
public class sumOfTwoNumbers {

	public static void main(String[]args)  {
		 Scanner n=new Scanner(System.in);
		 int num1,num2;
		 
		 System.out.println("Enter Numbers: ");
		 num1=n.nextInt();
		 num2=n.nextInt();
		 
		 int sum=num1+num2;
		 System.out.println("--------");
		 System.out.println(sum);
		 
		 int sub=num1-num2;
		 System.out.println("--------");
		 System.out.println(sub);
		 
		 int mul=num1*num2;
		 System.out.println("--------");
		 System.out.println(mul);
		 
		 double div=num1/num2;
		 System.out.println("--------");
		 System.out.println(div);
		 
		 double run=num1%num2;
		 System.out.println("--------");
		 System.out.println( );
		 
		 n.close();
		 
//	     int num1,num2;
//		
//	     System.out.println("Enter two numbers: ");
//	     
//	     num1=n.nextInt();
//	     num2=n.nextInt();
//	     
//		if( num1 > num2)  {   
//			
//			System.out.println(num1+ " is greter than "+num2);
//		} else if(num2>num1) {
//			System.out.println(num2+ " is greater than " +num1);
//		}else {
//			System.out.println(num1+" and "+num2+ " Equal ");
//		}
//		
	
	}

}
