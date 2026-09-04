package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Basepage{
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchText;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[@role='listitem']//span[contains(text(),'Apple iPhone 17 Pro Max 2 TB')]")
	private WebElement result;
	
	
	
	public void searchProduct(String productToBeSearched)
	{
		clearAndSendkeys(searchText,productToBeSearched);
		click(searchButton);
	}
	
	public boolean isMobilePhoneDisplyed()
	{
		 waitForVisibilityOfElement(result);
		boolean isDisplaying = result.isDisplayed();
		return isDisplaying;
	}
}
