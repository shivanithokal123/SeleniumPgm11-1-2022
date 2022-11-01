package com.testLayer;

import org.testng.annotations.Test;

import com.pageLayer.CrmLandingPage;
import com.pageLayer.LoginPage;
import com.pageLayer.userPage;
import com.testBase.TestBase;

public class LoginPagesTest extends TestBase {
	@Test
	public void verifyTestLogin() throws InterruptedException {
		LoginPage logIn = new LoginPage();
		logIn.enteremailAddress();
		logIn.enterpwd();
		logIn.clickOnlogin();
		Thread.sleep(3000);
		CrmLandingPage CLP = new CrmLandingPage();
		CLP.clickOnLaunchCrmBtn();
		userPage UP = new userPage();
		UP.clickOnUserMenuBtn();
		UP.clickOnUserbulkhard_bounce_check();
		UP.enterHardBouncetxt();
		UP.clickOncheckMD5();
        
	}

}
