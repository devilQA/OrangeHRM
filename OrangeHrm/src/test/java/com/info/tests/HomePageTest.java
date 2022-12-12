package com.info.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.info.base.BaseTest;
import com.info.pages.HomePage;

public class HomePageTest extends BaseTest{
HomePage hp=null;
SoftAssert soft=null;
	@BeforeMethod
	void setup()
	{ init();
		hp=new HomePage();
	  soft=new SoftAssert();
		
	}
	@Test(groups = {"sanity","regration"})
	void validatetheLoginwithProperCredentials()
	{
		 hp.doLogin();
		
	}
	@Test(priority = 0)
	void validateUserIdTextBox()
	{
		Assert.assertTrue( hp.userIDBoxIsDisplayed(), "failed due to the not display the userid INPUT box");
		soft.assertTrue(hp.userIDBoxIsEnabled(),"user id textbox is not enabled");
		log.info("checked the userID textbox is Enabled");
		soft.assertTrue(hp.isPlaceholderOfUserIDCorect(),"placeholder is not matching ");
		log.info("checked the userid textBox place holder is correct");
		soft.assertAll();
	}
	@Test(priority = 1)
	void validateThe_Password__textBox()
	{
		
	}
	@AfterMethod
	void closeAll()
	{
		driver.quit();
	}
	 
}
