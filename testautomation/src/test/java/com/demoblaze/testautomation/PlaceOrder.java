package com.demoblaze.testautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder extends Setup {
	
	public PlaceOrder(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//button[normalize-space()='Place Order']")
	WebElement place_order;
	
	@FindBy(xpath = "//a[normalize-space()='Cart']")
	WebElement cart;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath = "//input[@id='country']")
	WebElement country;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@id='card']")
	WebElement card;
	
	@FindBy(xpath = "//input[@id='month']")
	WebElement month;
	
	@FindBy(xpath = "//input[@id='year']")
	WebElement year;
	
	@FindBy(xpath = "//button[normalize-space()='Purchase']")
	WebElement purchase;
	
	//button[normalize-space()='OK']
	@FindBy(xpath = "//button[normalize-space()='OK']")
	WebElement ok_button;
	
	public void click_cart() throws InterruptedException {
		cart.click();
		Thread.sleep(2000);
	}
	
	public void click_placeOrder() throws InterruptedException {
		place_order.click();
		Thread.sleep(2000);
	}
	
	public void enterName(String cname) throws InterruptedException {
		name.sendKeys(cname);
		Thread.sleep(2000);
	}
	
	public void enterCountry(String ccountry) throws InterruptedException {
		country.sendKeys(ccountry);
		Thread.sleep(2000);
	}
	
	public void enterCity(String ccity) throws InterruptedException {
		city.sendKeys(ccity);
		Thread.sleep(2000);
	}
	
	public void enterCard(String ccard) throws InterruptedException {
		card.sendKeys(ccard);
		Thread.sleep(2000);
	}
	
	public void enterMonth(String cmonth) throws InterruptedException {
		month.sendKeys(cmonth);
		Thread.sleep(2000);
	}
	
	public void enterYear(String cyear) throws InterruptedException {
		year.sendKeys(cyear);
		Thread.sleep(2000);
	}
	public void click_ok() throws InterruptedException {
		ok_button.click();
		Thread.sleep(2000);
	}
	
	public void click_purchase() throws InterruptedException {
		purchase.click();
		Thread.sleep(2000);
	}
}
