package selenium_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTo implements Commanproperty {
	
	static WebDriver driver;
	public void chrome () {
		System.setProperty(chromekey, chromepath);
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/mynetwork/");
		driver.close();
		
		
		}
	public void firefox() {
		System.setProperty(firefoxkey, firefoxpath);
		driver = new FirefoxDriver();
		driver.get("https://github.com/mozilla/geckodriver/releases");
		driver.close();
	}
}