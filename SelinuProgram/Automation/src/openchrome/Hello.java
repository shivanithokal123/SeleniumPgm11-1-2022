package openchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://unboundconnect-team.monday.com/boards/2755716905");
	}

}
 	