package uiappfeatures;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import drivermanager.DriverFactory;
import drivermanager.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utility.ReadProperty;

public class HomeSteps {
	HomePage homePageObject;
	public HomeSteps()
	{
		 homePageObject = new PageFactoryManager().getHomePageObject(DriverFactory.getDriver());
	}
	@Given("user is at landing page")
	public void user_is_at_landing_page() throws InterruptedException, IOException
	{
	    WebDriver driver = DriverFactory.getDriver();
	    // String url = ReadProperty.getPropData("testurl");
	    driver.get(ReadProperty.getPropData("testurl"));
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    
	}
	
	@When("page title should contain {string}")
	public void page_title_should_contain(String string) 
	{
		String title = homePageObject.getTitleOfPage();
		boolean isPresent = title.contains(string);
		Assert.assertEquals(isPresent, true);
	}
	
	@When("user click on deal section")
	public void user_click_on_deal_section() 
	{
		homePageObject.checkOutDealSection();
	}
	
	@Then("user should redirect to deal page")
	public void user_should_redirect_to_deal_page()
	{
		boolean isDisplyed = homePageObject.validateTextOnDealPage();
		Assert.assertEquals(isDisplyed, true);
	}
	

    @When("cart icon should displayed")
    public void cart_icon_should_displayed()
    {
	   
	   boolean isDisplayed = homePageObject.isCartIconDisplyed();
	   Assert.assertEquals(isDisplayed, true);
   }



}

