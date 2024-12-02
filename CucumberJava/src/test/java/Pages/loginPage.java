package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	//make identifiers private so as it can be used within class only and not outside this class
	//identifier for username and password
	private By txt_username_login = By.id("username");
	private By txt_password_login = By.id("password");

	//identifier for login button
	private By btn_login = By.id("log-in");
	
	private By verify = By.xpath("//td[@class='text-center']/a[contains(text(), 'Business')]");
	
	//Contructor : to ensure session is maintained and same driver is used throughout
	public loginPage(WebDriver driver) {
		this.driver = driver;
		if(!driver.getTitle().equals("ACME Demo App by Applitools")) {
			throw new IllegalStateException("This is not a valid login page. The current page is "+
					driver.getTitle()+"The Url of the current page is "+driver.getCurrentUrl());
		}
	}
	
	public void enterUser(String username) {
		driver.findElement(txt_username_login).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password_login).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void verifyLogin() {
		driver.findElement(verify).isDisplayed();
	}

	//as per feature file we have created automic methods therefore this method as of now is not required
//	public void validUserLogin(String username, String password) {
//	  driver.findElement(txt_username_login).sendKeys(username);
//	  driver.findElement(txt_password_login).sendKeys(password);
//	  driver.findElement(btn_login).click();  
//	}
	 
}
