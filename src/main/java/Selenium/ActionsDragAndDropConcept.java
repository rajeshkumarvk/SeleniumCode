package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDropConcept {

	
	//Difference between Actions and Action
	//Actions is a class that allows the user to call various methods such as move to Element, click and hold etc
	//Action is a interface and build method returns Action.
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceEle =driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
	//	Action myAction =act.clickAndHold(sourceEle).moveToElement(targetEle).release().build();
//		
//		myAction.perform();
		
		act.dragAndDrop(sourceEle, targetEle).perform();
		

	}

}
