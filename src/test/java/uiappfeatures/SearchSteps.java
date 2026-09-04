package uiappfeatures;

import org.testng.Assert;

import drivermanager.DriverFactory;
import drivermanager.PageFactoryManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchSteps {
	SearchPage serachPageObject;
	public SearchSteps()
	{
		 serachPageObject = new PageFactoryManager().getSearchPageObject(DriverFactory.getDriver());
	}

	@When("user search {string} in text field")
	public void user_search_in_text_field(String string)
	{
		serachPageObject.searchProduct(string);
		
	}
	
	
	@Then("mobile search result should displyed")
	public void mobile_search_result_should_displyed() 
	{
		boolean isDisplyaing = serachPageObject.isMobilePhoneDisplyed();
		Assert.assertEquals(isDisplyaing, true);
	}
}
