package activePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActimeHomePage {
	//Declaration
	
	private WebElement	logo;
	private WebElement logout;
	WebDriver driver;
	
	//Initilization
	
	public ActimeHomePage(WebDriver driver) {
	
		this.driver = driver;
		logo = driver.findElement(By.xpath(" //img[(@height='61')]"));
		logout = driver.findElement(By.xpath("//a[(@id='logoutLink')]"));
	}
	
	//Usage
	
	public void CheckLogo() {
		boolean result = logo.isDisplayed();
		//want to print true if  logo is displayed
		if(result == true) {
			
			System.out.println("Logo is Visisble :"  + result);
		}
		else
		{
			System.out.println("Logo is not  Visisble"  + result);

		}
	
		}
	
	public void logoutButton(){
		logout.click();
	}
}
