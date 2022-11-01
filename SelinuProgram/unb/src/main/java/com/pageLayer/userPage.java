package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class userPage extends TestBase{
	public userPage() {
		PageFactory.initElements(driver, this);
	}
	//------------- Obj repo -----------------
	@FindBy(xpath="//button[@class='mat-icon-button mat-button-base']")
	private WebElement user_menu_btn;
	
	@FindBy(xpath="//li[@id='nav-item-social'][19]")
	private WebElement  bulkhard_bounce_check;
	
	
	@FindBy(xpath="//textarea[@id='exampleFormControlTextarea1']")
	private WebElement  bulkhard_bounce_txtbox;
	
	@FindBy(xpath="//button[@class='btn btn-primary text-center']")
	private WebElement check_MD5;
	

	//--------------Action methods------------ 
		public void clickOnUserMenuBtn() {
			user_menu_btn.click();
		}
		
		public void clickOnUserbulkhard_bounce_check() {
			bulkhard_bounce_check.click();
		}
		
		public void enterHardBouncetxt() {
			bulkhard_bounce_txtbox.sendKeys("sthokal@unboundconnect.com");
		}
		
		public void clickOncheckMD5() {
			check_MD5.click();
		}
}
