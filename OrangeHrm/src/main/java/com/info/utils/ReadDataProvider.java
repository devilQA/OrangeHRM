package com.info.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataProvider { 
  Properties prop;

	public ReadDataProvider ()
{
	
	try {
		FileInputStream file=new FileInputStream(new File (System.getProperty("user.dir")+"\\src\\main\\java\\com\\info\\config\\dataProvider.properties"));
		prop=new Properties();
		prop.load(file);
	
	} catch (FileNotFoundException e) {
 		e.printStackTrace();
	} catch (IOException e) {
 		e.printStackTrace();
	}
}
	public   String expectedTitleOfHomePage()
	{
		return prop.getProperty("homePageTitle");
	}
	 public String expectedErrorMassageOFUserName()
	 {
		 return prop.getProperty("errorMassageOFUsername");
	 }
	public String expectedUserTitle()
	{
		return prop.getProperty("userTitle");
		
	}
	public String expectedpassTitle()
	{
		return prop.getProperty("passTitle");
	}
	public String expectedHeadingOfLoginBoard()
	{
		return prop.getProperty("headingOfLoginBoard");
	}
	public String expectedInvalidCrediantialERR_MSG()
	{
		return prop.getProperty("invalidCrediantialERR_MSG");
	}
	public String expectedplaceholder_userID()
	{
		return prop.getProperty("placeholder_userID");
	}
	
}
