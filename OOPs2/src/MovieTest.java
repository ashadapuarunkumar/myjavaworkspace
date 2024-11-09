
public class MovieTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Devara m1=new Devara(11,"kalki","Rgv");
		Devara m2=new Devara(22,"pokiri","shiva");
		Devara m3=new Devara(22,"pokiri","shiva");
		
		//shallow cloning
		Devara m4=m2;
		System.out.println("m2: "+m4.hashCode());
		System.out.println("m4: "+m2.hashCode());
		
       //deep cloning
//	      	Devara m5=(Devara) m2.clone();
//		System.out.println("m2: "+m1.hashCode());
	//	System.out.println("m3: "+m5.hashCode());
		
		//reference comparison
		System.out.println(m1==m2);
		System.out.println(m2==m3);
		System.out.println(m1==m3);
		System.out.println(m4==m2);
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m4.hashCode());
		
		
		System.out.println(m1.equals(m1));
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(m4));
		
		String s1=new String("Java");
		String s2=new String("Java");
		System.out.println(s1.equals(s2));
	
	}

}
