package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techresearchonline.com/");
		Thread.sleep(3000);
		//accept popup of Site
		driver.findElement(By.xpath("(//button[contains(@text,Allow)])[5]")).click();
		Thread.sleep(3000);
		
		
	}
}
