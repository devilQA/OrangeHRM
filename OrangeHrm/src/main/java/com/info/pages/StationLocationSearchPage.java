package com.info.pages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.xml.transform.ErrorListener;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.info.base.BaseTest;

//page
public class StationLocationSearchPage extends BaseTest {
	
	@FindBy(xpath = "//div[@class='list_number']")
	public WebElement ListNumber;
	@FindBy(xpath = "//div[@class='list_number']")
	public WebElement count;
	
	 @FindBy(xpath = " xpath ")
		public List<WebElement> StationNumber;
	
	 public List<WebElement> getStationNumber()
	 {
		 return StationNumber;
	 }
	
	public List<String> getActualStationNum()
	{
		List<String> data=new ArrayList<String>();
		Iterator<WebElement> itr = getStationNumber().iterator();
	
		while(itr.hasNext())
		{
			data.add(itr.next().getText());
		}
		return data;
	}
	 
}
