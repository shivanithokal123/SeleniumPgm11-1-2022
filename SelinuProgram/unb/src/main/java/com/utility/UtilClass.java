package com.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class UtilClass extends TestBase {
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	static String path = "C:\\SelinuProgram\\unb\\screenshots\\";
	public static void takeScreenShot(String filename)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
//			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//		    LocalDateTime now = LocalDateTime.now();
//		    String dateandtime = dtf.format(now);
			
			File des = new File(path+filename+System.currentTimeMillis()+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}	
	}

}
