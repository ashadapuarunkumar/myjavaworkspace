

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(  100,"karan","karan@gmail.com",9988776655l);
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
	//	System.out.println(s1.getStudentEmail());
		System.out.println(s1.getStudentMobile());
		System.out.println(s1.getStudentEmail());
		
		System.out.println("================");
		
		
		Student s2=new Student();
		s2.setStudentId(222);
		s2.setStudentName("agar");
		s2.setStudentEmail("ager@gmail");
		s2.setStudentMobile(9988770066l);
		
		System.out.println(s2.getStudentId());
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentEmail());
		System.out.println(s2.getStudentMobile());
	}

}
