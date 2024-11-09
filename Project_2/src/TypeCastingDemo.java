
public class TypeCastingDemo {

	public static void main(String[] args) {
		
		
		long l=7367l;
		int i2= (int) l;
		System.out.println(l);
		System.out.println(i2);
		
		double d=123.877;
		int i3= (int) d;
		System.out.println(d);
		System.out.println(i3);
		
		String s="10";
		int num= Integer.parseInt(s);
		System.out.println(s);
		System.out.println(num);
		
		
		String s2 = "3.22";
		double num2 = Double.parseDouble(s2);
		System.out.println(s2);
		System.out.println(num2);;

        int num3 = 100;
        String s3 =String.valueOf(num3);
        System.out.println(s3);
		
		

	}

}
