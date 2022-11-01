package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.unboundb2b.com/");
		//using index iframe
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("firstname-f190bbb4-2ec1-457d-9a45-64caa2275032")).sendKeys("shruti")
		//using iframe name
		driver.switchTo().frame("hs-form-iframe-0");
		driver.findElement(By.id("firstname-f190bbb4-2ec1-457d-9a45-64caa2275032")).sendKeys("shruti");
		Thread.sleep(1000);

		//switch to parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("BLOG")).click();
		Thread.sleep(1000);
		//scroll up scroll down
		driver.switchTo().defaultContent();
		JavascriptExecutor s=((JavascriptExecutor)driver);
		s.executeScript("scrollBy(0,1200)");
		//scroll up 
		s.executeScript("scrollBy(0,-1200)");
		Thread.sleep(1000);
		//switch to new tab
		driver.navigate().to("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]")).click();
		//drop down date,month and year
		//using Index  (List )
		WebElement day =driver.findElement(By.xpath("//select[contains(@id,'day')]"));
		Select x=new Select(day);
		x.selectByIndex(2);
		//using Value use this with no 
		WebElement month =driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		Select m=new Select(month);
		m.selectByValue("8");
		//using Visible text
		WebElement Year =driver.findElement(By.xpath("//select[contains(@id,'year')]"));
		Select y =new Select(Year);
		y.selectByVisibleText("1997");
		
//		x.selectByValue("Aug");
//		x.selectByVisibleText("1997");
	}
}
