package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinksListAssignments {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		List<WebElement> eleLinks = driver.findElements(By.xpath("//div[@class='col-sm-3']//a"));
//		
//	
//		
//		System.out.println(eleLinks.size());
//		
//		
//		for(WebElement e: eleLinks) {
//			String text = e.getText();
//			System.out.println(text);						
//			if(text.contains("Privacy Policy")) {
//				e.click();
//				break;
//			}
//		}
	
		By eleLinks = By.xpath("//div[@class='col-sm-3']//a");
		clickElement(eleLinks, "Privacy Policy");
		
		
	}
public static void clickElement(By locator, String value) {
	List<WebElement> eleList = getElements(locator);
	System.out.println("total number of elements " +eleList.size());
	for(WebElement e: eleList) {
		String text = e.getText();
		System.out.println(text);						
		if(text.contains(value)) {
			System.out.println("element found : PASS");
			e.click();
			break;
		}
	}
}

	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
}


