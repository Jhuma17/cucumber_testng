package all.usa.baseclass;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZooplaSuperClass {

	  public static WebDriver driver;
      
	  public static Logger logger;  //we import from apache logger
	
        public ZooplaSuperClass() {
		  
		  logger = Logger.getLogger("QA-Testing"); // Added logger
		  PropertyConfigurator.configure("log4j.properties");
		  
		  
	}	  
		 
	     public static void initialization() {
	  
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 driver = new ChromeDriver();   // called upcasting
		  driver.manage().window().maximize();
		  
	  
	  
	  
	  
	  
	}
}