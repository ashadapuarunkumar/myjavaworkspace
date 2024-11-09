package com.edubridge.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

public class BooleanTest {
	private static MyMap m;
	@BeforeAll
	public static void setup() {
		m=new MyMap();
	}
	
	public void testisEven() {
		boolean actual=m.isEven(2);
		boolean expected=true;
		assertEquals(expected,actual);
	}
}
