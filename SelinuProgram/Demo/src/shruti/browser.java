package shruti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
	public class openchromebrowser {
		public static void main(String []args) 
		{
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			WebDriver s =new ChromeDriver();
			s.get("https://www.linkedin.com/");
			
			
		}

}
}
