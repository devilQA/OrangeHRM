package com.info.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
public Properties prop=null;
	public ReadConfig()
	{
		try
		{
			FileInputStream file=new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\info\\config\\config.properties"));
		prop=new Properties();
		prop.load(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String getBrowser() {
		// TODO Auto-generated method stub
		return prop.getProperty("browser");
	}

	public String getBaseUrl() {
		// TODO Auto-generated method stub
		return prop.getProperty("baseURL");
	}
	public String getUserID()
	{
		return prop.getProperty("userID");
	}
	public String getPassword()
	{
		return prop.getProperty("password");
	}

}
