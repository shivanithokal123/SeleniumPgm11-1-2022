package activeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import activePOM.ActimeHomePage;
import activePOM.ActtimeLoginPage;

public class Testclass {
	public static  void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver106.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost/login.do");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ActtimeLoginPage Login =new ActtimeLoginPage(driver);
		Login.UserName();
		Login.Password();
		Login.loginButton();

		Thread.sleep(6000);


		ActimeHomePage Logoutt = new ActimeHomePage(driver);
		Logoutt.CheckLogo();
		Logoutt.logoutButton();
		driver.close();

	}

}
