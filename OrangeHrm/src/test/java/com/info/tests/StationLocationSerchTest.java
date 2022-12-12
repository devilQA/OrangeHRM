package com.info.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.info.base.BaseTest;
import com.info.pages.StationLocationSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

///test
public class StationLocationSerchTest extends BaseTest {
	StationLocationSearchPage slsp=new StationLocationSearchPage();
	
	@Test
public static void main() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement elm = driver.findElement(By.xpath("//a[text()='Hover over me']"));
		Actions act=new Actions(driver);
		act.moveToElement(elm).build().perform();
		String gettext = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		
		System.out.println(gettext);
	}
	
	
}
