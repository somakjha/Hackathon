package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import handler.BrowserHandler;
import pages.TravelInsurancePage;

public class TestTravelInsurancePage {
	
	String url = "https://www.policybazaar.com/";
	
	public static WebDriver driver = BrowserHandler.getWebDriver(); 
	TravelInsurancePage Obj = new TravelInsurancePage(driver);
	
	
	@Test(priority = 0)
	public void openPage()
	{
		Obj.openPage(url);
	}
	@Test(priority = 1)
	public void clickTravelInsurance()
	{
		Obj.clickTravelInsurance();
	}

}
