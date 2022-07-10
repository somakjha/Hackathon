package pages;

import java.util.*;

import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import handler.BrowserHandler;

public class HealthInsurancePage {

	public static WebDriver driver;
	public static String[] data = null;
	public static Select select = null;
	By gender = By.xpath("//i[@class='gender female']");
	By fullName = By.id("fullname");
	By phone = By.id("pmobile");
	By continueBtn = By.xpath("//button[@type='submit']");
	By selectAge = By.xpath("//select[@id='Self']");
	By city = By.id("txtcity");
	By noDiseaseCheckbox = By.id("ped_last");
	By anyDiseaseCheckBox = By.id("ped_2");
	By viewPlan = By.id("viewplans");
	By submit = By.id("submitButton");
	By selectCityPin = By.xpath("//li[@class='active']");
	By cityCross = By.xpath("//div[@class='close_city_box']");
	By planName = By.xpath("//div//span[@class='quotes_rvmp_card__content__plan_header__name']");
	List<WebElement> planNameElements = null;

	public HealthInsurancePage(WebDriver driver) {
		HealthInsurancePage.driver = driver;
	}

	public void openPolicyBazaar() {
		BrowserHandler bh = new BrowserHandler();
		bh.launchApplication(driver);
	}

	public String openHealthInsurancePage() {
		driver.get("https://health.policybazaar.com/?iscompareexp=1&utm_content=home_v12_compareexp&new=1");
		String title = driver.getTitle();
		return title;
	}

	public void selectGender() {
		driver.findElement(gender).click();
	}

	public void writeName() {
		driver.findElement(fullName).sendKeys("dummy");
	}

	public void writeNumber() {
		driver.findElement(phone).sendKeys("6391876378");
	}

	public void checkContinueForDetails() {
		driver.findElement(continueBtn).click();
	}

	public void selectYoungestAge() { // select 18
		select = new Select(driver.findElement(selectAge));
		select.selectByVisibleText("18 yr");
	}

	public void selectEldestAge() { // select 100
		select = new Select(driver.findElement(selectAge));
		select.selectByVisibleText("100 yr");
	}

	public void checkCityBoxFromCityName() {
		driver.findElement(city).sendKeys("Hyderabad");
	}

	public void checkCityBoxFromCityPinCode() {
		driver.findElement(city).sendKeys("500092");
	}

	public void closeCityBox() {
		driver.findElement(cityCross).click();
	}

	public void selectCity() {
		driver.findElement(selectCityPin).click();
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

	public void clickSubmitButton() {
		driver.findElement(submit).click();
	}

	public List<String> gettingPlans() {

		List<String> plans = new ArrayList<String>();
		planNameElements = driver.findElements(planName);

		for (WebElement x : planNameElements) {
			String temp = x.getText();
			plans.add(temp);
		}

		return plans;
	}

}
