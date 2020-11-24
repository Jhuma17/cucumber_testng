   package my.runner.uk;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

    @CucumberOptions(   
		
    	// more clearly can read the file, not mandatory	
        monochrome = true,
    	
       // dryRun = true,
       	
    	// we generate the report & specify the location
    	
        plugin= {"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
    	
    	// location of folder
    	
        features = "Cucumber_Features/LoginTestCases.feature",  
		
    	// location of step definition	  
	    
        glue = "stepdefinition.uk.zoopla" 
		
	   // declare couple of test cases
	    //  tags = "@Test_05,@Test_03"
	           
    		
    		)
	  
	  
     public class MyRunner2 extends AbstractTestNGCucumberTests{


    }
