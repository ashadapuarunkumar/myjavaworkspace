
class parent{
	public void study() {
		System.out.println("med");
	}
	public void property() {
		System.out.println("10acres,10kg gold");
	}
	public void marry() {
		System.out.println("Arrange");
	}
}
class child extends parent{
	//@override
	public void marry() {
		super.marry(); //calling parent class
		System.out.println("Love");
}	
	public void study() {
		System.out.println("math");
	}
}
public class OverridingDemo {
	public static void main(String[]args) {
		parent p=new parent();
		p.study();
		p.property();
		p.marry();
		
		System.out.println("------------");
		
		child c=new child();
		c.study();
		c.property();
		c.marry();
	
	}
	
}