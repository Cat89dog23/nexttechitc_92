package com.NextTechMeta.PageAction;

import org.testng.Assert;

import com.NextTechMeta.PageLocator.CartPageLocator;

import Utility.Base_ParentClass;

public class CartPageAction extends Base_ParentClass{

	CartPageLocator cartPageLocator = new CartPageLocator();
	
	
	public void Verifyitemaddedincart () throws Exception {
		Thread.sleep(5000);
		
	boolean Verifycart=	cartPageLocator.VerifyCart.isDisplayed();
		Assert.assertTrue(Verifycart);
	}
	
	
}
