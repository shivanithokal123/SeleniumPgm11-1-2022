package annotation;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(annotation.ListnerDemoITest.class)
public class keywordTestNG {

	@Test(priority = 3,invocationCount=3)
	// we cant take -5 no 
	//we can set priority which test we want to execute first if we cant give priority it will run fir priority then again other test case  run according to alphabetically 
	//if we want any test repeat 3 time we use invocationCount
	//skip any Test enabled=false/true
	public void abc()
	{
		System.out.println("abc");
	}
	@Test(priority = 2, enabled=false)//skip
	public void cde()
	{
		System.out.println("cde");
	}
	@Test(priority = 1)
	public void afirefox()
	{
		//Assert.fail(); to test we can fail this test using assert and will se if test is depend on any other it will also stop work
		Assert.fail();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver106.exe"); 	
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		System.out.println("Opening Browser");
		
	}
	@Test(dependsOnMethods= {"afirefox"})
	public void ghi()
	{
		System.out.println(" ghi");
	}
}
