package com.demoblaze.testautomation;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLoginPage extends Setup {
	
	@Test(priority=1)
	@Parameters({"user","pass"})
	public void testPage(String user, String pass) throws InterruptedException{
				
		LoginPage webpage = new LoginPage(driver);
		webpage.clickLogin();
		Thread.sleep(1000);
		webpage.enterUsername(user);
		Thread.sleep(1000);
		webpage.enterPassword(pass);
		Thread.sleep(1000);
		webpage.clickLogin2();
		Thread.sleep(1000);
		
		
	}


}
