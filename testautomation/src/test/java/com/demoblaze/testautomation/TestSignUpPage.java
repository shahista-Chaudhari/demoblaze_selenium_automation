package com.demoblaze.testautomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSignUpPage extends Setup {

	@Test(expectedExceptions = NoAlertPresentException.class, priority=0)
	@Parameters({"user","pass"})
	public void testPage(String user, String pass) throws InterruptedException{
		SignUpPage signuppage = new SignUpPage(driver);
		signuppage.clickSignIn();
		signuppage.enterUsername(user);
		signuppage.enterPassword(pass);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		signuppage.clickSignUp();
	}

}
