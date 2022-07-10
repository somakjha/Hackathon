package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import handler.BrowserHandler;
import reader.ExcelReader;

public class CarInsurance {

	public static WebDriver driver;
	public static String[] data = null;
	
	public void getData() {
		try {
			data = ExcelReader.getDataFromExcel();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	By carInsuranceIcon = By.xpath("//div[@class='shadowHandlerBox']//i[@class='icon-bg homeIconsBg car-insurance']");
	By proceedLink = By.xpath("//a[@class='btn-proceed']");
	By city = By.id("spn6"); // for giving dummy details for city as "PUNE"
	By districtCode = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/ul[1]/li[2]/span[1]");// for district code
	By searchBarCity = By.xpath("//input[@placeholder='Search RTO (e.g. MH02 or Mumbai)']");
	By searchBarCarCompany = By.xpath("//input[@placeholder='Search car brand']");
	By carIcon = By.xpath("//span[@class='tata']"); // dummy details
	By searchBarCarModel = By.xpath("//input[@placeholder='Search TATA model']");
	By modelIcon = By.xpath("//*[text()='NEXON']");
	By fuelType = By.id("Diesel");
	By variantSearchBar = By.xpath("//input[@placeholder='Search Diesel variant']");
	By allVariants = By.xpath("//li[text()='All variants']");
	By automatic = By.xpath("//*[text()='Automatic']");
	By manual = By.xpath("//li[text()='Manual']");
	By brandNewCar = By.xpath("//b[normalize-space()='Brand New Car']");
	By fullName = By.id("name");
	By email = By.xpath("//input[@id='email']");
	By phone = By.id("mobileNo");
	By button = By.id("btnLeadDetails");
	By backwardArrow = By.xpath("//span[@class='l_arrowicon']");
	By emailError = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]");
	By phoneError = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]");
	
	public CarInsurance(WebDriver driver) {
		CarInsurance.driver = driver;
	}

	public void openPolicyBazaar() {
		BrowserHandler bh = new BrowserHandler();
		bh.launchApplication(driver);
	}

	public String clickCarInsuranceIcon() {
		driver.findElement(carInsuranceIcon).click();
		
		return driver.getTitle();
	}

	public void proceedWithoutCarNumber() {
		driver.findElement(proceedLink).click();
	}

	public void selectingCity() {
		driver.findElement(city).click();
	}

	public void selectDistrictCode() {
		driver.findElement(districtCode).click();
	}

	public void moveBack() {
		driver.findElement(backwardArrow).click();
	}

//	public void searchCityAndDistrict() {
//		driver.findElement(searchBarCity).sendKeys(""); // FAIL TEST CASE BECAUSE NOT
//		// MOVING FORWARD EVEN WRITING COMPLETELY
//	}
//
//	public void clickSearchBarForCar() {
//		driver.findElement(searchBarCarCompany).sendKeys("");
//	}

	public void clickCarIcon() {
		driver.findElement(carIcon).click();
	}

	public void clickModelIcon() {
		driver.findElement(modelIcon).click();
	}

	public void clickCarFuelType() {
		driver.findElement(fuelType).click();
	}

	public void selectAnyYear() {
		driver.findElement(brandNewCar).click();
	}
	
	public void selectVariantByAllVariants() {
		driver.findElement(allVariants).click();
	}

	public void selectVariantByAutomatic() {
		driver.findElement(automatic).click();
	}

	public void selectVariantByManual() {
		driver.findElement(manual).click();
	}
	
	public void selectVariant() {
		driver.findElement(By.xpath("//b[normalize-space()='Kaziranga XZ Plus (P) Diesel (1497 cc)']")).click();
	}
	
	public void writeName() {
		driver.findElement(fullName).sendKeys("amay");
	}
	
	public void writeEmail() {
		driver.findElement(email).sendKeys("amay.234@wys");
	}
	
	public void writePhoneNumber() {
		driver.findElement(phone).sendKeys("9589173046");
	}
	
	public void clickViewPrices() {
		driver.findElement(button).click();
	}
	
	public String captureErrorMessageForEmail() {
		String errorMessage = driver.findElement(emailError).getText();
		return errorMessage;
	}
	
	public String captureErrorMessageForPhone() {
		String errorMessage = driver.findElement(phoneError).getText();
		return errorMessage;
	}
	
	public void clearDetails() {
		driver.findElement(fullName).clear();
		driver.findElement(email).clear();
		driver.findElement(phone).clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeValidDetails() {
		driver.findElement(fullName).sendKeys("amay");
		driver.findElement(email).sendKeys("amay.2308@gmail.com");
		driver.findElement(phone).sendKeys("9589173046");
	}
	

}
