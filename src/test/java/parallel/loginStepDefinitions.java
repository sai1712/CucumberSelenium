package parallel;

import driverFactory.initiate_driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.loginPage;

public class loginStepDefinitions {
	private initiate_driver initiate=new initiate_driver();


	loginPage loginpage=new loginPage(initiate.initdriver());
	@Given("the user is navigated to the URL")
	public void the_user_is_navigated_to_the_url() {
	    loginpage.getLoginPage();
	}
	@Then("enters the {string} and {string}")
	public void enters_the_and(String string, String string2) {
		loginpage.enterUsername(string);
		loginpage.enterPassword(string2);
	  	}
	@Then("clicks the login button")
	public void clicks_the_login_button() {
	   loginpage.clickLogin();
	}

}
