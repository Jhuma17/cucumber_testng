 package stepdefinition.uk.zoopla;


import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import all.usa.baseclass.ZooplaSuperClass;
import all.usa.pagefactory.MasterFageFactory2;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition2 extends ZooplaSuperClass {
	   
	    MasterFageFactory2 pf;
	
	@Given("^As a user I am able to open any browser$")
	public void as_a_user_I_am_able_to_open_any_browser()  {
	logger.info("*******> As a user i can open any browser <*******");   
	     ZooplaSuperClass.initialization();
       pf=PageFactory.initElements(driver, MasterFageFactory2.class);
      
	}

	@Given("^As a user I am able to enter \"([^\"]*)\"$")
	public void as_a_user_I_am_able_to_enter(String URL)  {
	    driver.get(URL);
	logger.info("*******> As a user i can enter the url <*******");  
	    pf.getAcceptCookies().click();
	}

	@When("^As a user i can click on signin button$")
	public void as_a_user_i_can_click_on_signin_button()  {
	 logger.info("*******> As a user i can click on signin button <*******");
		pf.getClickOnSigninButton().click();

	}

	@When("^As a user i can enter the \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void as_a_user_i_can_enter_the_and_password(String un, String pwd)  {
	 logger.info("*******> As a user i can enter the username <*******");
	  pf.getEnterUserName().sendKeys(un);
	 logger.info("*******> As a user i can enter the password <*******");
	  pf.getEnterPassword().sendKeys(pwd);
	}

	@When("^As a user i can click on login button$")
	public void as_a_user_i_can_click_on_login_button()  {
	 logger.info("*******> As a user i can click on login button <*******");  
        pf.getClickLogin().click();
	}

	@When("^Homepage title should be \"([^\"]*)\"$")
	public void homepage_title_should_be(String homeTitle)  {
	logger.info("*******> As a user i can verify the homepage <*******");
		 if(driver.getPageSource().contains("Incorrect email or password")) {
		   	System.out.println("My test is failed");
		   	      driver.quit();                       // if test case failed browser willbe close
		 }

	   else {                         // test case pass that's they take else & avoid if
		 Assert.assertEquals("Zoopla users can buy the property & sell the property", homeTitle); //assert coming from testng
		     System.out.println("Home page validation is pass");
		  }
       }

	 @When("^As a user i can click on logout link$")
	 public void as_a_user_i_can_click_on_logout_link()  {
	 logger.info("*******> As a user i can logout the application <*******");  
	   	 pf.getClickLogout().click(); 

	}

	 @Then("^Loginpage title should be \"([^\"]*)\"$")
	 public void loginpage_title_should_be(String loginTitle)  {
	 logger.info("*******> As a user i can verify the login title <*******");
		  if(driver.getPageSource().contains("Incorrect email or password")) {
		      	 System.out.println("My test is failed");
		      	      driver.quit();
		    }
		        else {                       
		        Assert.assertEquals("We know what a home is really worth", loginTitle); 
		         System.out.println("Login page is pass");

		    } 

	}

	 @Then("^close the browser$")
	 public void close_the_browser()  {
	   driver.quit(); 

	} 

}
