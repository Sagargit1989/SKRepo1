package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	@Given("I  have login page")
	public void i_have_login_page() {
	System.out.println("I am on Login page");
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String pass) {
	  System.out.println("I entered "+username+" and "+pass+"");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		System.out.println("Login button got clicked successfully");
	}

	@Then("Home Page should be displayed")
	public void home_page_should_be_displayed() {
      System.out.println("Home page displayed");
	}
}
