package PageFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage_PageFactory {
	@FindBy(id ="username")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(id ="password")
	WebElement txt_password;
	
	@FindBy(id ="log-in")
	WebElement btn_login;
	
	WebDriver driver;
	
	//constructor : can be used to pass the web driver
	public LoginPage_PageFactory(WebDriver driver) {
		this.driver = driver; //recommended but if you want you can use different names as well
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		btn_login.click();
	}
}
