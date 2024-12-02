package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("User is on login page")
	public void loginPage() {
		System.out.println("Inside Step - User is on login page");
	}

	@When("User enters username and password")
	public void enterLoginCrendentials() {
		System.out.println("Inside Step - User enters username and password");
	}

	@And("User clicks on login button")
	public void clickLoginButton() {
		System.out.println("Inside Step - User clicks on login button");
	}

	@Then("User is navigated to home page")
	public void homePage() {
		System.out.println("Inside Step - User is navigated to home page");
	}
}
