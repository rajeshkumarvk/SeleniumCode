package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultiSelectionDropDown {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple");
		
		//to select multiple, the multiple attribute should be present
		
		WebElement dropDownEle = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select = new Select(dropDownEle);
		System.out.println(select.isMultiple()); //true
		
		if(select.isMultiple()) {
			System.out.println("multi selection is possible");
			
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Greater flamingo");
			select.selectByVisibleText("Lesser flamingo");
		}
		
		List<WebElement> OptionsList = select.getAllSelectedOptions();
		for(WebElement e: OptionsList) {
			String text = e.getText();
			System.out.println(text);
		}
		
		System.out.println("---------------------");
		select.deselectByVisibleText("Greater flamingo");
		
		select.deselectAll();
	}

}
