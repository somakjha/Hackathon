package pages;


import java.util.Date;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelInsurancePage {
    
	
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

	
	
}
