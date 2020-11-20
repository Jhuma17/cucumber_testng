 package all.usa.pagefactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import all.usa.baseclass.ZooplaSuperClass;


public class MasterFageFactory2 extends ZooplaSuperClass {

	  public MasterFageFactory2 () { //i can call (WebDriver driver) inside parenthesis too
     
      PageFactory.initElements(driver, this); // here driver is a global level

   }
	 
    @FindBy(xpath = "//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
    @CacheLookup   
    private WebElement acceptCookies;

	    public WebElement getAcceptCookies() {
		   return acceptCookies;
	}

      @FindBy (xpath = "(//a[@data-testid='header-profile-sign-in'])[1]")
      @CacheLookup   
      private WebElement clickOnSigninButton;

	     public WebElement getClickOnSigninButton() {
		    return clickOnSigninButton;
	
	 }

       @FindBy(id = "signin_email")
       @CacheLookup   
       private WebElement enterUserName;

	   public WebElement getEnterUserName() {
		  return enterUserName;
	}
		
	   @FindBy(id = "signin_password")
	   @CacheLookup  
	   private WebElement enterPassword;

	   public WebElement getEnterPassword() {
		 return enterPassword;
	}

       @FindBy(id="signin_submit")
       @CacheLookup    
       private WebElement clickLogin;

	   public WebElement getClickLogin() {
		return clickLogin;
	}
	
       @FindBy(xpath = "(//div[@content='Sign out'])[1]")
       @CacheLookup    
       private WebElement clickLogout;

	   public WebElement getClickLogout() {
		 return clickLogout;
	}

  }

			
	





