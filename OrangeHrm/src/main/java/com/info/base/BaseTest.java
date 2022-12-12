package com.info.base;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.info.pages.HomePage;
import com.info.utils.ReadConfig;
import com.info.utils.ReadDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseTest {
	 
	
	public static 	Logger  log=LogManager.getLogger("OrangeHrm");
	public static Properties prop;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static  ReadConfig config=new ReadConfig();;
	public static HomePage land;
	public static ChromeOptions op;
	public static FirefoxOptions fo;
	public static EdgeOptions eo;
	public static Actions action;
	public static Select select;
	public static JavascriptExecutor js;
	public static ReadDataProvider data=new ReadDataProvider();

	public static void init() {
	String browser=config .getBrowser();
		if(browser.equals("chrome"))
		{ WebDriverManager.chromedriver().setup();
		op=new ChromeOptions();
		op.addArguments("--enable-notifications");
		driver=new ChromeDriver(op);
		
			
		}
		else if(browser.equals("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		fo=new FirefoxOptions();
		fo.addArguments("--enable-notifications");
		driver=new FirefoxDriver(fo);
		
		}
		else if(browser.equals("edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js=(JavascriptExecutor)driver;
		action=new Actions(driver);
		 land=new HomePage();
	driver.get(config.getBaseUrl());
	
		 
	}
 
	 
	 

	
	
	
}
