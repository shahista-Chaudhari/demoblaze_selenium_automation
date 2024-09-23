package com.demoblaze.testautomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;

public class SignUpPage extends Setup {
	
	public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//a[@id='signin2']")
	WebElement signInButton;
	
	@FindBy(xpath = "//input[@id='sign-username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='sign-password']")
	WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()='Sign up']")
	WebElement signUp;
	
	public void clickSignIn() {
		signInButton.sendKeys(Keys.ENTER);
	}
	
	public void enterUsername(String user) throws InterruptedException {
		username.sendKeys(user);
		Thread.sleep(1000);
	}
	
	public void enterPassword(String pass) throws InterruptedException {
		password.sendKeys(pass);
		Thread.sleep(2000);
	}
	
	public void clickSignUp() throws InterruptedException {
		try {
			signUp.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(2000);
			alert = driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
}
