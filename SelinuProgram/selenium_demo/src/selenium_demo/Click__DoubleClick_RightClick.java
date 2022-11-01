package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click__DoubleClick_RightClick {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver106.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://seleniumpractise.blogspot.com/search?q=click");
		Actions a = new Actions(driver);
		WebElement  r = driver.findElement(By.xpath("//a[contains(@name,'link1')]"));
		//single click
		r.click();
		//double click
		//a.doubleClick(r).perform();
		//RightClick
		//a.contextClick(r).perform();
		
	}											

}
