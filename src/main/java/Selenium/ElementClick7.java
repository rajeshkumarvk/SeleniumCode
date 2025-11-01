package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick7 {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
	
	//create a webelement + actions(click_ radio button, image links, checkbox, button)
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
//	driver.findElement(By.linkText("Register")).click();
//	driver.findElement(By.name("agree")).click();
	
	By registerLink = By.linkText("Register");
	By agreeCheck = By.name("agree");
	
	doClick(registerLink);
	doClick(agreeCheck);

	}
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
