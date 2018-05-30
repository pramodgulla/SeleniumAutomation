package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.*;

public class VerifyPage extends BaseClass {
public static void verifytitle(String title){
	if(driver.getTitle().equals(title)){
		Reporter.log("Title Matched");
	}
	else{
		Reporter.log("Title Not Matched and Expected Title is" +driver.getTitle());
	}
}
}
