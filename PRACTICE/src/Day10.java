
class mobile{
	public void sensor() {
		System.out.println("IR blaster");
	}
}
class mobile1 extends mobile{
	public void fdisplay() {
		super.sensor();
		System.out.println("In display finger print");
	}
}

public class Day10 {
	public static void main(String[]args) {
		mobile1 m=new mobile1();
		m.();
		
	}

}
