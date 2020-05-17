package com.wordpress.com.wordpress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;

import com.listners.Listner;

import io.github.bonigarcia.wdm.WebDriverManager;



@Listeners(com.listners.Listner.class)

public class Baseclass{


	public static WebDriver driver;
	
	public static EventFiringWebDriver e_driver;
		
	public static Listner listner;
	
		public static void browsersetup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		listner = new Listner();
		
		e_driver = new EventFiringWebDriver(driver);
		e_driver.register(listner);	
	
	    e_driver.get("https://wordpress.com/log-in");	
		e_driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		e_driver.manage().window().maximize();
	}

	@AfterSuite

	public void closebrowser()
	{
		e_driver.close();
	}




}
