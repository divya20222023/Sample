package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Samples{ 

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
		
	}
@Before
public void before() {
	System.out.println("Before");

}
	@Test
	public void tc2() {
		System.out.println("tc2");
	}
		@After
		public void after() {
			System .out.println("after");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
	@Test
	public void tc1() {
		System.out.println("tc1");
	}
		
	
	

	
}

