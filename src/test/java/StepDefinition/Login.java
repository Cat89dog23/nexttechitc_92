package StepDefinition;

import com.NextTechMeta.PageAction.AccountPageAction;
import com.NextTechMeta.PageAction.HomePageAction;
import com.NextTechMeta.PageAction.LogInPageAction;

import Utility.Base_ParentClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login extends Base_ParentClass{
	HomePageAction homePageAction = new HomePageAction();
	LogInPageAction logInPageAction = new LogInPageAction();
	AccountPageAction accountPageAction = new AccountPageAction();
	
	@Then("^Click Login Link$")
	public void click_Login_Link() throws Throwable {
		homePageAction.ClickLoginLink();
	}

	@Then("^Enter Username and Enter Pasword and Click Login button$")
	public void enter_Username_and_Enter_Pasword_and_Click_Login_button() throws Throwable {
		logInPageAction.metaLoginCard(MetaProperties.getProperty("UserName1"),MetaProperties.getProperty("Password1"));
	}

	@Then("^Verify user can login with valid credential$")
	public void verify_user_can_login_with_valid_credential() throws Throwable {
		accountPageAction.Verifyusercanloginwithvalidcredential(); 
	}

}
