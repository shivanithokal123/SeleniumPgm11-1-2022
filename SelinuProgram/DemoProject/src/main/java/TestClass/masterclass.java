package TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMCLass.login;
import POMCLass.logout;

public class masterclass {
	
	public static void main(String args[]) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver106.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//full element load once (wrong querry)
		login obj1 = new login(driver);
		{
		obj1.validUser();
		obj1.validPwd();
		obj1.validlogin();
		}
		Thread.sleep(6000);
		
		logout obj = new logout(driver);
		
		{
			obj.validlogo();
			obj.validSignout();
		}
		
	}
	

}
