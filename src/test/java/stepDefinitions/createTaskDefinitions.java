package stepDefinitions;

import java.util.Map;
import java.util.List;

import driverFactory.initiate_driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.landingPage;
import pages.loginPage;
import pages.newTaskPage;

public class createTaskDefinitions {
	initiate_driver init=new initiate_driver();
	
	loginPage loginpage=new loginPage(init.initdriver());
	landingPage landingpage;
	newTaskPage ntp;
	@Given("The user is already logged in")
	public void the_user_is_already_logged_in(DataTable dataTable) {
	  List<Map<String,String>> data=dataTable.asMaps();
	  String username=data.get(0).get("username");
	  String password=data.get(0).get("password");
	  loginpage.getLoginPage();
	  landingpage=loginpage.doLogin(username, password);
	  }
	@Given("user navigates to create new task page")
	public void navigate_to_create_new_task_page() {
	  ntp=landingpage.createNewTask();
	}
	@And("enter the {string} {string} and {string}")
	public void enter_the_and(String string, String string2, String string3) {
		ntp.enterTitle(string);
		ntp.ExtendDropDown(string2);
		ntp.completion(string3);
	}
	@Then("click the save button")
	public void click_the_save_button() {
	
	    ntp.clickSave();
	}

}
