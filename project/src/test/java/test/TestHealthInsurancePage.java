package test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//https://health.policybazaar.com/?pq=health0&new=1&utm_content=home_v12
//https://health.policybazaar.com/?iscompareexp=1&utm_content=home_v12_compareexp
import handler.BrowserHandler;
import pages.HealthInsurancePage;

public class TestHealthInsurancePage {

	public static WebDriver driver = null;
	public HealthInsurancePage hi = null;

	@BeforeTest
	public void setUpBrowser() throws UnknownHostException {
		driver = BrowserHandler.getWebDriver();
		hi = new HealthInsurancePage(driver);
	}

	@BeforeTest(dependsOnMethods = "setUpBrowser")
	public void openPage() {
		hi.openPolicyBazaar();
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();
	}

	@Test(priority = 1)
	public void clickHealthInsurance() {
		String title = hi.openHealthInsurancePage();
		Assert.assertEquals("PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month", title);
	}

	@Test(priority = 2)
	public void clickSubmit() {
		hi.clickSubmitButton();
	}

	@Test(priority = 3)
	public void selectAgeYoung() {
		hi.selectYoungestAge();
	}

	@Test(priority = 4)
	public void selectAgeOld() {
		hi.selectEldestAge();
	}

	@Test(priority = 5)
	public void openCityPage() {
		hi.clickSubmitButton();
	}

	@Test(priority = 6)
	public void enterPinCode() {
		hi.checkCityBoxFromCityPinCode();
	}

	@Test(priority = 7)
	public void enterCity() {
		hi.closeCityBox();
		hi.checkCityBoxFromCityName();
	}

	@Test(priority = 8)
	public void selectCity() {
		hi.selectCity();
	}

	@Test(priority = 9)
	public void selectGender() {
		hi.selectGender();
	}

	@Test(priority = 10)
	public void enterName() {
		hi.writeName();
	}

	@Test(priority = 11)
	public void enterNumber() {
		hi.writeNumber();
	}

	@Test(priority = 12)
	public void viewMedicalHistoryPage() {
		hi.checkContinueForDetails();
	}

	@Test(priority = 13)
	public void checkNoDisease() {
		hi.checkWithNoDisease();
	}
	
	@Test(priority = 14)
	public void checkAnyDisease() {
		//hi.checkWithNoDisease();
	}

	@Test(priority = 15)
	public void getPlansInfo() {
		List<String> list = hi.gettingPlans();

		for (String x : list) {
			System.out.println(x);
		}
	}

}
