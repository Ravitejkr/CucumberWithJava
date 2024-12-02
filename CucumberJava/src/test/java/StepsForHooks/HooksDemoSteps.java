package StepsForHooks;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	WebDriver driver = null;

	@Before(value = "@smoke", order = 1)
	public void browserSetup() {
		System.out.println("_________________Inside browserSetup method_________________");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.msedge.driver", projectPath+
				"/src/test/resources/drivers/msedgedriver.exe");

		driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.manage().window().maximize();
	}
	
	@Before(order=0)
	public void setup() {
		System.out.println("---------***Inside setup method***--------- \n");
	}
	
	@After(order=1)
	public void teardown() {
		System.out.println("___________________Inside teardown method___________________");
		driver.close();
		driver.quit();
	}
	
	@After(order=2)
	public void teardown2() {
		System.out.println("---------***Inside teardown2 method***--------- \n");
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("---------Inside beforeSteps method---------");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("---------Inside afterSteps method---------");
	}
	
	@Given("user is on login page of the product")
	public void user_is_on_login_page_of_the_product() {
		driver.navigate().to("https://demo.applitools.com/");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("Ravitej Kaur");
		driver.findElement(By.id("password")).sendKeys("1234");
		Thread.sleep(2000);
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() throws InterruptedException {
		driver.findElement(By.id("log-in")).click();
		Thread.sleep(2000);
	}

	@Then("home page loads")
	public void home_page_loads() throws InterruptedException {
		driver.findElement(By.xpath("//td[@class='cell-with-media']/span[contains(text(), 'Starbucks coffee')]")).isDisplayed();
		Thread.sleep(2000);
	}

}
