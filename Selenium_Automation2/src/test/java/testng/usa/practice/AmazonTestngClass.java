package testng.usa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestngClass {

       WebDriver driver;

      @BeforeTest
      public void test() {
    System. setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
   	   	 driver= new ChromeDriver();

   	   	 driver.get("https://www.amazon.com/");
   		 driver.manage().window().maximize();
   		System.out.println("I am running before test");
      
    }

       @Test
       public void finalTest1() {

    	 driver.findElement(By.xpath("(//*[text()='Hello, Sign in'])[1]")).click();
    	 driver.findElement(By.id("ap_email")).sendKeys("jhumasadia@icloud.com");
    	 driver.findElement(By.id("continue")).click(); 
    	 driver.findElement(By.id("ap_password")).sendKeys("Tuktuki2712");
    	 driver.findElement(By.id("signInSubmit")).click();
    	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     }

       @Test
      public void finalTest2() {
          
    	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
    	 driver.findElement(By.id("nav-search-submit-text")).click();
    	 //driver.findElement(By.partialLinkText("https://m.media-amazon.com/images/I/810DvHOZ9nL._AC_UY218_.jpg")).click();
   driver.findElement(By.xpath("//span[text()='New Apple iPhone SE (64GB, (Product) RED) [Locked] + Carrier Subscription']")).click();
    	 driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']")).click();
    	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

        @Test
        public void finalTest3() {
       
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-text")).click();
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
        driver.findElement(By.xpath("//div[@class='a-section a-spacing-small maple-banner']")).click();
   	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
    }   
       @AfterTest
        public void endTest() {

        	 System.out.println(driver.getTitle());
             driver.quit();
            
           System.out.println("I am running after test");


}}
