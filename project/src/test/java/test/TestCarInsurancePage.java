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
//	
////	@Test(priority=3)
////	public void testSearchBarForCity() {
////		ci.searchCityAndDistrict();
////	}
//	
////	@Test(priority=4)
////	public void testBackwardArrow() {
////		ci.moveBack();
////	}
//	
	@Test(priority=3)
	public void testCityIcon() {
		ci.selectingCity();
	}
//	
//	@Test(priority=6)
//	public void testCityDistrictCode() {
//		ci.selectDistrictCode();
//	}
//	
////	@Test(priority=7)
////	public void testSearchBarForCar() {
////		ci.clickSearchBarForCar();
////		ci.moveBack();
////	}
//
//	
//	@Test(priority=8)
//	public void testCarIcons() {
//		ci.clickCarIcon();
//	}
//	
//	@Test(priority=9)
//	public void testCarModelIcons() {
//		ci.clickModelIcon();
//	}
//	
//	@Test(priority=10)
//	public void testSelectCarFuelType() {
//		ci.clickCarFuelType();
//	}
//	
//	@Test(priority=11)
//	public void testForAllVariant() {
//		ci.selectVariantByAllVariants();
//	}
//	
//	@Test(priority=12)
//	public void testForAutomaticVariant() {
//		ci.selectVariantByAutomatic();
//	}
//	
//	@Test(priority=13)
//	public void testForManualVariant() {
//		ci.selectVariantByManual();
//	}
//	
//	
//	@Test(priority=14)
//	public void testSelectCarVariant() {
//		ci.selectVariant();
//	}
//	
//	@Test(priority=15)
//	public void testSelectAnyYear() {
//		ci.selectAnyYear();
//	}
//	
//	@Test(priority=16)
//	public void testWriteFullName() {
//		ci.writeName();
//	}
//
//	@Test(priority=17)
//	public void testWriteEmail() {
//		ci.writeEmail();
//	}
//	
//	@Test(priority=18)
//	public void testWritePhoneNumber() {
//		ci.writePhoneNumber();
//	}
//	
//	@Test(priority=19)
//	public void testViewPriceButton() {
//		ci.clickViewPrices();
//	}

	
}
