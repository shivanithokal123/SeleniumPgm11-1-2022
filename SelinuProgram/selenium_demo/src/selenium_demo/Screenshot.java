package selenium_demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver106.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.unboundb2b.com/");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path ="C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file.png";
      File destination = new File(path);
		
		FileHandler.copy(src, destination);
	}
}
