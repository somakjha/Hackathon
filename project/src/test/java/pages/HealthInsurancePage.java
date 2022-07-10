package pages;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import handler.BrowserHandler;

public class HealthInsurancePage {
	
	public static WebDriver driver;
	public static String[] data = null;
	
	By healthInsuranceIcon = By.xpath("//div[@class='shadowHandlerBox']//i[@class='icon-bg homeIconsBg health-insurance']");
	By gender = By.className("gender female");
	By fullName = By.id("fullname");
	By phone = By.id("pmobile");
	By continueBtn = By.id("continuecta1");
	By insurePerson = By.xpath("//i[@class='gender self']");
	By selectAge = By.id("eldestMemberAge"); // this must be passed in select class for selecting drop down for ages.
	By continueToInsure = By.id("continuecta2");
	By city = By.id("txtcity");
	By continueToCity = By.id("continuecta3");
	By noDiseaseCheckbox = By.id("ped_last");
	By anyDiseaseCheckBox = By.id("ped_2");
	By viewPlan = By.id("viewplans");
	
	By firstPlan = By.xpath("//span[normalize-space()='NCB Super Premium']");
	By secondPlan = By.xpath("//span[normalize-space()='Max Saver']");
	By thirdPlan = By.xpath("//span[normalize-space()='Care']");
	
	public HealthInsurancePage(WebDriver driver) {
		HealthInsurancePage.driver = driver;
	}
	
	public void openPolicyBazaar() {
		BrowserHandler bh = new BrowserHandler();
		bh.launchApplication(driver);
	}
	
	public String openHealthInsurancePage() {
		driver.findElement(healthInsuranceIcon).click();
		String title = driver.getTitle();
		return title; // here use assert in test class as done in car insurance
		// and after doing that delete this comment
	}
	
	public void selectGender() {
		driver.findElement(gender).click();
	}
	
	public void writeName() {
		driver.findElement(fullName).sendKeys("Rani");
	}
	
	public void writeNumber() {
		driver.findElement(phone).sendKeys("888888888");
	}
	
	public void checkContinueForDetails() {
		driver.findElement(continueBtn).click();
	}
	
	public void selectInsuringPerson() { // Me
		driver.findElement(insurePerson).click();
	}
	
	public void selectYoungestAge() { // select 18
		WebElement age = driver.findElement(selectAge);
		Select selectAge = new Select(age);
		selectAge.selectByVisibleText("22 yr");
	}
	
	public void selectEldestAge() { // select 100
		WebElement age = driver.findElement(selectAge);
		Select selectAge = new Select(age);
		selectAge.selectByVisibleText("100 yr");
	}
	
	public void checkContinueForAge() {
		driver.findElement(continueToInsure).click();
	}
	
	public void checkCityBoxFromCityName() {
		driver.findElement(city).sendKeys("Hyderabad");
	}
	
	public void checkCityBoxFromCityPinCode() {
		driver.findElement(city).sendKeys("500092");
	}
	
	public void checkContinueForCity() {
		driver.findElement(continueToCity).click();
	}
	
	public void checkWithNoDisease() {
		driver.findElement(noDiseaseCheckbox).click();
		// if we tick none of these then automatically view plan will be clicked
		// and result get displayed.
	}
	
	public void checkWithAnyDisease() {
		driver.findElement(anyDiseaseCheckBox).click();
		// if we tick this then we have to click view plan button so use test case 
		// accordingly.
	}
	
	public void checkViewPlanButton() {
		driver.findElement(viewPlan).click();
	}
	
	public List<String> gettingPlans() {
		List<String> plans = new ArrayList<String>();
		// go with age 22 years then find plans with no disease check box and 
		// retrieve items.
		// data given
		/* gender = female
		 * name = Rani
		 * number = 8888888888
		 * person = Me
		 * Age = 22
		 * City = Hyderabad / Pincode = 500092
		 * disease = none
		 * 
		 * Filter use karna ho to kar lena bhai mai ni kar raha or kar dena comment delete
		 */
		plans.add(driver.findElement(firstPlan).getText());
		plans.add(driver.findElement(secondPlan).getText());
		plans.add(driver.findElement(thirdPlan).getText());
		return plans;
	}
	
	
	
	
}
