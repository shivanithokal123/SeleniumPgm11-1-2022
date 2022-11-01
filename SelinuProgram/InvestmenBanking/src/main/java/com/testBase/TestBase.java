package com.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static  WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		String var="edge";
		if(var.equalsIgnoreCase("Chrome"))
		{
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(var.equalsIgnoreCase("firefox"))
		{
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if(var.equalsIgnoreCase("edge"))
		{
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		
		else {
			System.out.println("We just have three browser ,if you want onther plz install it ");
		}
		
		 driver.get("https://apps.dalalstreet.ai/login");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		 
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
