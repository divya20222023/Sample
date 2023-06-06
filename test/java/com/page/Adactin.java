package com.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basee.Utility;

public class Adactin extends Utility {
	public Adactin() {
	PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private WebElement user;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(id="login")
	private WebElement login;
	public void setUser(WebElement user) {
		this.user = user;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}




}
