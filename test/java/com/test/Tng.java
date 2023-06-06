package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tng {
	
	@BeforeClass
	private void beforeClass() {
		
	System.out.println("beforeClass");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@Test
	private void tc1() {
		
		System.out.println("tc1");
		
	}
	
	@Test
	
	private void tc2() {
		
		System.out.println("tc2");
		
	}
	
	@AfterMethod
	private void afterMethod() {
	System.out.println("afterMethod");
	
	}
	
	@AfterClass
	private void afterClass() {
		
		System.out.println("afterClass");
	}
		
		
		
		
		
		
	
	
		
		
		
	
	
	}
	
	


