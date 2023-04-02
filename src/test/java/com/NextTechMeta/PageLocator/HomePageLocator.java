package com.NextTechMeta.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_ParentClass;

public class HomePageLocator extends Base_ParentClass{

	
public HomePageLocator () {
	
	PageFactory.initElements(driver, this); //this keyword means everything is owned by it
	
	
}
@FindBy(id="login2")
public  WebElement LoginLink;

@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div/div/h4/a")
public  WebElement NokiaPhone;

@FindBy(xpath="/html/body/div[5]/div/div[2]/div[2]/div/a")
public  WebElement AddToCart;

@FindBy(xpath="/html/body/nav/div/div/ul/li[4]/a " )
public  WebElement CartLink;

@FindBy(id=" ")
public  WebElement Log;


}
