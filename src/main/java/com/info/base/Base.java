package com.info.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// all instances of 
public class Base {

	public static void main(String[] args) {
		
		String s="17 December 2021",a="December 17, 2021 (India)";
		
		System.out.println(s.contains(a));
		WebDriver driver=new ChromeDriver();
		//driver.switchTo().alert();
		
	}
}

