package com.utility;

import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class utility extends TestBase {
	//Constructor
	public  utility()   {
		PageFactory.initElements( driver,this);
	}
	
//getUrl
public String getUrl() {
	String Current_url = driver.getCurrentUrl();
	return Current_url;
	}
}
