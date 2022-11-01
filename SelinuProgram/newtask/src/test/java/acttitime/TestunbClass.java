package acttitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class TestunbClass {

	WebDriver driver;
	signIn_Page sIn;
	Home_Page hP;
	
	@Test(priority = 1)
	public void Test1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver106.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");

		driver.manage().window().maximize();
		sIn = new signIn_Page(driver);
		hP = new Home_Page(driver);
		
	}
	@Test (priority = 2)
	public void Test2() {
		sIn.setActitimeUn();
		sIn.setActitimePwd();
		sIn.verifyLoginButton();
	}
	
	@Test(priority = 3)
	public void selectnewtask() throws InterruptedException
	{
		hP.newClass();
		Thread.sleep(3000);
	}
	@Test(priority = 4)
	public void selectNewCoustmer() {
		try {
			hP.newcoustmer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@Test(priority = 5)
//	public void Test3() {
//		hP.verifyActitimeLogout();
//	}
	
	}

