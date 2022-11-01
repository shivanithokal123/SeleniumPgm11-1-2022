package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String args[])  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver106.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		//Using Class 
//		driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt")).sendKeys("xyz@gmail.com");
		//Using  Name
		//driver.findElement(By.name("email")).sendKeys("xyz1123");
		//driver.findElement(By.tagName("input")).sendKeys("shruti@gmail.com");
		//Using Link 
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//Submit Button
		//driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
		//we can use half link name 
			//	driver.findElement(By.partialLinkText("Pri")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shivani@gmail.com");

	}

}
