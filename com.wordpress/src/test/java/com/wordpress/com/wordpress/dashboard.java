package com.wordpress.com.wordpress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.wordpress.pom.*;

import com.wordpress.pom.Pageobjects;

import Helper.Utill;



public class dashboard extends Baseclass{
	
	
	public static Pageobjects pom;
	
	
	@BeforeSuite
	public void setupm()
	{
		browsersetup();
		pom=new Pageobjects(driver);	
		System.out.println("done");
		loginapplication.login(pom);

	}
	
	@Test
	public static void verifytitle()
	{
		String afterlogin_title=driver.getTitle();
	   
		Assert.assertEquals(afterlogin_title,"Log In — WordPress.com");

	}
	
	@Test(dataProvider = "createpost")

	public static void create_post(String posttitle,String postcontent) throws InterruptedException
	{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		pom.Create_post.click();
		
		Thread.sleep(5000);
		pom.post_title.sendKeys(posttitle);
		
		driver.switchTo().frame(driver.findElement(By.id("tinymce-1_ifr")));
		
		System.out.println("Switched to the iframe");
		
		pom.content.sendKeys(postcontent);	    
	    
	    driver.switchTo().defaultContent();
         
	    Thread.sleep(3000);
	    
		pom.publish_btn.click();
		
		System.out.println("clicked");
		
		pom.publish_btn2.click();
		
		Utill.waittill_visibilityof(pom.success_message);
		
		String success_message = pom.success_message.getText();
		
		System.out.println("post is published and success message displayed is:    "+success_message);
		
		
		
	}
	

}
