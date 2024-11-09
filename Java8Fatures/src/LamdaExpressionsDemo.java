
@FunctionalInterface
interface MyFunctionalInterface1{
	void wish();
}

class Hello implements MyFunctionalInterface1{
	@Override
	public void wish() {
		// TODO Auto-generated method stub
	 System.out.println("Hello.........Everyone");	
	}
	
}
@FunctionalInterface
interface MyFunctionalInterface2{
	int findsquare(int num);
}
interface MyFunctionalInterface3{
	int findTotal(int num1 ,int num2);
}
interface MyFunctionalInterface4{
	boolean isEven(int num);
}

public class LamdaExpressionsDemo {
	public static void main(String[] args) {
		
		MyFunctionalInterface4 my4=(num) -> num%2==0;
		System.out.println(my4.isEven(10));
		
		
		MyFunctionalInterface3 my3=(x,y) ->x+y;
		System.out.println(my3.findTotal(10,20));
		
		
		
		 MyFunctionalInterface2 my2=(num) -> num*num;
		 int square =my2.findsquare(10);
		System.out.println(square);
		
	
		MyFunctionalInterface1 my1=new Hello();
		my1.wish();
		
		MyFunctionalInterface1 my= () -> System.out.println("hai.......");
		my.wish();
	}
}
