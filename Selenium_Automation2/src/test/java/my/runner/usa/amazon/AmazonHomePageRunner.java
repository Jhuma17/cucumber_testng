package my.runner.usa.amazon;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		monochrome = true,
		 
		dryRun = true,
		
		plugin = {"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
		
		features = "Cucumber_Features/HomePage.feature",
		
		glue = "homepage.usa.stepdefinition",
		
        tags= "@iphone,@laptop"
                                    
		                 )



public class AmazonHomePageRunner extends AbstractTestNGCucumberTests {

       

    }
