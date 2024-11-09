
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachMethodDemo {
	public static void main(String[] args) {
		
	//	List<Double> d=Arrays.asList(20000.0,300000.0,40000.0,10000.0,50000.0);
		
		
		
		List<String> s= Arrays.asList("AIML","JAVA","PYTHON","ANGULAR");
		
		Consumer<String> consumer=(value) ->System.out.println(value);
		s.forEach(consumer);
		
		
		System.out.println("------------------");
		
		s.forEach((value) -> System.out.println(value));
		
		System.out.println("----------------------");
		
		s.forEach(System.out:: println);
		

		System.out.println("----------------------");
		
		
		List<Double> d=Arrays.asList(20000.0,300000.0,40000.0,10000.0,50000.0);
		 
		Consumer <Double> consumer1=(sal) ->System.out.println(sal);
		d.forEach(consumer1);
	

	System.out.println("----------------------");
		
		d.forEach((sal) -> System.out.println(sal));
		

		System.out.println("----------------------");
	d.forEach(
	System.out::println);
		
		List<Double> filteredsalaries=new ArrayList<Double>();
		d.forEach(sal) ->{
			if(sal >= 400000 ) {
				filteredsalaries.add(salary);
//		for(Double sal : d) {
//			if(sal>40000) {
//				filteredsalaries.add(sal);
			}
		}

		
		System.out.println(filteredsalaries);
		
		
		
		
		
		
	}
}
