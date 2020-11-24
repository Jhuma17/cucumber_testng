import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit synchronization
		
		// We can handle dropdown by (using Select class) 
		/* WebElement element = driver.findElement(By.id("searchLanguage"));
		  Select se = new Select(element); //Select is a java class
		//se.selectByValue("ar"); 
		//se.selectByIndex(0);
		//se.selectByVisibleText("العربية");
		       */
		
	    // Help with List interface we can Count all the value
	/*List <WebElement> list = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
	    int count = list.size();
	    System.out.println("Total language : "+count); */
	    
		//We can print all the value help with (Options)[without dropdown we cant get options]
		/* WebElement element = driver.findElement(By.id("searchLanguage"));
		  Select se = new Select(element);
		  List <WebElement> list = se.getOptions();//option class
		  for(int i =0; i<list.size();i++) {
			  System.out.println(list.get(i).getText());
		} */
		
		//Help with (getText)/(getAttribute)method we can find out specific text(dynamic)
 /* List <WebElement> list = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));//here import (By) from selenium  
		 for (int i = 0; i<list.size(); i++) {
			 if (list.get(i).getText().equals("Italiano")) {
		System.out.println("Selected number : "+i+" language :: "+list.get(i).getAttribute("text"));//here (i) is a no
				list.get(i).click();
				  break;
	}*/
	
				
		List<WebElement> list =  driver.findElements(By.xpath("//*[@class='other-project-link']"));
		    System.out.println("Total webelement link count num : "+list.size());
				
			  
		     for(int i=0; i<list.size();i++) {
					if(i>4) {
					System.out.println(" Selected element number : " +i+"Name of the link : "+list.get(i).getAttribute("text"));
					list.get(i).click();
					break;
					
			}}

		   /*  Actions action = new Actions(driver);
		 	WebElement mousHover =driver.findElement(By.id("nav-link-accountList"));
		 	action.moveToElement(mousHover);//.build().perform();
		 	action.click().build().perform();   */
	
	
		     WebElement obj = driver.findElement(By.id("searchInput"));
		 	obj.sendKeys("Bangladesh");
		 	obj.sendKeys(Keys.ENTER);
	
	
	
	
	   }}
