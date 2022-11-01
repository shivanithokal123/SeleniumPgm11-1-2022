package POMCLass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logout {
	private WebElement 	logo;
	private WebElement Signout;
	WebDriver driver;
	
		public  logout (WebDriver driver) {
			this.driver=driver;
		}
		
		public void validlogo() 
		{
			
			logo=driver.findElement(By.xpath("//img[contains(@src,'default-logo.png')]"));
			Signout = driver.findElement(By.xpath("//a[contains(@id,'logoutLink')]"));
			
			boolean resp = logo.isDisplayed();
			
			if(resp == true)
			{
				System.out.println("logo is displayed");
			}
			else
			{
				System.out.println("logo is not displayed");
				 
			}
		}
		
		public void validSignout()
		{
			System.out.println("logout Browser calling"+driver);
			Signout.click();
		}
}
