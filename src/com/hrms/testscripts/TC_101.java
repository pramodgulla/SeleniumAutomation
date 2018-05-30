/*
 * new to pramod githyb
 * 
 */

package com.hrms.testscripts;

import org.testng.annotations.Test;
import com.hrms.pages.AddEmp;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC_101 {
	@Test
public static void tc_101() throws Exception{
	BaseClass.open_application("http://127.0.0.1/orangehrm-2.6");
	VerifyPage.verifytitle("OrangeHRM - New Level of HR Management");
	LoginPage.login("admin", "admin");
	VerifyPage.verifytitle("OrangeHRM");
	AddEmp.addemployee();
	LogoutPage.logout();
	BaseClass.close_application();
   
			
			
}
}
