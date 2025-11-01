package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes12 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
		
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page");
		//parent to child:
		
		//parent to child:
		//====================
		
		//parentTag[@attr='value']/childtag[@attr='value'](for direct child)
		//parentTag[@attr='value']//childtag[@attr='value'](for indirect child)

		//parentTag[@attr='value']/child::childtag[@att='value'] Her child is XpathAxes
		//parentTag[@attr ='value']/child::childtag[@attr='value'] Here child is XpathAxes. 
		//This for both direct and indirect child
		
		
	//	(//div[@class='form-group'])[1]/child::input[@id='input-email']
				
		//div[@class='form-group']/child::input[@id='input-email']
		
		//div[@class='col-sm-10']/child::input[@placeholder='First Name']
		
		//div[@class='form-group']/input[@id='input-email']
		
		//select[@id='Form_getForm_Country']/child::option[contains(text(),'Austria')] //https://orangehrm.com/30-day-free-trial
		
		//select[@id='Form_getForm_Country']/child::option[contains(text(), 'Algeria')]
		
		
		//child to parent: backward traversing
		//========================================
		
		//input[@id='input-email']/../../../..
		
		//child[@atr='value']/../..
		
		//child[@attr='value']/parent::parentTag[@attr='value']
		
		//input[@id='input-email']/parent::div/parent::form
		
		//child to ancestor(grandparent)
		//==============================
		
		//child[@attr='value']/ancestor::ancestortag[@attr='value']
		
		//input[@id='input-email']/ancestor::form/ancestor::div[@id='content']
		
		//input[@id='input-password']/ancestor::form/ancestor::div[@id='content']
		
		//sibling: 
		//-------------
		//previous is preceding-sibling and next or after is following-sibling
		
		//htmltag[@attr='value']/preceding-sibling::tag
		//htmltag[@attr='value']/following-sibling::tag
		
		//input[@id='input-email']/preceding-sibling::label
		
		//label[@for='input-email']/following-sibling::input
		
		
		//option[contains(text(), 'Algeria')]/preceding-sibling::option- 3
		
		//option[contains(text(), 'Algeria')]/preceding-sibling::option -229
		
	//	(//option[contains(text(),'Austria')]/following-sibling::option)[1] - immediate after sibling
		
	//	(//option[contains(text(),'Austria')]/following-sibling::option)[last()] - for last sibling
		
		
		//WebTable:   https://selectorshub.com/xpath-practice-page/
		//==========================================================
		
		//a[contains(text(),'Jasmine.Morgan')]/parent::td/preceding-sibling::td/child::input[@type='checkbox']
		
		//a[contains(text(),'John.Smith')]/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		//a[contains(text(),'Joe.Root')]/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		
		//a[contains(text(),'Jasmine.Morgan')]/ancestor::tr/child::td/input[@type='checkbox']
		//a[contains(text(),'Jasmine.Morgan')]/ancestor::tr//input[@type='checkbox']
		
		//a[contains(text(),'Joe.Root')]/ancestor::tr//input[@type='checkbox']
		//a[contains(text(),'John.Smith')]/ancestor::tr//input[@type='checkbox']
		
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("//a[contains(text(),'Joe.Root')]/ancestor::tr//input[@type='checkbox']")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'John.Smith')]/ancestor::tr//input[@type='checkbox']")).click();
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Jasmine.Morgan')]/ancestor::tr/child::td/input[@type='checkbox']")).click();
		
	selectUser("John.Smith");
//	selectUser("Joe.Root");
//	
	
	//to get the details of the user
	
	//a[contains(text(),'Jasmine.Morgan')]/parent::td/following-sibling::td
	
	//a[contains(text(),'Joe.Root')]/parent::td/following-sibling::td
	
	//a[contains(text(),'John.Smith')]/parent::td/following-sibling::td
	
	//amazon: find the list of the footers
	//==========
	
	//div[text()='Get to Know Us']/following-sibling::ul//a
	
	getUserData("Jasmine.Morgan");
		
	}


public static List<String> getUserData(String userName) {
	List<WebElement> colDataList =driver.findElements(By.xpath("//a[contains(text(),'"+userName+"')]/parent::td/following-sibling::td"));
	
	List<String> colList = new ArrayList<String>();
	for(WebElement e : colDataList) {
		String text = e.getText();
		System.out.println(text);
		colList.add(text);
	}
	return colList;
}


	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[contains(text(),'"+userName+"')]/ancestor::tr//input[@type='checkbox']")).click();
	}
		
	
}
