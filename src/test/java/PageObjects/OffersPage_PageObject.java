package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage_PageObject 
{
	
WebDriver driver;
	
	public OffersPage_PageObject(WebDriver driver)
	{
		this.driver = driver;
	}

	By search = By.xpath("//input[@id = 'search-field']");
	
	By vegTablename = By.xpath("//table[@class = 'table table-bordered']/tbody/tr/td[1]");
	
	By link = By.linkText("Top Deals");
	
	public void search(String vegname)
	{
		driver.findElement(search).sendKeys(vegname);
	}
	
	public String vegtable_Name()
	{
		return driver.findElement(vegTablename).getText();
	}
	
	public void clickOn_Link()
	{
		driver.findElement(link).click();
		//Master = AB
	}
}
