package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleJquery {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree");
		
		By choice = By.id("justAnInputBox");
		By choiceList= By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li/span[@class='comboTreeItemTitle']");
		
		//TC-1: Single Selection
	//	selectChoice(choice, choiceList, "choice 2");
		
		//TC-2: Multiple Selection(use String... by comma separated)
		selectChoice(choice, choiceList, "choice 2" ,"choice 3", "choice 6 2 1");
		
		//TC-3: All Selections
	//	selectChoice(choice, choiceList, "all");
		
	}
/**
 * this method used to select choices with 3 different use cases
 * 1. Single Selection: selectChoice(choice, choiceList, "choice 2")
 * 2. Multiple Selection: selectChoice(choice, choiceList, "choice 2" ,"choice 3", "choice 6 2 1");
 * 3. All Selections: use all/ALL to select all choices: selectChoice(choice, choiceList, "all");
 * @param choice
 * @param choiceList
 * @param choiceValue
 * @throws InterruptedException
 */
	public static void selectChoice(By choice, By choiceList, String...choiceValue) throws InterruptedException {
	
		
		driver.findElement(choice).click();
		
		
		Thread.sleep(2000);
		
		
		
		List<WebElement> choices = driver.findElements((choiceList));
		System.out.println(choices.size());
		
		
		if(choiceValue[0].equalsIgnoreCase("all")) {
			//logic: to select all choices
			for(WebElement e:choices ) {
				e.click();
			}
		}
		else {
			
		}
		for(WebElement e: choices) {
			String text =e.getText();
			System.out.println(text);
			
			for(String value :choiceValue) {
				if(text.trim().equals(value)) {
					e.click();
					break;
				}
			}
		}
	}
	}
