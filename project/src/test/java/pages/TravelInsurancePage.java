package pages;

import org.openqa.selenium.WebDriver;

public class TravelInsurancePage {

	public static WebDriver driver = null;
	
	public TravelInsurancePage(WebDriver driver)
	{
		TravelInsurancePage.driver = driver;
	}
	
	public void test() {
		System.out.println("lets go buddy");
	}
}
