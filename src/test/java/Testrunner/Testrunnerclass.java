package Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features",glue="StepDefinations",monochrome = true,dryRun = false,
plugin = {"pretty","html:target/Srinivas.html","rerun:target/failed.txt"},tags = "@smoke")
public class Testrunnerclass extends AbstractTestNGCucumberTests{
	
	
	public Object[][] Scenarios()
	{
		return super.scenarios();
	}

}
