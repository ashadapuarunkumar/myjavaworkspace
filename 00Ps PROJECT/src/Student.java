
public class Student {
	
	//Instance Variable
	int studentId;
	String studentName;
	double studentMarks;
	
	// static variable
	static String studentBatchCode="2024-12345";
	
	//Constructor
	public Student(int studentId,String studentName, double studentMarks) {
		System.out.println("Constructor.......");
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentMarks=studentMarks;
		//this.studentBatchCode=studentBatchCode;
		
	}
	public Student() {
		System.out.println("0 rgguments");
	}

	// Instance Method
	public void studentResult() {
		if(studentMarks>40) {
			System.out.println("Student Result: Pass");
		}else {
			System.out.println("Student Result: Fail");
		}
	}
	public void displayStudentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Student Id: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Marks: "+studentMarks);
		System.out.println("student Batchcode: "+studentBatchCode);
	}

}
