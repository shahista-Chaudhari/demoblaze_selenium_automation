package com.demoblaze.testautomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart extends Setup {
	
	public AddtoCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
	WebElement add_cart1;
	
	@FindBy(xpath = "//a[normalize-space()='Nokia lumia 1520']")
	WebElement add_cart2;
	
	 
	@FindBy(partialLinkText = "Home")
	WebElement home;
	
	
	@FindBy(linkText = "Add to cart")
	WebElement add_to_cart1;
	
	@FindBy(linkText = "Add to cart")
	WebElement add_to_cart2;
	
	
//	Alert alert = driver.switchTo().alert();
//	alert.accept();

//	Alert alert2 = driver.switchTo().alert();
//	alert2.accept();
//	Thread.sleep(2000);

		public void click_add_cart1() throws InterruptedException {
			Thread.sleep(2000);
			add_cart1.sendKeys(Keys.ENTER);
			add_to_cart1.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			home.click();
		}
		
		public void click_add_cart2() throws InterruptedException {
			Thread.sleep(2000);
			add_cart2.sendKeys(Keys.ENTER);
			add_to_cart2.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			home.click();
		}

}
