package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import handler.BrowserHandler;
import pages.CarInsurance;

public class TestCarInsurancePage {

	public static WebDriver driver = null;
	public CarInsurance ci = null;
	
	
	@BeforeTest
	public void setUpBrowser() {
		driver = BrowserHandler.getWebDriver();
		ci = new CarInsurance(driver);
	}
	
	@BeforeTest(dependsOnMethods="setUpBrowser")
	public void openPage() {
		ci.openPolicyBazaar();
	}
	
	@BeforeTest(dependsOnMethods="openPage")
	public void retrieveData() {
		ci.getData();
	}
	
	@Test(priority=1)
	public void testCarInsuranceIcon() {
		String actual = ci.clickCarInsuranceIcon();
		Assert.assertEquals(actual,"PolicyBazaar Car Insurance: Insure Your Car Today");
	}
	
	@Test(priority=2)
	public void testProceedButton() {
		ci.proceedWithoutCarNumber();
	}

	@Test(priority=3)
	public void testCityIcon() {
		ci.selectingCity();
	}

	@Test(priority=4)
	public void testCityDistrictCode() {
		ci.selectDistrictCode();
	}
	
	@Test(priority=5)
	public void testCarIcons() {
		ci.clickCarIcon();
	}
//	
	@Test(priority=6)
	public void testCarModelIcons() {
		ci.clickModelIcon();
	}
//	
	@Test(priority=7)
	public void testSelectCarFuelType() {
		ci.clickCarFuelType();
	}
//	
	@Test(priority=9)
	public void testForAllVariant() {
		ci.selectVariantByAllVariants();
	}
//	
	@Test(priority=8)
	public void testForAutomaticVariant() {
		ci.selectVariantByAutomatic();
	}
//	
	@Test(priority=10)
	public void testForManualVariant() {
		ci.selectVariantByManual();
	}
//	
//	
	@Test(priority=11)
	public void testSelectCarVariant() {
		ci.selectVariant();
	}
//	
	@Test(priority=12)
	public void testSelectAnyYear() {
		ci.selectAnyYear();
	}
//	
	@Test(priority=13)
	public void testWriteInvalidFullName() {
		ci.writeName();
	}
//
	@Test(priority=14)
	public void testWriteInvalidEmail() {
		ci.writeEmail();
	}
//	
	@Test(priority=15)
	public void testWriteInvalidPhoneNumber() {
		ci.writePhoneNumber();
	}
	
	@Test(priority=16)
	public void testViewPriceInvalidDetails() {
		ci.clickViewPrices();
	}

	
	@Test(priority=17)
	public void testGetEmailErrorMessage() {
		String emailError = ci.captureErrorMessageForEmail();
		Assert.assertEquals(emailError, "Please enter a valid e-mail ID.");
	}
	
	
	@Test(priority=18)
	public void testValidDetails() {
		ci.clearDetails();
		ci.writeValidDetails();
		ci.clickViewPrices();
	}
	
}
