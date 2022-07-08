package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHandler {
	
	public static void handleAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
