package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage{
	WebDriver driver;
	WebDriverWait wait;
	
	public Basepage(WebDriver driver)
	{
		wait= new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public WebElement waitForVisibilityOfElement(WebElement element)
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
		return ele;
	}

	public WebElement waitForElementToBeClickable(WebElement element)
	{
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element));
		return ele;
		
	}
	
	public void click(WebElement element)
	{
		waitForElementToBeClickable(element).click();
	}
	
	public void clearAndSendkeys(WebElement element, String textToBeTyped)
	{
		element = waitForVisibilityOfElement(element);
		element.clear();
		element.sendKeys(textToBeTyped);
	}
}