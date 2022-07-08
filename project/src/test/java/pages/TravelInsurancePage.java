package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelInsurancePage {
	
	
	static By travelInsurance = By.xpath("/html/body/main/div[2]/section/div[7]");

	public static WebDriver driver = null;
	
	public TravelInsurancePage(WebDriver driver)
	{
		TravelInsurancePage.driver = driver;
	}
	
	public void openPage(String url)
	{
		driver.get(url);
	}
	
	public void clickTravelInsurance()
	{
		driver.findElement(travelInsurance).click();
	}
}
