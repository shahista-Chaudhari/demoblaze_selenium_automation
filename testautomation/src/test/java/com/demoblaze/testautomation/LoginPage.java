package com.demoblaze.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Setup {
	
	public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(id = "loginusername")
	WebElement login_username;
	
	@FindBy(id = "loginpassword")
	WebElement login_password;
	
	@FindBy(id = "login2")
	WebElement login_button;
	
	@FindBy(xpath= "//button[normalize-space()='Log in']")
	WebElement login_button2;
	
	
	public void enterUsername(String user) {
		login_username.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		login_password.sendKeys(pass);
	}
	
	public void clickLogin() {
		login_button.click();
	}
	
	public void clickLogin2() {
		login_button2.click();
	}
	

}
