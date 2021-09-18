package steps;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Loginpage;
import pages.TestBase;

public class LoginStepDefination extends TestBase {
	Loginpage Loginpage;
	
	//Given User is on techfios login page
	
	@BeforeMethod
	public void setup() {
		initDriver ();
		Loginpage = PageFactory.initElements(driver, Loginpage.class);
	}
	
	@Given ("^User is on techfios login page$")
	
	public void User_is_on_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		//Loginpage=PageFactory.initElements(driver, Loginpage.c());
		
	}
	
	//When User enters username as "demo@techfios.com"
	
	@When ("^User enters username as \"([^\"]*)\"$")
	public void User_enters_username_as(String username) throws Throwable{
		
	}
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^User should be on Dashboard page$")
	public void user_should_be_on_Dashboard_page() throws Throwable {
		Assert.assertEquals("Dashboard- iBilling", Loginpage.getPageTitle());
		takeScreenShot(driver);
	   
	}
	
	@After
		public void tearDown() {
		driver.close();
		driver.quit();
	}


}
