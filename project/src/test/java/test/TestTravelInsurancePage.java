package test;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import handler.BrowserHandler;
import pages.TravelInsurancePage;
import reader.PropertiesReader;

public class TestTravelInsurancePage {

	WebDriver driver = BrowserHandler.getWebDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	PropertiesReader propReader = new PropertiesReader();
	TravelInsurancePage Obj = new TravelInsurancePage(driver);

	@Test(priority = 0)
	public void openPage() {
		Obj.openPage(propReader.fetchProperty("url"));
	}

	@Test(priority = 1)
	public void clickTravelInsurance() {
		Obj.clickTravelInsurance();

	}

	@Test(priority = 2)
	public void enterRightDestination() {
		Obj.enterDestination("Greece");
	}

	@Test(priority = 3)
	public void selectRightDestination(){
		Obj.selectDestination();
		Obj.clearSearchTag();
	}
    
	@Test(priority = 4)
	public void enterWrongDestination() {
		Obj.enterDestination("Greefffce");
	}

	@Test(priority = 5)
	public void selectWrongDestination() {
		Obj.selectDestination();
		Obj.clearSearchText();
	}
	
	@Test(priority = 6)
	public void enterDigitsDestination()
	{
		Obj.enterDestination("7209");
		Assert.assertEquals(false, Obj.getNextState());
	}
	
	@Test(priority = 7)
	public void enterEmptyDestination()
	{
		Obj.enterDestination("");
		Assert.assertEquals(false, Obj.getNextState());
	}
	@Test(priority = 8)
	public void openTravelDurationTab()
	{
		Obj.enterDestination("Greece");
		Obj.selectDestination();
		Obj.clickNextButton();
		Assert.assertEquals("Don't worry you can change your trip dates at a later stage", Obj.getTravelDurationText());
	}
	
}
