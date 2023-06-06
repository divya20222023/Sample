package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basee.Utility;

public class SearchHotel extends Utility
{
	public SearchHotel() {
		PageFactory.initElements(driver,this);
}

@FindBy(id="location")
private  WebElement location;
@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement roomtype;
@FindBy(id="room_nos")
private WebElement roomno;
@FindBy(id="datepick_in")
private WebElement CheckInDate;
@FindBy(id="datepick_out")
private WebElement CheckOutDate;

@FindBy(id="adult_room")
private WebElement adult;
@FindBy(id="child_room")
private WebElement child;
@FindBy(id="Submit")
private WebElement submit;

public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getRoomno() {
	return roomno;
}
public void setRoomno(WebElement roomno) {
	this.roomno = roomno;
}
public void setAdult(WebElement adult) {
	this.adult = adult;
}
public void setChild(WebElement child) {
	this.child = child;
}
public WebElement getAdult() {
	return adult;
}
public WebElement getChild() {
	return child;
}
public WebElement getSubmit() {
	return submit;
}
public void setLocation(WebElement location) {
	this.location = location;
}
public void setHotels(WebElement hotels) {
	this.hotels = hotels;
}
public void setRoomtype(WebElement roomtype) {
	this.roomtype = roomtype;
}

public void setCheckInDate(WebElement checkInDate) {
	CheckInDate = checkInDate;
}
public void setCheckOutDate(WebElement checkOutDate) {
	CheckOutDate = checkOutDate;
}
public WebElement getCheckInDate() {
	return CheckInDate;
}
public WebElement getCheckOutDate() {
	return CheckOutDate;
}
public void setSubmit(WebElement submit) {
	this.submit = submit;
}
}






