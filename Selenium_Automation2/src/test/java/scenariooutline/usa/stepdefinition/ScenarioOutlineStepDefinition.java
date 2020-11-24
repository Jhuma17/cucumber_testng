package scenariooutline.usa.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.util.ElementUtility;
import com.util.HighlighterClass;

import all.usa.baseclass.OutlineSuperClass;
import all.usa.pagefactory.OutlinePageFactory;
import cucumber.api.java.en.*;

public class ScenarioOutlineStepDefinition extends OutlineSuperClass {

	 OutlinePageFactory opf;
                
	 @Given("^As a user i can open any browser$")
		public void as_a_user_i_can_open_any_browser() throws Throwable {		
		logger.info("*******> As a user i can open any browser <*******");
		 OutlineSuperClass.initialization();
	     opf = PageFactory.initElements(driver, OutlinePageFactory.class);
			// opf = new OutlinePageFactory(); // I can use this way too 
         
  }

        @Given("^As a user i can enter the \"([^\"]*)\" and go to the login page$")
        public void as_a_user_i_can_enter_the_and_go_to_the_login_page(String URL) throws InterruptedException  {
 	    logger.info("*******> As a user i can enter the url <*******");
                driver.get(URL);

    }

        @When("^As a user i can enter the \"([^\"]*)\" and password \"([^\"]*)\"$")
       public void as_a_user_i_can_enter_the_and_password(String userName, String passWord) throws IOException  {
 	   
      logger.info("*******> As a user i can enter the username <*******");   
 	   //HighlighterClass.getcolor(driver, opf.getEnterUserName(), "green"); 
 	  ElementUtility.waitForElement(opf.getEnterUserName());
 		opf.getEnterUserName().sendKeys(userName);
 		ElementUtility.getScreenShot(driver, "UserName");
 	  
 		logger.info("*******> As a user i can enter the password <*******");  
 	  // HighlighterClass.getcolor(driver, opf.getEnterPassWord(), "green"); 
 	  ElementUtility.waitForElement(opf.getEnterPassWord());
 	    opf.getEnterPassWord().sendKeys(passWord);
 	   ElementUtility.getScreenShot(driver, "Password");
 	   
    }

       @When("^Click on login$")
       public void click_on_login() throws IOException  {
       logger.info("*******> As a user i can click on login button <*******");
      // HighlighterClass.getcolor(driver, opf.getClickLogin(), "green");
       ElementUtility.waitForElement(opf.getClickLogin());
       opf.getClickLogin().click();
      // ElementUtility.getScreenShot(driver, "Login");
 }

      @When("^Homepage title should be \"([^\"]*)\"$")
      public void homepage_title_should_be(String homeTitle) throws InterruptedException  {
      logger.info("*******> As a user i can verify the homepage <*******");
      if(driver.getPageSource().contains("Login was unsuccessful.")) {
 	
 	       driver.quit();                       // if test case failed browser willbe close
 }
       else {                         // test case pass that's they take else & avoid if
      Assert.assertEquals("Dashboard / nopCommerce administration", homeTitle); //assert coming from testng
    
      }
           
 } 
      @When("^As a user i can click on logout link$")
     public void as_a_user_i_can_click_on_logout_link()  {
     logger.info("*******> As a user i can logout the application <*******");  
    // HighlighterClass.getcolor(driver, opf.getClickLogout(), "green");
     ElementUtility.waitForElement(opf.getClickLogout());
       opf.getClickLogout().click();

 }


	@Then("^Loginpage title should be \"([^\"]*)\"$")
     public void loginpage_title_should_be(String loginTitle)  {
     logger.info("*******> As a user i can verify the login title <*******");
 	 if(driver.getPageSource().contains("Login was unsuccessful.")) {
    	 System.out.println("My test is failed");
    	      driver.quit();
 }
      else {                       
      Assert.assertEquals("Your store. Login", loginTitle); 
       System.out.println("Login page is pass");

   }
 }

     @Then("^Close the browser$")
     public void close_the_browser()  {
     driver.quit();
  }
     
}

