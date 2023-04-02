package com.NextTechMeta.PageAction;

import org.testng.Assert;

import com.NextTechMeta.PageLocator.AccountPageLocator;

import Utility.Base_ParentClass;

public class AccountPageAction extends Base_ParentClass{

	AccountPageLocator accountPageLocator = new AccountPageLocator();
	
	public void Verifyusercanloginwithvalidcredential () throws Exception {
		Thread.sleep(5000);
		
	boolean verifyAccountProfile =	accountPageLocator.AccountProfile.isDisplayed();	
	Assert.assertTrue(verifyAccountProfile);	
		
	}
}
