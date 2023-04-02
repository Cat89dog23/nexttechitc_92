package com.NextTechMeta.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_ParentClass;

public class AccountPageLocator extends Base_ParentClass{

public AccountPageLocator() {
		
		PageFactory.initElements(driver, this); //this keyword means everything is owned by it
		
	}	
@FindBy(id="nameofuser")
public  WebElement AccountProfile;

}
