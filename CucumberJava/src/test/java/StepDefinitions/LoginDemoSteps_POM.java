package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.loginPage;
import io.cucumber.java.en.*;

public class LoginDemoSteps_POM {
//	WebDriver driver = null;
//	loginPage login;
//	
//	@Given("Browser is opned for user")
//	public void browser_is_opned_for_user() {
//		System.out.println("___________Inside LoginDemoSteps_POM________________");
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project Path is " + projectPath);
//
//		System.setProperty("webdriver.chrome.driver", 
//				projectPath + "/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//
//		driver.manage().window().maximize();
//	}
//
//	@And("User is on login page of the website")
//	public void user_is_on_login_page_of_the_website() {
//		driver.navigate().to("https://demo.applitools.com/");
//	}
//
//	@When("^User enters (.*) and (.*) in login page$")
//	public void user_enters_username_password_and_clicks_on_login_button(String username, String password) 
//			throws InterruptedException {
//		login = new loginPage(driver);
//		
//		login.enterUser(username);
//		login.enterPassword(password);
//		Thread.sleep(2000);
//	}
//	
//	@And("User will click on login button")
//	public void clicks_on_login_button() throws InterruptedException {
//		login.clickLogin();
//		Thread.sleep(2000);
//	}
//
//	@Then("User is navigated to home page after the login")
//	public void user_is_navigated_to_home_page_after_the_login() throws InterruptedException {
//		login.verifyLogin();
//		Thread.sleep(2000);
//
//		driver.close();
//		driver.quit();
//	}
}
