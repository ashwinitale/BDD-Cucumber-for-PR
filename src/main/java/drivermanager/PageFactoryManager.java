package drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;
import pages.SearchPage;

public class PageFactoryManager {
	HomePage homepage;
	SearchPage searchpage;
	public HomePage getHomePageObject(WebDriver driver)
	{
		if(homepage == null)
		{
			homepage = new HomePage(driver);
			return homepage;
		}
		else
		{
			return homepage;
		}
		
			}
	
	
	public SearchPage getSearchPageObject(WebDriver driver)
	{
		if(searchpage == null)
		{
			searchpage = new SearchPage(driver);
			return searchpage;
		}
		else
		{
			return searchpage;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}