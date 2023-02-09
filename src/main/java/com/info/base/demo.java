package com.info.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo {
	static String elm="welecome to the page mansing";
	static String val="mansing";
	public static void main(String[] args)  {
		 
		
		
		d1();
	}
	
	
	public static void d1()  
	{
		String s="Elements";
	 
		  int count=0;
		  for(int i=0;i<s.length();i++)
		  {
			  if(s.charAt(i)=='e'||s.charAt(i)=='E')
			  {
				  count++;
			  }
			  
		  }
		  System.out.println(count);
		
		 

	}
	public boolean isContainsname()
	{  
		return elm.contains(val);
	}
	
}