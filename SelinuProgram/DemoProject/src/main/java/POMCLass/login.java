package POMCLass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
           
		private WebElement un;
		private WebElement pwd;
		private WebElement lgn;
		WebDriver driver;
	
			public login(WebDriver d)
			{
				this.driver=d;
				un=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
				pwd=driver.findElement(By.xpath("//input[contains(@type,'password')]"));
				lgn=driver.findElement(By.xpath("//a[contains(@id,'loginButton')]"));
		

		
			}
	
		public void validUser()
		{
			un.sendKeys("admin");
		
		}
	
	
		public void validPwd() 
		{
		
			pwd.sendKeys("manager");
			
		}
	
		
		public void validlogin()
		{
			lgn.click();
			
		}
}
