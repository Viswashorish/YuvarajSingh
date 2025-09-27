package TestContextSetup_Map;


import PageObjects.PageObjectManager;
import Utils.AllpredefinedMethods;
import Utils.WebManagement;

public class TestcontextSetup {
	
	
	public String Landing_vegName;
	
	public PageObjectManager page;
	
	public WebManagement web;
	
	public AllpredefinedMethods predefined;
	
	
	public TestcontextSetup()
	{
		web = new WebManagement();
		page = new PageObjectManager(web.webManagement_start());
		predefined = new AllpredefinedMethods(web.webManagement_start());
		
	}

}
