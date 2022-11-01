package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class loginPage extends TestBase{
	public loginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//----create obj -----
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwd_txtbox;
	
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	private WebElement login_btn;
	
	//---obj repository
	public void enterEmailAdress() {
		email_txtbox.sendKeys("amarwaghmare573@gmail.com");
	}
	public void enterPassword() {
		pwd_txtbox.sendKeys("Test@1234");
	}
	public void clcikOnLoginBtn() {
		login_btn.click();
	}
	
}
