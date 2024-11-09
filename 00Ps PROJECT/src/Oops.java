//
//public class Oops {
//
//	public static void main(String[] args) {
//		Student s1=new Student(101,"wer", 45.0);
//		s1.displayStudentDetails();
//		s1.studentResult();
//
//		System.out.println(".......................");
//		
//		Student s2=new Student(102,"run", 46.0);
//		s2.displayStudentDetails();
//		s2.studentResult();
//		
//		
//System.out.println(".......................");
//		
//		Student s3=new Student();
//		s3.displayStudentDetails();
//		s3.studentResult();
//	}
//
//}





class mobile{
	public void sensor() {
		System.out.println("IR blaster");
	}
}
class mobile1{
	public void fdisplay() {
		super.sensor();
		System.out.println("In display finger print");
	}
}

public class Oops {
	public static void main(String[]args) {
		new mobile1();
		
	}

}
