package parallel;

import driverFactory.initiate_driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.landingPage;
import pages.newContactPage;

public class newContactDefinitions {
	initiate_driver initiate=new initiate_driver();
	landingPage landingpage=new landingPage(initiate.getDriver());
	newContactPage ncp;
	@Given("user navigates to the create new contact page")
	public void navigates_to_the_create_new_contact_page() {
	    ncp=landingpage.createnewContact();
	}
	@And("enters the title {string} firstname {string} and lastname {string}")
	public void enters_the_title_firstname_and_lastname_hrithik(String string, String string2, String string3) {
	    ncp.enterTitle(string);
	    ncp.enterFirstName(string2);
	    ncp.enterLastName(string3);
	}
	@Then("clicks the save button")
	public void clicks_the_save_button() {
	   ncp.clickSave();
	}
}
