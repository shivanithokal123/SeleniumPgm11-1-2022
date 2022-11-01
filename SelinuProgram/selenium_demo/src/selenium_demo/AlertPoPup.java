package selenium_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPoPup {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver106.exe");
		 driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(4000);
		AlertPoPup obj1=new AlertPoPup();
//		obj1.simplealert();
//		obj1.confirmalert();
		//obj1.getText();
		obj1.sendkeys();
	}
		
//		public void simplealert() throws InterruptedException {
//			
//			driver.findElement(By.xpath("//button[contains(@id,'alertButton')]")).click();
//			Thread.sleep(1000);
//			//accept alert button on site 
//			driver.switchTo().alert().accept();
//		}
//		public void confirmalert() throws InterruptedException {
//			
//			driver.findElement(By.xpath("//button[contains(@id,'timerAlertButton')]")).click();
//			Thread.sleep(1000);
//			//accept alert button on site 
//			driver.switchTo().alert().dismiss();
//			
//		}

//		public void getText() throws InterruptedException {
//			
//			driver.findElement(By.xpath("//button[contains(@id,'alertButton')]")).click();
//			Thread.sleep(1000);
//			//accept text of alert and o/p in console 
//			Thread.sleep(1000);
//			String s=driver.switchTo().alert().getText();
//			
//			System.out.println(s);
//			driver.switchTo().alert().dismiss();
//		}
		public void sendkeys() throws InterruptedException {
			//driver.switchTo().defaultContent();
			JavascriptExecutor s=((JavascriptExecutor)driver);
			//s.executeScript("scrollBy(0,1200)");
			WebElement element=driver.findElement(By.xpath("//button[contains(@id,'promtButton')]"));
			//without scroll we give any advertise 0 location and eleiminate it and find x path of butttton 
			s.executeScript("arguments[0].click()", element);
			
			Thread.sleep(2000);
			//accept text of alert and o/p in console 
			Thread.sleep(2000);
		    driver.switchTo().alert().sendKeys("hi");
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
		}
	}

	
