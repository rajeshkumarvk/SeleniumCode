package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleLanguageTest10 {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
//		List<WebElement> lang =driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		System.out.println(lang.size());
//		
//		for(WebElement e : lang) {
//			String text = e.getText();
//			if(text.contains("ಕನ್ನಡ")) {
//				e.click();
//				break;
//			}
//			
//		}
		
		By langlocator = By.xpath("//div[@id='SIvCob']/a");
		
		clickElement(langlocator , "తెలుగు");
	}
	
	public static void clickElement(By locator, String value) {
		List <WebElement> eleList =getElements(locator);
		System.out.println("the total number of elements : "+eleList.size());
		for(WebElement e:eleList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
