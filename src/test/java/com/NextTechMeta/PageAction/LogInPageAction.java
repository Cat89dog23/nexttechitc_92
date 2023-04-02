package com.NextTechMeta.PageAction;

import com.NextTechMeta.PageLocator.LogInPageLocator;

import Utility.Base_ParentClass;

public class LogInPageAction extends Base_ParentClass{

	LogInPageLocator logInPageLocator = new LogInPageLocator ();
	
	
	
public void metaLoginCard(String u, String p) {
	logInPageLocator.UserName.sendKeys(u);
	logInPageLocator.Password.sendKeys(p);
	logInPageLocator.LoginButton.click();
}
	
	
	
}
