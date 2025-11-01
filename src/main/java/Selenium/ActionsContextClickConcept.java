package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsContextClickConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		By rightClick = By.xpath("//span[text()='right click me']");
		
		By contextlists= By.cssSelector(".context-menu-list>li.context-menu-icon");
		
		WebElement dorightClick= driver.findElement(rightClick); 
		
	//	driver.findElement(contextlists).click(); // right click is contextclick
		
		Actions act = new Actions(driver);

		act.contextClick(dorightClick).perform();
		
		
		
		List<WebElement> optionLists = driver.findElements(contextlists);
		System.out.println(optionLists.size());
		
		for(WebElement e : optionLists) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("Copy")) {
				e.click();
				break;
			}
		}
	}

}
