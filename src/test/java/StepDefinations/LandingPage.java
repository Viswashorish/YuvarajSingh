package StepDefinations;


import TestContextSetup_Map.TestcontextSetup;
import io.cucumber.java.en.*;

public class LandingPage 
{
	
	public String Landing_vegName;
	
	public String Offers_vegName;
	
	TestcontextSetup test;
	
	public LandingPage(TestcontextSetup test)
	{
		this.test = test;
	}
	
	
	
	@Given("user open the application in any browser")
	public void open_the_App() 
	{
		
	}

	@When("user provide the veg table name in {string} search field")
	public void enter_Vegname(String vegName) 
	{
		
		test.page.landingPage().search(vegName);
		test.Landing_vegName = test.page.landingPage().vegtable_Name().split("-")[0].trim();
	}

	

}
