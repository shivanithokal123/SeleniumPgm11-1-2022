package selenium_demo;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimention {
	public static void main(String args[])
	{
		System.getProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivani\\\\Documents\\\\UNB-Per\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.unboundb2b.com/");
		//Checked Dimension on iPhad Air 
		Dimension d =new Dimension(820,1180);
		driver.manage().window().setSize(d);
		Dimension a = driver.manage().window().getSize();
		System.out.println(a);
		//Point
		Point p = new Point(100,200);
		driver.manage().window().setPosition(p);
		
		
	}

}