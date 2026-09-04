package uiappfeatures;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import utility.ReadProperty;

public class ApplicationHooks {
	
	@BeforeAll
	public static void launchBrowser() throws IOException
	{
		DriverFactory df = new DriverFactory();
		String browserName = ReadProperty.getPropData("browser");
		WebDriver driver = df.initBrowser(browserName);
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		Status statusOfScenario = scenario.getStatus();
		System.out.println(statusOfScenario);
	    boolean faliedScenario = scenario.isFailed();
	    
	  if(faliedScenario)
	{
		TakesScreenshot ts = (TakesScreenshot)DriverFactory.getDriver();
		byte[] source = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(source, "image/png", scenario.getName());
		
	}
	  
	}
	
	@AfterAll
	public static void quitBrowser()
	{
		DriverFactory.getDriver().quit();
	}

}