package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement element;
public static void open_application(String url) throws Exception{
	
	driver=new FirefoxDriver();
	driver.navigate().to(url);
	Thread.sleep(3000);
	Reporter.log("Application Opened");
}
public static void close_application(){
	driver.quit();
	Reporter.log("Application closed");
}
}
