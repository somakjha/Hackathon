package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarInsurance {
	
	public static WebDriver driver;
	By carInsuranceIcon = By.xpath("//div[@class='shadowHandlerBox']//i[@class='icon-bg homeIconsBg car-insurance']");
	By proceedLink = By.linkText("Proceed without car number");
	By city = By.id("spn6"); // for giving dummy details for city as "PUNE"
	By districtCode = By.xpath("//span[contains(@class,'selected-rto')]");// for district code
	By searchBarCity = By.xpath("//input[@placeholder='Search RTO (e.g. MH02 or Mumbai)']");
	By searchBarCarCompany = By.xpath("//input[@placeholder='Search car brand']");
	By carIcon = By.xpath("//span[@class='tata active']"); // dummy details
	By searchBarCarModel = By.xpath("//input[@placeholder='Search TATA model']");
//	By modelIcon = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[1]/li[3]/span[1]/b[1]");
	
	By variantSearchBar = By.xpath("//input[@placeholder='Search Diesel variant']");
//	By allVariants = By.xpath("//li[contains(@class,'active')]");
	By recentYear = By.xpath("//div[@id='RegistrationForm']//li[1]//span[1]");
	By antiqueYear = By.xpath("//b[normalize-space()='1997']");
	By brandNewCar = By.xpath("//b[normalize-space()='Brand New Car']");
	By fullName = By.id("name");
	By email = By.xpath("//input[@id='email']");
	By phone = By.id("mobileNo");
	By button = By.id("btnLeadDetails");
	
	
	public CarInsurance(WebDriver driver) {
		CarInsurance.driver = driver;
	}
	
	
	
}
