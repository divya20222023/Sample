package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basee.Utility;

public class BookingHotel extends Utility {
	public BookingHotel(){
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy (id="first_name")	
private WebElement	fname;
@FindBy (id="last_name")
private WebElement lname;
@FindBy (id="address")
private WebElement add;
@FindBy (id="cc_num")
private WebElement card;
@FindBy(id="cc_type")
private WebElement cardtype;
@FindBy(id="cc_exp_month")
private WebElement expirymonth;
@FindBy (id="cc_exp_year")
private WebElement expiryyear;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement book;
public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
public WebElement getAdd() {
	return add;
}
public WebElement getCard() {
	return card;
}
public WebElement getCardtype() {
	return cardtype;
}
public WebElement getExpirymonth() {
	return expirymonth;
}
public WebElement getExpiryyear() {
	return expiryyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBook() {
	return book;
}
public void setFname(WebElement fname) {
	this.fname = fname;
}
public void setLname(WebElement lname) {
	this.lname = lname;
}
public void setAdd(WebElement add) {
	this.add = add;
}
public void setCard(WebElement card) {
	this.card = card;
}
public void setCardtype(WebElement cardtype) {
	this.cardtype = cardtype;
}
public void setExpirymonth(WebElement expirymonth) {
	this.expirymonth = expirymonth;
}
public void setExpiryyear(WebElement expiryyear) {
	this.expiryyear = expiryyear;
}
public void setCvv(WebElement cvv) {
	this.cvv = cvv;
}
public void setBook(WebElement book) {
	this.book = book;
}

	// TODO Auto-generated method stub
	


}
