package annotation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerDemoITest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Start ");//senario related
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed " + result);

		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver106.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");

		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path ="C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file.png";
      File destination = new File(path);
		
		try {
			FileHandler.copy(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	
		//System.out.println("TestFailed " + result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped" + result);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failure ");//je mhiti nhi te sodun dyach 
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Start for class" + context );//class realed
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finish for class" + context );
		
	}
	 

}
