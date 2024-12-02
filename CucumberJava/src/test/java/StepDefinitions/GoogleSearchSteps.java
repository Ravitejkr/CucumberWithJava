package StepDefinitions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given ("Browser is opned")
	public void openBrowser() {
		System.out.println("Inside Step -- Browser is opned");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", 
				projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.manage().window().maximize();
	}
	
    @And ("User is on search page")
    public void searchPage() {
		System.out.println("Inside Step -- Browser is opned");
		
		driver.navigate().to("https://www.google.com/");
	}
    
    @When ("User enters a text in search box")
    public void search() throws InterruptedException {
		System.out.println("Inside Step -- Browser is opned");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		Thread.sleep(2000);
	}
    
    @And ("User presses enter key on keyboard")
    public void pressEnter() throws InterruptedException {
		System.out.println("Inside Step -- Browser is opned");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
	}
    
    @Then ("User is navigated to search results")
    public void searchResultsLoaded() {
		System.out.println("Inside Step -- Browser is opned");
		
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();
	}
    
}
