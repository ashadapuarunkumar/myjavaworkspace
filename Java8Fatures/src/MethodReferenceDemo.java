


@FunctionalInterface
interface Greet{
	void wish();
}



public class MethodReferenceDemo {
	public static void SayHello() {
		System.out.println("Hello.........");
	}
	public void sayHi() {
		System.out.println("Yooooo.....Everyone");
	}
	
	
	public static void main(String[] args) {
		Greet g=() -> MethodReferenceDemo.SayHello();
		g.wish();
		
		
		//Static Method reference
		Greet g2 = MethodReferenceDemo :: SayHello;
		g2.wish();
		
		MethodReferenceDemo m=new MethodReferenceDemo();
		Greet g3=() -> m.sayHi();
		g3.wish();
		
		//Instance method reference
		Greet g4=m :: sayHi;
		g4.wish();
		
		
		
	}

}
