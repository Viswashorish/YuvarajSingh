package StepDefinations;

import TestContextSetup_Map.TestcontextSetup;
import io.cucumber.java.After;

public class Hooks {
	
	TestcontextSetup test;
	
	public Hooks(TestcontextSetup test)
	{
		this.test = test;
	}
	
	@After
	public void closebrowser()
	{
		test.web.webManagement_start().quit();
	}

}
