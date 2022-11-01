package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelinumLocators {
		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//delete all cookies on site which is saved id pass 
			driver.manage().deleteAllCookies();
			driver.get("https://www.facebook.com/login/");
		
		//using class - using single class works , multiple causes issue
		//password field
		//driver.findElement(By.className("_9npi")).sendKeys("sthokal");
		
		//username field
		//driver.findElement(By.className("_55r1")).sendKeys("sthokal1232");
		
		//using name
		//driver.findElement(By.name("email")).sendKeys("sthokal123@gmail.com");
		
		//using id
		//driver.findElement(By.id("email")).sendKeys("sthokal123@gmail.com");
		
		//using tagName - if page has multiple input - how it acts ?
		//--driver.findElement(By.tagName("input")).sendKeys("sthokal123@gmail.com");
		
		//using partialLinkText
		//driver.findElement(By.partialLinkText("for")).click();
				
		//using linkText
		//driver.findElement(By.linkText("Sign Up")).click();

		
		//usign xpath absolute
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div/div/input")).sendKeys("demo text");		

		//usign xpath relative - attribute
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("demo text");
		//using xpath relative - text 
		//driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		//if duplicate input tag by index
		//driver.findElement(By.xpath("//input[2]")).sendKeys("demo text");


		//usign xpath relative contains - attribute - add data to first occurrence of attribute containing that value
		driver.findElement(By.xpath("//input[contains(@name,'emai')]")).sendKeys("demo text");
		driver.findElement(By.xpath("//input[contains(@id,'pa')]")).sendKeys("demo text");

		//usign xpath relative contains - text function - search data to first occurrence of attribute containing that value 
		//driver.findElement(By.xpath("//a[contains(text(),'Gro')]")).click();
		
		//driver.findElement(By.xpath("//input[contains(@id,'as')]")).sendKeys("demo text");

		
				

	}

}
