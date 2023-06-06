package com.page;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.basee.Utility;

public class Sample extends Utility
{
	
	
	public static void main(String[] args) throws IOException {
		browserLaunch();
		
		Adactin a=new Adactin();
		a.getUser().sendKeys(stringData(1,0));
		a.getPass().sendKeys(stringData(1,1));
		a.getLogin().click();
		
		SearchHotel h=new SearchHotel();
		Select loc=new Select(h.getLocation());
		loc.selectByVisibleText(stringData(1,2));
		
		Select hot=new Select(h.getHotels());
		hot.selectByVisibleText(stringData(1,3));
		
		Select room=new Select(h.getRoomtype());
		room.selectByVisibleText(stringData(1,4));
		
		Select roomno=new Select(h.getRoomno());
		roomno.selectByVisibleText(stringData(1,5));
		
		h.getCheckInDate().sendKeys(stringData(1,6));
		h.getCheckOutDate().sendKeys(stringData(1,7));
		
		Select adl=new Select(h.getAdult());
		adl.selectByVisibleText(stringData(1,8));
		
		Select chl=new Select(h.getChild());
		chl.selectByVisibleText(stringData(1,9));
		
	h.getSubmit().click();
		
		SelectHotel s=new SelectHotel();
		s.getRadio().click();
		s.getCont().click();
		
		BookingHotel b=new BookingHotel();
		b.getFname().sendKeys(stringData(1,10));
		b.getLname().sendKeys(stringData(1,11));
		b.getAdd().sendKeys(stringData(1,12));
		b.getCard().sendKeys(numericData(1,13));
		
		Select c=new Select(b.getCardtype());
		c.selectByVisibleText(stringData(1,14));
		
		Select month=new Select(b.getExpirymonth());
		month.selectByVisibleText(stringData(1,15));
		
		Select year=new Select (b.getExpiryyear());
		year.selectByVisibleText(numericData(1,16));
		
		b.getCvv().sendKeys(numericData(1,17));
		b.getBook().click();
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		 
		 
	}

	
	}

		 