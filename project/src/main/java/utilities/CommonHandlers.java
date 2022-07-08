package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import reader.PropertiesReader;

public class CommonHandlers {
	
	WebDriver wait;
	PropertiesReader propReader;
	
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void manageDropDownForCourses(WebDriver driver,String text) {
		WebElement element = driver.findElement(By.id("ddl_Category"));
		Select selectCourse = new Select(element);
		selectCourse.selectByVisibleText(text);
	}
	
	public static void manageDropDownForCities(WebDriver driver,String text) {
		WebElement element = driver.findElement(By.id("ddl_City"));
		Select selectCourse = new Select(element);
		selectCourse.selectByVisibleText(text);  
	}

}
