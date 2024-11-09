

class parent {
	public void study() {
		System.out.println("Med");
	}
	}
class child extends parent{
	public void study() {
		System.out.println("Jam");
	}

}



public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new parent();
		p.study();
		
		child c=new child();
		c.study();
		
		parent p2=new child ();
		p2.study();
		
		
		
		
		
		
	}

}
//class Parent{
//    public void study() {
//        System.out.println("Medicine");
//    }
//}
//class Child extends Parent{
//    public void study() {
//        System.out.println("Acting");
//    }
//}
//public class RuntimePolymorphismDemo {
//    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.study();
//        
//        Child c = new Child();
//        c.study();
//        
//        Parent p2 = new Child();
//        p2.study();
//        
//        //Child c2 = (Child) new Parent();
//    }
//}





//class Phone{
//    public void voiceCall() {
//        System.out.println("Voice calling with Phone");
//    }
//}
//class SmartPhone extends Phone{
//    public void videoCall() {
//        System.out.println("Video calling with SmartPhone");
//    }
//}
//class Communication{
//    //Overloaded methods
//    public void call(Phone p) {
//        p.voiceCall();
//    }
//    public void call(SmartPhone sm) {
//        sm.videoCall();
//    }
//}
//public class CompileTimePolymorphism {
//    public static void main(String[] args) {
//        Phone p = new SmartPhone();        
//        Communication comm = new Communication();
//        comm.call(p);
//    }
//}

