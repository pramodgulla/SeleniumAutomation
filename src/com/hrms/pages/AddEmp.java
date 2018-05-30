package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrms.utility.*;

public class AddEmp extends BaseClass{
	
		//objects
		static By pimmenu= By.linkText("PIM");
		static By element_addemp= By.xpath("//li[@id='pim']/ul/li[2]/a/span");
		//fun
		public static void addemployee() throws Exception{
			element =driver.findElement(pimmenu);
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(element_addemp).click();
		Thread.sleep(3000);
		Reporter.log("Clicked on Add Employee");
		
	}

}
