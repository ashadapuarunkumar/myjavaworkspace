package com.edubridge.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterestCalcTest {
	private   Interestcalc ic;
	
//	@BeforeAll
	
	@BeforeEach
	public  void setup() {
		ic = new Interestcalc();		
	}
	
	@AfterEach
	public  void tearup() {
		ic = null;
	}
	
	@Test
	public void testsi() {
		double actual=ic.si(10000, 12, 1);
		double expected=12000;
		assertEquals(expected, actual);
	}

}
