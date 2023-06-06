package com.test;

import java.io.IOException;

import org.junit.Test;

import com.basee.Utility;

import junit.framework.Assert;

public class Adtest extends Utility {
	
	@Test
public void Adactin() throws IOException{
		
	browserLaunch();
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	//to validate Url
	Assert.assertEquals(currentUrl,stringData1(1,0));
	
	System.out.println("done");	
		
		
	}

	
	

	
}
