package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownMiddleValue {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		By country = By.id("Form_getForm_Country");
		
		Select select = new Select(driver.findElement(country));
		int middleIndex	= select.getOptions().size()/2; //should get the size and then divide by 2
		
	//	select.selectByIndex(middleIndex); //middle element
		
//		select.selectByIndex(select.getOptions().size()-1); //to get the last element
		
		List<WebElement> selectedOptionsList= select.getAllSelectedOptions(); //List of preselected elements
		
		System.out.println(selectedOptionsList.size());//1 
		String defaultValue =select.getFirstSelectedOption().getText(); //first selected element
		
		System.out.println(defaultValue);
		
		select.selectByContainsVisibleText("Antigua");

	}

}
