package PageFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage_PageFactory {
	@FindBy(xpath = "//td[@class='text-center']/a[contains(text(), 'Business')]")
	WebElement txt_verify;
	
	WebDriver driver;
	
	//constructor : can be used to pass the web driver
	public HomePage_PageFactory(WebDriver driver) {
		this.driver = driver; //recommended but if you want you can use different names as well
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLoginSuccessful() {
		txt_verify.isDisplayed();
	}
}
