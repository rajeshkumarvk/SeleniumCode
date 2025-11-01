package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class WebTableWithRelativeLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement username =driver.findElement(By.linkText("Joe.Root"));
		
		driver.findElement(with(By.cssSelector("input#ohrmList_chkSelectRecord_21")).toLeftOf(username)).click();
		
		//It is better to use normal xpath or CSS than to use RelativeLocators for number of elements
		List<WebElement> eleList =driver.findElements(with(By.tagName("td")).toRightOf(username));
		
		for(WebElement e: eleList) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
