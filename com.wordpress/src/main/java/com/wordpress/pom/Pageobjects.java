package com.wordpress.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Pageobjects  {
		
	 public Pageobjects(WebDriver driver) {
 
		 PageFactory.initElements(driver, this);	 
		 
	}
	
	 @FindBy(how=How.XPATH,using="//input[@id='usernameOrEmail']") 
	 @CacheLookup
	public WebElement username;
	
	 @FindBy(how=How.XPATH,using="//button[@class='button form-button is-primary']")
	 @CacheLookup
	public  WebElement continue_button;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	@CacheLookup
	public WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@class='button form-button is-primary']")
	@CacheLookup
	public WebElement signin_button;
	
	@FindBy(how=How.XPATH,using="//a[@class='masterbar__item masterbar__item-new']")
	@CacheLookup
	public WebElement Create_post;
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Title']")
	@CacheLookup
	public WebElement post_title;
	
	@FindBy(how=How.XPATH,using="//body[@id='tinymce']") 
	@CacheLookup
	public WebElement content;
	
	@FindBy(how=How.XPATH,using="//div[@class='editor-ground-control__publish-button']")
	@CacheLookup
	public WebElement publish_btn;
	
	
	@FindBy(how=How.XPATH,using="//button[@class='button is-primary']")
	@CacheLookup
	public WebElement publish_btn2;
	
	
	@FindBy(how=How.XPATH,using="//span[@class='notice__content']") 
	@CacheLookup 
	public WebElement success_message;
	
	
	

}
