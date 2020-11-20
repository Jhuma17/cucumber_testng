package all.usa.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import all.usa.baseclass.OutlineSuperClass;


public class OutlinePageFactory extends OutlineSuperClass {

         public OutlinePageFactory() {   //i can call (WebDriver driver) inside parenthesis too

         PageFactory.initElements(driver, this); // here driver is a global level

}

        @FindBy(id = "Email")
     	@CacheLookup
     	private WebElement enterUserName;

     	public WebElement getEnterUserName() {
     		enterUserName.clear();
     		return enterUserName;
     	}

     	@FindBy(id = "Password")
     	@CacheLookup
     	private WebElement enterPassWord;

     	public WebElement getEnterPassWord() {
     		enterPassWord.clear();
     		return enterPassWord;
     	}

       @FindBy(xpath = "//*[@value='Log in']")
       @CacheLookup
       private WebElement clickLogin;

 	 public WebElement getClickLogin() {
 		return clickLogin;
 	}

      @FindBy(linkText = "Logout")
      @CacheLookup
      private WebElement clickLogout;

 	public WebElement getClickLogout() {

 		 return clickLogout;
     

} }
