package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.loginPage;
import com.testBase.TestBase;
import com.utility.utility;




public class LoginPageTest extends TestBase {
	String expected_url="https://apps.dalalstreet.ai/dashboard";

	@Test
	public void verifyLoginTest() throws InterruptedException {
		loginPage login = new loginPage();
		utility obj = new utility();
		login.enterEmailAdress();
		login.enterPassword();
		login.clcikOnLoginBtn();
		Thread.sleep(3000);
		String actual_url =obj.getUrl();
		Assert.assertEquals(actual_url, expected_url);
		
	}
	

}
