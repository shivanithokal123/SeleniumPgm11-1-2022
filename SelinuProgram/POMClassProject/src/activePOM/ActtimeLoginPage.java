package activePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActtimeLoginPage { 
	//Declaration
	private  WebElement un;
	private  WebElement pwd;
	private  WebElement login;
	 WebDriver driver;
	
	//Initialization
	 //want to use local value to Globally (This Consept)
	
	public ActtimeLoginPage( WebDriver driver)//constructor consept 
	{
		this.driver= driver;
		un = driver.findElement(By.xpath("//input[(@name='username')]"));
		pwd = driver.findElement(By.xpath("//input[(@name='pwd')]"));
		login = driver.findElement(By.xpath("//a[(@class='initial')]"));

				
	}
	
	//Usage
	
	public void UserName() {
		un.sendKeys("admin");
	}
	
	public void Password() {
		pwd.sendKeys("manager");
	}
	
	public void loginButton() {
		login.click();
	}
}
