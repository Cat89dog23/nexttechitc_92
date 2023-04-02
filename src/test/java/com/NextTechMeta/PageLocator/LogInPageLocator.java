package com.NextTechMeta.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_ParentClass;

public class LogInPageLocator extends Base_ParentClass{

	
	public LogInPageLocator() {
		
		PageFactory.initElements(driver, this); //this keyword means everything is owned by it
		
	}	
	
	@FindBy(id="loginusername")
	public  WebElement UserName;	
	
	@FindBy(id="loginpassword")
	public  WebElement Password;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]" ) 
	public  WebElement LoginButton;
	
	
	
}
