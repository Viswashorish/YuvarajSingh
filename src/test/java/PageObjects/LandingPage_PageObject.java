package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage_PageObject 
{
	
	
	WebDriver driver;
	
	public LandingPage_PageObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search = By.xpath("//input[@placeholder = 'Search for Vegetables and Fruits']");
	
	By vegName = By.xpath("//h4[contains(text(),'Tomato - 1 Kg')]");
	
	public void search(String vegname)
	{
		driver.findElement(search).sendKeys(vegname);
	}
	
	public String vegtable_Name()
	{
		return driver.findElement(vegName).getText();
		//This  is AB - MA AMMA garu code INDI
		//Master = AB
	}

}
