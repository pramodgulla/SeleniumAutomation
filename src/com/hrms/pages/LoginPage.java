package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.*;



public class LoginPage extends BaseClass{
	//objects
	static By txt_loginname= By.name("txtUserName");
    static By txt_password= By.name("txtPassword");
    static By btn_login= By.name("Submit");
	//fun
	public static void login(String un, String pw) throws Exception{
		driver.findElement(txt_loginname).sendKeys(un);
		driver.findElement(txt_password).sendKeys(pw);
		driver.findElement(btn_login).click();
		Thread.sleep(3000);
		Reporter.log("Login Completed");
	}
}
