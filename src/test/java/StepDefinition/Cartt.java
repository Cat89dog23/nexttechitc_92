package StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.NextTechMeta.PageAction.AccountPageAction;
import com.NextTechMeta.PageAction.CartPageAction;
import com.NextTechMeta.PageAction.HomePageAction;
import com.NextTechMeta.PageAction.LogInPageAction;

import Utility.Base_ParentClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Cartt extends Base_ParentClass{
	
	HomePageAction homePageAction = new HomePageAction();
	LogInPageAction logInPageAction = new LogInPageAction();
	CartPageAction cartPageAction = new CartPageAction();
	
	@Given("^MetaLaunch \"([^\"]*)\"$")
	public void metalaunch(String URL) throws Throwable {
		driver.get(URL);
	}
	@Then("^click Nokia lumia$")
	public void click_Nokia_lumia() throws Throwable {
		homePageAction.clickNokialumia();
	}

	@Then("^Click add to cart$")
	public void click_add_to_cart() throws Throwable {
		homePageAction.Clickaddtocart();
	}

	@Then("^Click click cart$")
	public void click_click_cart() throws Throwable {
		homePageAction.Clickclickcart();
	}

	@Then("^Verify item added in cart$")
	public void verify_item_added_in_cart() throws Throwable {
		cartPageAction.Verifyitemaddedincart();
	}

	
}
