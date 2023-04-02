package com.NextTechMeta.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_ParentClass;

public class CartPageLocator extends Base_ParentClass{
	
	public CartPageLocator () {
		
		PageFactory.initElements(driver, this); //this keyword means everything is owned by it
		
		
	}
		
	@FindBy(xpath="//td[text()=  'Nokia lumia 1520' ]")
	public  WebElement VerifyCart;
}
