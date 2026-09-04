package uiappfeatures;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\uiAppFeatures"},
		
		glue  = {"uiappfeatures"},
		
		plugin = {"pretty","html:target/cucumberreport/report.html"}
		
		//publish = true
		
		)
		
	
public class HomeRunnerTest extends AbstractTestNGCucumberTests{
//	@DataProvider(parallel = true)
//	@Override
//	
//	public Object[][] scenarios()
//	{
//		return super.scenarios();
//	}
//	

}
