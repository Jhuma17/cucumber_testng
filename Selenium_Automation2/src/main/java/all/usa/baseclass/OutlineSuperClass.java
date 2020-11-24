package all.usa.baseclass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.ElementUtility;

public class OutlineSuperClass {

    	 public static WebDriver driver;
    	 public static Logger logger;  //we import from apache logger
    	 public static Properties configProp;
    	   
  	   public static WebDriver getDriver() {
  		return driver;
  	}
    	
  	      // Logger
       public OutlineSuperClass() { //declare constractor for initialized logger
    	
    	logger = Logger.getLogger("QA-Tester jhuma"); // Added logger
    	PropertyConfigurator.configure("Log4j.properties"); // Added logger
    	 
     }	 
    		
       
      // Loading Config.properties file steps
       
       public static void initialization() throws Throwable {
    	   
		   configProp = new Properties();
		FileInputStream configPropFile = new FileInputStream("config.properties");
		configProp.load(configPropFile);
	  // Loading Config.properties file is done
		
	     //configure browsers
	   String br = configProp.getProperty("browser");
		if(br.equals("firefox")) {
		ElementUtility.getDriver();
	System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxbrowser"));
	   driver = new FirefoxDriver();  // called upcasting

	}		
			
		else if(br.equals("chrome")){
	 System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromebrowser"));
	    driver = new ChromeDriver();// called upcasting
	    ElementUtility.getDriver();
	}	
		
		else if(br.equals("edge")) {
	  System.setProperty("webdriver.edge.driver", configProp.getProperty("edgebrowser"));
		 driver = new EdgeDriver();
		 ElementUtility.getDriver();
	}
	    
		 driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//declare as a global label(called dynamic)
		                                                                   //TimeUnit import from java
    		
     }
}