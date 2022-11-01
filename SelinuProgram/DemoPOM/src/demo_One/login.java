package demo_One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	//Declaration
	private WebElement username;
	private WebElement password;
	private WebElement lgn;
	 WebDriver driver;
	 
	 public login(WebDriver driver)
	 {
		 this.driver = driver;
		 username = driver.findElement(By.xpath("//input[(@name='username')]"));
		 password = driver.findElement(By.xpath("//input[(@name='pwd')]"));
		 lgn = driver.findElement(By.xpath("//a[(@class='initial')]"));

	 }
	 public void sendUser() {
		 username.sendKeys("admin");
	 }
	 
	 public void sendPass()
	 {
		 password.sendKeys("manager"); 
	 }
	 
	 public void sendlogin()
	 {
		 lgn.click();
	 }
}
