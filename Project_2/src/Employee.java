import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		//Variable declaration
		
		int employeeId;
		int basicSalary;
		String employeeName;
		double PF,HRA,TA,ESI,NETPAY,GRASSPAY;
		int PT=200;
		
		//Object creation
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter employee Name: ");
		employeeName=sc.nextLine();
	
		System.out.println("Enter employee ID: ");
		employeeId = sc.nextInt();
		
		System.out.println("Enter BasiC SALARY: ");
		basicSalary=sc.nextInt();
		
		HRA=basicSalary*(15.0/100);
     	PF=basicSalary*(5.0/100);
		TA=basicSalary*(2.0/100);
		ESI=basicSalary*(2.5/100);
		GRASSPAY=HRA+PF+TA+ESI+basicSalary;
		NETPAY=GRASSPAY-(PF+PT);
		
		//conclusion
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Basic Salary: " +basicSalary);
		System.out.println("HRA: "+HRA);
		System.out.println("PF: "+PF);
		System.out.println("TA: "+TA);
		System.out.println("ESI: "+ESI);
		System.out.println("GRASSPAY: "+GRASSPAY);
		
		
		 
	
	}

}
