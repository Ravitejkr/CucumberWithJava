package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {
//	WebDriver driver = null;
//
//	@Given("Browser is opned for user")
//	public void browser_is_opned_for_user() {
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
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(2000);
//	}
//	
//	@And("User will click on login button")
//	public void clicks_on_login_button() throws InterruptedException {
//		driver.findElement(By.id("log-in")).click();
//		Thread.sleep(2000);
//	}
//
//	@Then("User is navigated to home page after the login")
//	public void user_is_navigated_to_home_page_after_the_login() throws InterruptedException {
//		driver.findElement(By.xpath("//td[@class='text-center']/a[contains(text(), 'Business')]"))
//			.isDisplayed();
//		Thread.sleep(2000);
//
//		driver.close();
//		driver.quit();
//	}
}
