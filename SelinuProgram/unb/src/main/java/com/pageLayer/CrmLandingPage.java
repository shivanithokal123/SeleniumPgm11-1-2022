package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class CrmLandingPage extends TestBase {
	public CrmLandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	//------------- Obj repo -----------------
	@FindBy(xpath="//button[text()=' Launch CRM']")
	private WebElement launch_crm;
	 
	//--------------Action methods------------ 
	public void clickOnLaunchCrmBtn() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("not working Launch Page");
		launch_crm.click();
		
	}
	

}
