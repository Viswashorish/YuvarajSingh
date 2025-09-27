package StepDefinations;

import java.util.Set;

import org.testng.Assert;

import TestContextSetup_Map.TestcontextSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OffersPage {
	
	public String Offers_vegName;
	
	TestcontextSetup test;
	
	public OffersPage(TestcontextSetup test)
	{
		this.test = test;
	}
	
	
	@When("click on the Topdeals link and provide the veg name {string} in search field")
	public void click_On_Link(String vegName) 
	{
		test.page.offersPage().clickOn_Link();
		test.predefined.windowhandle();
		test.page.offersPage().search(vegName);
		
		Offers_vegName = test.page.offersPage().vegtable_Name();
		
	}

	@Then("validating vegetables are availables on both dashboard and offers page")
	public void verify_VegTables() 
	{
	   Assert.assertEquals(test.Landing_vegName, Offers_vegName);
	}

}
