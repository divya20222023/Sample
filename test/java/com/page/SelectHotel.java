package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basee.Utility;

public class SelectHotel extends Utility{
	
	public SelectHotel() {
		PageFactory.initElements(driver,this);
}
@FindBy(id="continue")
private  WebElement cont;
public void setCont(WebElement cont) {
	this.cont = cont;
}
public WebElement getCont() {
	return cont;
}

@FindBy (id="radiobutton_0")
private WebElement radio;
public WebElement getRadio() {
	return radio;
}
public void setRadio(WebElement radio) {
	this.radio = radio;
}

}


