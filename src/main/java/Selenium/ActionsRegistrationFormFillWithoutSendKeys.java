package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsRegistrationFormFillWithoutSendKeys {

	
	//Suppose user wants to sendkeys only once but need to fill the registration form, We should 
	// use tab sequence (accessibility testing)
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act = new Actions(driver);
		
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		
Action myRegForm = act.sendKeys(firstname, "rajesh Kumar")
					.pause(500)
					.sendKeys(Keys.TAB)
					.sendKeys("Heggade")
					.pause(500)
					.sendKeys(Keys.TAB)
					.sendKeys("rajesh1@gmail.com")
					.pause(500)
					.sendKeys(Keys.TAB)
					.sendKeys("9876543210")
					.pause(500)
					.sendKeys(Keys.TAB)
					.sendKeys("test@123")
					.pause(500)
					.sendKeys(Keys.TAB)
					.sendKeys("test@123")
					.pause(500)
					.sendKeys(Keys.TAB)
					.pause(500)
					.sendKeys(Keys.TAB)
					.pause(500)
					.sendKeys(Keys.TAB)
					.pause(500)
					.sendKeys(Keys.SPACE)
					.pause(500)
					.sendKeys(Keys.TAB)
					.pause(500)
					.sendKeys(Keys.ENTER)
						.build();

	//myRegForm.perform();
		
	performAction(myRegForm);

	}

	
	
	public static void performAction(Action action) {
		action.perform();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
