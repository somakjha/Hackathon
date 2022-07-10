package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HealthInsurancePage {
	
	public static WebDriver driver;
	public static String[] data = null;
	
	By healthInsuranceIcon = By.xpath("//div[@class='shadowHandlerBox']//i[@class='icon-bg homeIconsBg health-insurance']");
	By gender = By.className("gender male");
	By fullName = By.id("fullname");
	By phone = By.id("pmobile");
	By continueBtn = By.id("continuecta1");
	By insurePerson = By.xpath("//i[@class='gender self']");
	By selectAge = By.id("eldestMemberAge"); // this must be passed in select class for selecting drop down for ages.
	By continueToInsure = By.id("continuecta2");
	By city = By.id("txtcity");
	By continueToCity = By.id("continuecta3");
	By diseaseCheckbox = By.id("ped_last");
	
	
	
}
