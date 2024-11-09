
public class EmployeeTest {
	public static void main(String[]args) {
		Address employeeaddress1=new Address("Hyd","Telangana","India");
		Address employeeaddress2=new Address("Hnk","Telangana","India");
		
		Address[] employeeAddress= {employeeaddress1,employeeaddress2};
				
	
		Employee emp=new Employee(100,"Amar",9988776655L,employeeAddress);
		
		emp.displayEmployee();
	}
}
