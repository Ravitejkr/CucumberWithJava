package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import PageFactory.HomePage_PageFactory;
import PageFactory.LoginPage_PageFactory;
import io.cucumber.java.en.*;

public class LoginDemoSteps_PageFactory {
	WebDriver driver = null;
	LoginPage_PageFactory login;
	HomePage_PageFactory verifyTxt;

	@Given("Browser is opned for user")
	public void browser_is_opned_for_user() {
		System.out.println("_____________Page Factory_____________");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is " + projectPath);

		System.setProperty("webdriver.chrome.driver", 
				projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

		driver.manage().window().maximize();
	}

	@And("User is on login page of the website")
	public void user_is_on_login_page_of_the_website() {
		driver.navigate().to("https://demo.applitools.com/");
	}

	@When("^User enters (.*) and (.*) in login page$")
	public void user_enters_username_password(String username, String password) 
			throws InterruptedException {
		login = new LoginPage_PageFactory(driver);
		
		login.enterUserName(username);
		login.enterPassword(password);
		Thread.sleep(2000);
	}
	
	@And("User will click on login button")
	public void clicks_on_login_button() throws InterruptedException {
		login.clickOnLoginBtn();
		Thread.sleep(2000);
	}

	@Then("User is navigated to home page after the login")
	public void user_is_navigated_to_home_page_after_the_login() throws InterruptedException {
		verifyTxt = new HomePage_PageFactory(driver);
		
		verifyTxt.verifyLoginSuccessful();
		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}
}
