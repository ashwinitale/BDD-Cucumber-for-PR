package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static String getPropData(String propToBeRead) throws IOException
	{
		String filePath = System.getProperty("user.dir")+ "\\src\\test\\resources\\config.Reader";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String browserName = prop.getProperty(propToBeRead);
		System.out.println(browserName);
		return browserName;
	}
	

		
		
	
}