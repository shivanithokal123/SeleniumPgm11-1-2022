package annotation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMCLass.login;
import POMCLass.logout;

public class Testngannotation {
	WebDriver driver;
	login lgn;
	logout lgt;
	
	Testngannotation(WebDriver d){
		
	}
	
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver106.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		System.out.println("Opening Browser");
		

		driver.manage().window().maximize();
		lgn=new login(driver);
		System.out.println("Before class login class called");

		lgt=new logout(driver);
		System.out.println("Before class finished");

	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Closing Browser"+driver);
		driver.quit();
		System.out.println("Closing Browser");
	}
	
	@BeforeMethod
	public void loginActivities() {
		lgn.validUser();
		lgn.validPwd();
	    lgn.validlogin();
	    System.out.println("Valid Credentials");
	}
	@Test
	public void verifylogo() {
		lgt.validlogo();
		System.out.println("Test Succesfull");
		
	}
	@AfterMethod
	public void logoutActivities() {
		System.out.println("logout Browser calling"+driver);
		lgt.validSignout();
		System.out.println(" logout Succesfully");
		
	}
	
}
