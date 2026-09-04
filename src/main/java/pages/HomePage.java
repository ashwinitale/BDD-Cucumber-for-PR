package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Basepage{
	 WebDriver driver;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//img[@alt='budget headphones']")
	private WebElement dealSection;
	
	@FindBy(xpath="//span[text()='Electronics']")
	private WebElement electronicText;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleOfPage()
	{
	String title = driver.getTitle();
	return title;
	}
	
	public boolean isCartIconDisplyed()
	{
		boolean isDisplying = cartIcon.isDisplayed();
		return isDisplying;
	}
	
	public void checkOutDealSection()
	{
		WebElement element = waitForVisibilityOfElement(dealSection);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public boolean validateTextOnDealPage()
	{
		WebElement element = waitForVisibilityOfElement(electronicText);
		boolean isDisplying = element.isDisplayed();
		return isDisplying;
	}
	
}