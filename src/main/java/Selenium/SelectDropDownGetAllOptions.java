package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownGetAllOptions {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		By country = By.id("Form_getForm_Country");
		
//		Select select = new Select(driver.findElement(country));
//		List<WebElement> optionsList = select.getOptions();
//		System.out.println(optionsList.size());
//		
//		for(WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("Mexico")) {
//				e.click();
//				break;
//			}
//		}
		selectDropDownValue(country, "Japan");
   
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	
			

	public static boolean selectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		boolean flag = false;
		for(WebElement e: optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(value +" is selected");
			return true;
		}
		else {
			System.out.println(value + " is not selected");
			return false;
		}
	}

}