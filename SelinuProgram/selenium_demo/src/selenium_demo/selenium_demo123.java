package selenium_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_demo123 {

	public static void main(String args[]) throws InterruptedException
	{
		//set key and path here
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver.exe");
		//object creation and open chrome 
		WebDriver driver=new ChromeDriver();
		//open URL
		driver.get("https://unboundconnect-team.monday.com/boards/2755716905");
		 driver.navigate().forward();
		 //stop for some time
		 Thread.sleep(1000);
		 //jump one url to other
		 driver.navigate().to("https://web.whatsapp.com/");
		driver.get("https://www.sonatawatches.in/shop/women-casual?cm_sp=headerl2-_-women-_-casualcollections");
		//regresh the site
        driver.navigate().refresh();
		//driver.getPageSource();
		//Maximize window
    	driver.manage().window().maximize();
//		//selinum 4 can minimize window but not in till 3 
//	          driver.manage().window().minimize();
		//closing browser automatically and "Particular tab close" 
		//driver.close();
		//closing browser automatically and  "all tab close"
//		driver.quit();
	          driver.navigate().back();
//		
	         driver.get("https://www.linkedin.com/mynetwork/");
	          //print in console tile 
	          System.out.println(driver.getTitle());	
	          System.out.println(driver.getCurrentUrl());
	          System.out.println(driver.getPageSource());
	       //  driver.getTitle("https://www.linkedin.com/mynetwork/");
	      
		
	}
	
}
