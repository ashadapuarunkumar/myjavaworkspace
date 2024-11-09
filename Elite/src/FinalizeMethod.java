

class Employee{
	int employeeId;
	String employeeName;
	 
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	
	protected void finalize() {
		System.out.println("Finalize");
			
	}
	
}
public class FinalizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1001,"Amar"); 
		Employee e2 = new Employee(1002,"Rocky"); 
		System.out.println(e1);
		System.out.println(e2);
		
		
		System.out.println("======================================");
		e2=e1;
		System.out.println(e1);
		System.out.println(e2);
		
		//Anonymous Object
		new Employee(1003,"Jocky");    //2.Annonymous Object eligible for garbage collection
		
		Employee e3=new Employee(1004,"Ram");
		e3=null;  	//NUllyfiend Reference
		
		
		//RequestJVM to call garbage coollector
		System.gc();
		
	}

}
