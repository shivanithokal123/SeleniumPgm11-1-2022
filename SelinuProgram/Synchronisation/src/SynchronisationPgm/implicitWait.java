package SynchronisationPgm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class implicitWait {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://www.unboundb2b.com/blog");
		driver.get("https://paytm.com/recharge");
		//Actions a = new Actions(driver);
		//WebElement  r = driver.findElement(By.xpath("//a[contains(@name,'link1')]"));
//		//single click
//		//r.click();
//		//double click
//		//a.doubleClick(r).perform();
//		//RightClick
//		a.contextClick(r).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
	WebElement b = driver.findElement(By.xpath("//input[contains(@id,'radio0')]"));
	
		//if it is selcted then print true 
           boolean res = b.isSelected();
            System.out.println(res);
          
            driver.close();
            
            

	} }
