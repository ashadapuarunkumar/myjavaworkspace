package com.edubridge.myproject2.test;


import Interestpolicy.Calci;
import com.edubridge.amar_project1.name.*;
import com.edubridge.myproject1.util.Calc1;


public class CalcTest {
	public static void main(String[] args) {
		int square=Calc1.findSquare(10);
		int cube =Calc1.findCube(10);
		int sum=Calci.findSum(10);
		int mins=Calci.findmine(10);
		double  interest =Calci.findIntrest(12.2,20.23,10);
		AmarName.myNameAmar();
		String strr = AmarName.yourName("This is my salary kastaalu:");
		
		
		
		
		System.out.println(strr);	
		System.out.println(mins);
		System.out.println(sum);
		System.out.println(square);
		System.out.println(cube);
		System.out.println("the intrest is "+interest);
	}
}
