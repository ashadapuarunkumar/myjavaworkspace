import java.util.Scanner;

public class  IncomeTax{
	public static void taxCal (long salary) {
		if(salary<=300000){
			double totalTax=0;
			System.out.println("tax amount = "+totalTax);
			System.out.println("in hand amount= "+(salary-totalTax));
		}
		else if(salary<=700000) {
			double totalTax= (salary-300000)*0.05;
			System.out.println("tax amount = "+totalTax);
			System.out.println("in hand amount= "+(salary-totalTax));
		}
		else if(salary<=1000000) {
			double totalTax= ((salary-700000)*0.10)+(400000*0.05);
			System.out.println("tax amount = "+totalTax);
			System.out.println("in hand amount= "+(salary-totalTax));
		}
		else if(salary<=1200000) {
			double totalTax= ((salary-1000000)*0.15)+(400000*0.05)+(300000*0.10);
			System.out.println("tax amount = "+totalTax);
			System.out.println("in hand amount= "+(salary-totalTax));
		}
		else if(salary<=1500000) {
			double totalTax= ((salary-1200000)*0.20)+(400000*0.05)+(300000*0.10)+(200000*0.15);
			System.out.println("tax amount = "+totalTax);
			System.out.println("in hand amount= "+(salary-totalTax));
		}
		else if(salary>1500000) {
			double totalTax= ((salary-1500000)*0.30)+(400000*0.05)+(300000*0.10)+(200000*0.15)+(300000*0.20);
			System.out.println("tax amount = "+totalTax);
			System.out.println("in hand amount= "+(salary-totalTax));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Salary");
		long salary=sc.nextLong();
		taxCal(salary);
		

	}

}