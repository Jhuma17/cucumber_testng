package testng.usa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

   public class TestNGClass {

            WebDriver driver;
   
       @DataProvider(name ="Authentication")   
       
         //no-void ,return type method
       public static Object[][]credentials(){
   
        return new Object[] []{{"jhumarayyan@gmail.com","Tuktuki2712"},
        	                  {"jhumarayyan@gmail.com","Tuktuki2712"}};
    
    }
        
         //Here we calling the data provider object with its name
        @Test(dataProvider = "Authentication")
         public void browserTesting(String Email, String Password) {
   
        System. setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
       		//initialize browser
       		WebDriver driver=new ChromeDriver();//upcasting
  
       	  driver.navigate().to("https://www.zoopla.com/");    
     	    driver.manage().window().maximize();  
        
     	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 
      driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
      driver.findElement(By.xpath("(//a[@data-testid='header-profile-sign-in'])[1]")).click();
           
           driver.findElement(By.name("signin_email")).sendKeys(Email);
 		   driver.findElement(By.name("signin_password")).sendKeys(Password);
 		   driver.findElement(By.id("signin_submit")).click();
 			
 			driver.quit();
            
        
        }
        
   }       
        
        
        
   