package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
	
		BrowserUtil5 brUtil =  new BrowserUtil5();
		WebDriver driver = brUtil.initDriver("chrome");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil6 ele = new ElementUtil6(driver);
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ele.doSendKeys(email, "rajesh@test.com");
		ele.doSendKeys(password, "rajesh@123");
		
		By registerLink = By.linkText("Register");
		By agreeCheck = By.name("agree");
		
		ele.doClick(registerLink);
		ele.doClick(agreeCheck);

	}

}
