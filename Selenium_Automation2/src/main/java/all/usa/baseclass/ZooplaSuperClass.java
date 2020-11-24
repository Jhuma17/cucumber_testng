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

public class ZooplaSuperClass {

	 public static WebDriver driver;
     public static Logger logger;  //we import from apache logger
	  public static Properties prop; // we import from java util properties
       
	  public ZooplaSuperClass() {  //declare constractor for initialized logger
		  // Logger
		  logger = Logger.getLogger("QA-Testing"); //(string) Added logger
		  PropertyConfigurator.configure("log4j.properties");
		  
 }	  
	
	   // Loading Config.properties file steps
	   public static void initialization() throws Throwable {
	  
		  prop = new Properties();
		  FileInputStream br = new FileInputStream("config.properties");
		  prop.load(br);
		// Loading Config.properties file is done
		  
		  //configure browsers
		  String st = prop.getProperty("browser") ;
		  if(st.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver", prop.getProperty("chromebrowser")); 
		     driver = new ChromeDriver();
		  }
		   
		  else if(st.equals("firefox")) {
		 System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxbrowser"));  
		     driver = new FirefoxDriver();
		  }
		   
		  else if(st.equals("edge")) {
		 System.setProperty("webdriver.edge.driver", prop.getProperty("edgebrowser"));  
		      driver = new EdgeDriver();
		  }
		   
		 // System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 //driver = new ChromeDriver();   // called upcasting
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	  
	  
	}
}