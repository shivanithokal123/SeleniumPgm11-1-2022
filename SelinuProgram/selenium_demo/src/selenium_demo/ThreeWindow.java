package selenium_demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ThreeWindow {
	public static void main(String args[]) throws InterruptedException {
	System.getProperty("webdriver.chrome.driver", "C:\\Users\\Shivani\\Documents\\UNB-Per\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.unboundb2b.com/blog/email-marketing/b2b-marketing-automation-workflows/");

	String parent = driver.getWindowHandle();
	
	System.out.println(parent);
	JavascriptExecutor s=((JavascriptExecutor)driver);
	s.executeScript("scrollBy(1120,697)");
	//Navigate to other window 
	driver.findElement(By.xpath("//a[contains(text(), '25.1')]")).click();
	
      Set<String> e =driver.getWindowHandles();
       int t=e.size();
      System.out.println("Count of Window is" + t);
	  for(String child :e) {
		  if (!parent .equalsIgnoreCase(child)) {
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			JavascriptExecutor s1=((JavascriptExecutor)driver);
			s1.executeScript("scrollBy(0,2500)");
			driver.findElement(By.xpath("//a[contains(text(),'Forrester FeedbackNow™')]")).click();
			Thread.sleep(1000);
			
			
	}

	}
	}
}
