package com.demoblaze.testautomation;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAddtoCart extends Setup{
	
	@Test(priority=2)
	@Parameters({"user","pass"})
	public void testPage(String user, String pass) throws InterruptedException{
		AddtoCart webpage = new AddtoCart(driver);
		
		webpage.click_add_cart1();
		webpage.click_add_cart2();
		
	}

}
