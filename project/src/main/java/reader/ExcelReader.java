package reader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	/**
	 * getting data from excel file in string array.
	 * @return
	 * @throws Exception
	 */
	public static String[] getDataFromExcel() throws Exception {
		String[] dataArray = new String[10];

		PropertiesReader propertiesReader = new PropertiesReader();
		
		String fileName = propertiesReader.fetchExcelFileName();
		
		String filePath = FileHelper.getBasePath() + "//src//main//resources//" + fileName;
		
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow row = sheet.getRow(1);
		
		for(int i=0;i<10;i++) {
			dataArray[i] = String.valueOf(row.getCell(i));
		}
		return dataArray;
	}

}
