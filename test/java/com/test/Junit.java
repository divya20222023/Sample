package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	
	@BeforeClass
	public static  void beforeClass() {
		System.out.println("@BeforeClass");
		
	}
	
	@Before
	public void before() {
		System.out.println("@before");
	}	
	@Test
	public void tc1() {
		System.out.println("@tc1");
	}
	@After
	public void after() {
		System.out.println("@after");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("@afterclass");
	}
}		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
		
		
		
		
	
		
		
	

	
		
	
	


