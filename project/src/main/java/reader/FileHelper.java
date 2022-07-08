package reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileHelper {
	
	/**
	 * fetching the base path of project
	 * @return
	 */
	public static String getBasePath() {
		return System.getProperty("user.dir");
	}
	
	
	/**
	 * get config.properties location
	 * @return
	 */
	public String getMainResourceConfig() {
		return getBasePath() + "//src//main//resources//config.properties";
	}
	
	/**
	 * Returning config file in binaries.
	 * @return
	 * @throws FileNotFoundException
	 */
	public InputStream getConfigFile() throws FileNotFoundException {
		return new FileInputStream(getMainResourceConfig());
	}
	
	

}
