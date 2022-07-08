package reader;

import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	private Properties prop;
	
	
	public PropertiesReader() {
		FileHelper fileHelper = new FileHelper();
		prop = new Properties();
		try {
			prop.load(fileHelper.getConfigFile());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * getting browser name from config.properties file
	 * @return
	 */
	public String fetchBrowserName() {
		return prop.getProperty("browserName");
	}
	
	public String fetchProperty(String key)
	{
		return prop.getProperty(key);
	}
	/**
	 * getting explicit wait from config.properties file
	 * @return
	 */
	public int fetchExplicitWait() {
		return Integer.parseInt(prop.getProperty("explicitWait"));
	}
	
	/**
	 * getting Url from config.properties file
	 * @return
	 */
	public String fetchUrl() {
		return prop.getProperty("url");
	}
	
	/**
	 * getting excel file name from config.properties file
	 * @return
	 */
	public String fetchExcelFileName() {
		return prop.getProperty("excelFileName");
	}

}
