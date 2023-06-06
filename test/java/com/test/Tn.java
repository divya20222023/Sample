package com.test;

import org.testng.annotations.Test;

public class Tn {
	
	
	
	@Test
private void  tc1() {
	System.out.println("tc1");
	
	}
	
	@Test
	private void tc2() {
		System.out.println("tc2");
		
	}
	@Test(enabled=false)
	private void tc3() {
		System.out.println("tc3");
	}
	@Test
	private void tc4() {
		System.out.println("tc4");
	}
	
	
	
		
	}

