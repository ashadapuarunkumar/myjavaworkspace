
interface A{	
}
//Single
interface B extends A{

}
//Multi level
interface C extends B{
}

//Multiple Inheritence
interface X{	
}
interface Y{
  void m1();	
}
interface Z extends X,Y{
	
}
class MRO{
	
}

class XYZ extends MRO implements X,Y{
	
	public void m1() {
		System.out.println("m1()implemented");
	}
	
}

public class InterfaceInheritanceDemo {

}
