package com.wordpress.com.wordpress;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.wordpress.pom.Pageobjects;
import com.wordpress.com.wordpress.dashboard;

public class loginapplication extends Baseclass {
	
	public static Pageobjects  pom;

	dashboard dashboard;
	
	@BeforeSuite
	public void setupm()
	{
		browsersetup();
		pom=new Pageobjects(driver);	
	}
	
	@Test
	public static void login(Pageobjects pom)
	{
       pom.username.sendKeys("divyangjani619@gmail.com");	
       pom.continue_button.click();
       pom.password.sendKeys("Dixit1234@");
       pom.signin_button.click();
       
       
       
	}

}
