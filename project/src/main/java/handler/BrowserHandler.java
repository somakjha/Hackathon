package handler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import reader.PropertiesReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandler {
	
	/**
	 * handling multiple browsers
	 * @return
	 */
	public WebDriver getWebDriver() {
		PropertiesReader propertiesReader = new PropertiesReader();
		String browserName = propertiesReader.fetchBrowserName();
		WebDriver driver = null;
		
		switch(browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		default:
			System.out.println("The Browser name is not same as defined");
			break;
		}
		
		return driver;
	}
	
	/**
	 * open the Url in the given browser.
	 * @param driver
	 */
	public void launchApplication(WebDriver driver) {
		PropertiesReader prop = new PropertiesReader();
		String url = prop.fetchUrl();
		driver.get(url);
	}
	
	/**
	 * will close browser after test passes.
	 * @param driver
	 */
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

}
