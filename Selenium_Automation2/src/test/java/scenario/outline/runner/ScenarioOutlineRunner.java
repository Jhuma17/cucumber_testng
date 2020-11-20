package scenario.outline.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 @CucumberOptions(
		
		monochrome = true,
		
		dryRun = true,
		
		plugin= {"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
		 
		features = "Cucumber_Features",
		 
		 glue = "scenariooutline.usa.stepdefinition"
		
		
		
		           )


    public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests {

 }
