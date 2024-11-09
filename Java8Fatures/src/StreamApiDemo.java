

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class StreamApiDemo {
	public static void main(String[] args) {
		List<Double> d=Arrays.asList(20000.0,300000.0,40000.0,10000.0,50000.0);
		Stream<Double>s=d.stream();
		
		Predicate<Double> p=(value)->value>=40000;
		
		s
		.filter(p)
		.forEach(System.out :: println);
		
		System.out.println("------Filterd");
		
		d
		.stream()
		 .filter((sal) ->sal<50000)
		 .forEach(System.out :: println);
		
		
		List<String> co=Arrays.asList("JAVA","PYTHON","ANGULAR","ML");
		
		System.out.println("----START WITH j...");
		
		co
		.stream()
		.filter((cos)->cos.startsWith("J"))
		.forEach(System.out :: println);
		
		System.out.println("--->=5 characters courses......");
		co
		.stream()
		.filter((cos)->cos.length()>=5)
		.forEach(System.out :: println);
		
		System.out.println(d);
		System.out.println("------update salary by 2k----");
		
		co
		.stream()
		.reduce((cos)->cos.startsWith("J"))
		.forEach(System.out :: println);
		
		System.out.println(d);
		
		
		d
		.stream()
		.map((sal)->sal+2000.0)
		.forEach(System.out :: println);
		
		System.out.println("----10% from salary------");
		d
		.stream()
		.map((sal)-> sal +(sal* .1))
		.forEach(System.out :: println);
		
		
		System.out.println("----Total  salaries-----");
		
		Double totalsalaries=d
		.stream()
		.reduce((sa1,sa2)-> sa1+sa2)
		.get();
		System.out.println(totalsalaries);
		System.out.println("----Sum of  salaries-----");
		
		totalsalaries=d
		.stream()
		.mapToDouble((sal)->sal)
		.sum();
		System.out.println(totalsalaries);
		
		System.out.println("----Max  salaries-----");
		
		Double maxsalaries=d
		.stream()
		.mapToDouble((sal)->sal)
		.max()
		.getAsDouble();
		System.out.println(maxsalaries);
		
		System.out.println("----Min  salaries-----");
		
		Double minsalaries=d
				.stream()
				.mapToDouble((sal)->sal)
				.min()
				.getAsDouble();
				System.out.println(minsalaries);
		
	}

}
