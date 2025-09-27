package Utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class AllpredefinedMethods 
{
	
	WebDriver driver;
	
	public AllpredefinedMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void windowhandle()
	{
		String parent = driver.getWindowHandle();
		Set<String> childWindows = driver.getWindowHandles();
		
		for(String eachWindow : childWindows)
		{
			if(!eachWindow.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(eachWindow);
				break;
			}
		}
		
	}
	

}
