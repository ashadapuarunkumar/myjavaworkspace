import java.util.Scanner;
public class Employesalary {

	public static void main(String[] args) {
		int basicscalary;
		int EmpId;
		String EmpName;
		Double HRA,PF,TA,ESI,GRASSPAY,NETPAY;
		int PT=200;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter employee name");
		EmpName=sc.nextLine();
		System.out.println("enter employee Id");
		EmpId=sc.nextInt();
		System.out.println("enter basic pay");
		basicscalary=sc.nextInt();
		HRA=basicscalary*(15.0/100);
     	PF=basicscalary*(5.0/100);
		TA=basicscalary*(2.0/100);
		ESI=basicscalary*(2.5/100);
		GRASSPAY=HRA+PF+TA+ESI+basicscalary;
		NETPAY=GRASSPAY-(PF+PT);
		System.out.println("employee Id is : "+EmpId);
		System.out.println("employee name is : "+EmpName);
		System.out.println("basic pay = "+basicscalary);
		System.out.println("HRA = "+HRA);
		System.out.println("PF = "+PF);
		System.out.println("TA = "+TA);
		System.out.println("ESI = "+ESI);
		System.out.println("GRASSPAY = "+GRASSPAY);
		System.out.println("NETPAY = "+NETPAY);
	}

}
