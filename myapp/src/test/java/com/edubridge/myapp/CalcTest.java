package com.edubridge.myapp;

//Static 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
	private static Cacu c;
	private static Interestcalc ic;
	//@BeforeEach
	@BeforeAll
	public static void setup() {
		c=new Cacu();
		ic=new Interestcalc();
	}
	//@AfterEach
	@AfterAll
	public static void tearup() {
		c=null;
		ic=null;
	}
	
	@Test
	public void testfindSquare() {
		Cacu c=new Cacu();
		int actual=c.findSquare(10);
		int expected=100;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testfindCube() {
		Cacu c=new Cacu();
		int actual =c.findCube(10);
		int expected=1000;
		assertEquals(expected, actual);
	}
	@Test
	public double testsi() {
		Interestcalc ic=new Interestcalc();
		double actual=ic.si(20, 30, 10);
		double expected=6000;
		assertEquals(expected,actual);
		return expected;
	}
	

	
}


