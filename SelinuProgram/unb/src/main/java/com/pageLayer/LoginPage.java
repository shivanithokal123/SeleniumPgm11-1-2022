package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class LoginPage extends TestBase {
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//------------- Obj repo -----------------
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[text()='login']")
	private WebElement login_btn;
	
	
	//--------------Action methods------------ 
	
	public void enteremailAddress() {
		email_txtbox.sendKeys("cpatra@unboundconnect.com");
	}
	
	public void enterpwd() {
		password_txtbox.sendKeys("cpatra");
	}
	
	public void clickOnlogin() {
		login_btn.click();
	}

}
