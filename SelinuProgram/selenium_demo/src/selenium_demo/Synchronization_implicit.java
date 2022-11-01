package selenium_demo;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization_implicit {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://www.unboundb2b.com/blog");
		driver.get("https://paytm.com/recharge");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
//	//WebElement a = driver.findElement(By.xpath("//input[contains(@id,'radio0')]"));
//
//			//if it is selcted then print true
//            boolean res = a.isSelected();
//              System.out.println(res);
////          
//         
//            
//                  if(res==true)
//                              {
//                    	  System.out.println("Test Script Passsed");
//                    	  
//                                   }
//                      else 
//                      {
//                    	  System.out.println("Test Script Failed");
//                      }
   //is Displayed used for to test refrence variable display on web page or  not 
//   
//              WebElement b = driver.findElement(By.xpath("//a[contains(@class,'wpwl')]"));
//             boolean res1 = b.isDisplayed();
//             System.out.println(res1);
             
             //isenable 
             WebElement c = driver.findElement(By.xpath("//input[contains(@id,'radio0')]"));
             boolean res3 = c.isEnabled();
             System.out.println(res3);
            
             driver.close();
	}
	
}
