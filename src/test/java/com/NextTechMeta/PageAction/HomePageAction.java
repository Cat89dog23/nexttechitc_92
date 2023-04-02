package com.NextTechMeta.PageAction;

import com.NextTechMeta.PageLocator.HomePageLocator;

import Utility.Base_ParentClass;

public class HomePageAction extends Base_ParentClass{

	HomePageLocator homePageLocator = new HomePageLocator();
	
	
	public void ClickLoginLink () throws Exception {
		homePageLocator.LoginLink.click();	
		Thread.sleep(5000);
	}
	
	public void clickNokialumia () {
		homePageLocator.NokiaPhone.click();
		
		
	}
	
	public void Clickaddtocart () throws Exception {
		homePageLocator.AddToCart.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	}
	
	public void Clickclickcart () {
		homePageLocator.CartLink.click();
	}
	
	
			
}
