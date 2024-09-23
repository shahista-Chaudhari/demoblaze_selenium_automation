package com.demoblaze.testautomation;

import java.time.Duration;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPlaceOrder extends Setup{
	@Test(priority=3)
	@Parameters({"name","country","city","card","month","year"})
	public void testPage(String name, String country, String city, String card, String month, String year) throws InterruptedException{
		PlaceOrder webpage = new PlaceOrder(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		webpage.click_cart();
		webpage.click_placeOrder();
		webpage.enterName(name);
		webpage.enterCountry(country);
		webpage.enterCity(city);
		webpage.enterCard(card);
		webpage.enterMonth(month);
		webpage.enterYear(year);
		webpage.click_purchase();
		webpage.click_ok();
	}

}
