package pages;


import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TravelInsurancePage {
    
	Date date = new Date();
	int today = date.getDate();
	
	@FindBy(xpath = "/html/body/main/div[2]/section/div[7]")
	WebElement travelInsurance;
	
	@FindBy(id = "country")
	WebElement destTextbox;
	
	@FindBy(className = "search-item")
	WebElement search_item;
	
	@FindBy(xpath = "//*[@id=\"input-row\"]/p/i")
	WebElement contained_text;
	
	@FindBy(className = "travel_main_cta")
	WebElement nextButton;
	
	@FindBy(className = "pqHeading__subTitle")
	WebElement travelDurationText;
	
	@FindBy(className = "MuiInputBase-input")
	WebElement calendarPath;
	
	@FindBy(xpath = "//*[@id=\"prequote-wrapper\"]/div[2]/div/div[1]/div[1]/div[2]/label")
	WebElement countTraveller;
     
	@FindBy(xpath = "/html/body/section/div[2]/div[3]/div[2]/div/div[1]/div[2]/div[1]/div/select")
	WebElement travellerOneAge;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/select")
	WebElement travellerTwoAge;
	
	@FindBy(id = "ped_no")
	WebElement medicalNo;
	
	@FindBy(id = "mobileNumber")
	WebElement mobileField;
	
	@FindBy(className = "errorMsg")
	WebElement errorText;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/ul/li[7]/a")
	WebElement filter;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/ul/li[7]/div/div/div[2]/div[1]/ul/li[2]")
	WebElement sortBy;
	
	@FindBy(id = "low")
	WebElement lowToHigh;
	
	By startDate = By.xpath("//span[text()="+today+"]");
	By endDate = By.xpath("//span[text()="+(today+7)+"]");
	
	Select select = null;
	
	WebDriver driver = null;
	public TravelInsurancePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void openPage(String url) {
		driver.get(url);
	}

	public void clickTravelInsurance() {
		travelInsurance.click();
	}

	public void enterDestination(String data) {
		destTextbox.sendKeys(data);
	}

	public void selectDestination() {
		try {
			search_item.click();
		} catch (Exception e) {

			System.out.println("NO");
		}

	}

	public void clearSearchText()  {
		
		destTextbox.clear();
	}
	
	public void clearSearchTag()
	{
		contained_text.click();
	}
	public boolean getNextState()
	{
		return nextButton.isEnabled();
	}
	
	public void clickNextButton()
	{
		nextButton.click();
	}
	
	public String getTravelDurationText()
	{
		return travelDurationText.getText();
	}
	public void popCalendar()
	{
		calendarPath.click();
		driver.findElement(startDate).click();
		driver.findElement(endDate).click();
	}
	public void clickTravellerCount()
	{
		countTraveller.click();
	}
	public void setAge(String age1,String age2)
	{
		select = new Select(travellerOneAge);
		select.selectByValue(age1);
		select = new Select(travellerTwoAge);
		select.selectByValue(age2);
	}
	public void selectNoMedical()
	{
		medicalNo.click();
	}
	public void clickMobileField()
	{
		mobileField.click();
	}
	public void clickOutsideMobileField()
	{
		travelDurationText.click();
	}
	public String getErrorMsg()
	{
		return errorText.getText();
	}
	public void enterMobileNo(String data)
	{
		mobileField.sendKeys(data);
	}
	public void clickFilter()
	{
		filter.click();
	}
	public void clickSort()
	{
		sortBy.click();
	}

	
	
}
