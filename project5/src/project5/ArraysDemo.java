package project5;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1;
		int [] arr2;
		int arr3[];
		
		//Arrays Creation
		arr1=new int[8];
		arr2=new int[5];
		//arr1=new int[-8];   //runtime eror
		// arr3= new int[Integer.MAX_VALUE];  //Run time error  //Exception
		
		System.out.println(Integer.MAX_VALUE);
		
		//Array Intalization
		arr1[0]= 44;
		arr1[1]= 55;
		arr1[2]= 66;
		
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//arr1[6=100;   //RE
		
		//Declaration,Creation and Intitialization in a single line.
		
		int[]arr4=new int[] {44,55,66,77,88,99};
		int[]arr5= {44,55,66,77,88,99};
		
		System.out.println(arr4);
		System.out.println(Arrays.toString(arr4));
		System.out.println(arr5);
		System.out.println(Arrays.toString(arr5));
		
		System.out.println(arr4.length);
		
		//Access first element
		System.out.println(arr4[0]);
		
		//Acess last number
		System.out.println(arr4[arr4.length-1]);
		
		
		//Traversal
		
		int[] submarks= {20,30,40,50,60,70,80};
		
		System.out.println("Using for loop");
		int i=0;
		for (int index=0;index<submarks.length;index++) {
			 System.out.println("Subject " +(i+1)+" Mark is "+submarks[i]);
			 i++;
		}
		
		System.out.println("Using for each  loop or enhanced for loop ");
		for (int eachsubmarks: submarks){
			System.out.println(eachsubmarks);
			
		}
		double [] salaries = {50000.0,10000.0,370000,40000.0,66000.0,44000.0};
		     System.out.println("loop");
		int j=0;
		for (int table=0;table<salaries.length;table++) {
			System.out.println("salarie "+(j+1)+" table "+salaries[j]);
			j++;
		}
		
		System.out.println("Using for each  loop or enhanced for loop ");
		for (double eachsalaries: salaries) {
			System.out.println(eachsalaries);
		
		}
		double sum=salaries[0];
		
		
		
		double max=salaries[0];
		
		double min=salaries[0];
		
		for(int k=0 ;k<salaries.length;k++) {
			
			if(salaries[k]>max ){
				
				max=salaries[k];
				
			}else if(salaries[k]<min) {
				min=salaries[k];
			
		}
	}
		System.out.println("miximum salary:  ");
		System.out.println(max);
		System.out.println("minimum salary: ");
		System.out.println(min);	
		System.out.println("Total salary: ");
		System.out.println(sum);
	}

}
