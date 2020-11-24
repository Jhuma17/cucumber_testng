package com.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import all.usa.baseclass.OutlineSuperClass;

public class ElementUtility extends OutlineSuperClass {
 
	public static void waitForElement(WebElement elem) {
     
		  WebDriverWait wait = new WebDriverWait(driver, 30);//WebDriverWait is a class
	 	  
		  wait.until(ExpectedConditions.elementToBeClickable(elem));// explicit wait
		  
	}

	public static String getScreenShot(WebDriver driver, String name) throws IOException {
		String date = new  SimpleDateFormat("MM.dd.yyyy-hh.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+ "/ScreenShots/" + name + date +".png";
		File obj = new File(destination);
		FileUtils.copyFile(source, obj);
		return destination;		
	}		
     
       //("user.dir")it means inside the project i need screentshot
       //("/ScreenShots/")this is my screenshot folder name
 	  //(.png screen shots extension)
     
     
      }

