package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	static WebDriver driver;
	public static void main(String[] args) {
	
		 driver = new ChromeDriver();
	//	 driver.get("https://www.amazon.com/");
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
		//xpath: address of the element in html dom
			//not an attribute
		 
		//1. absolute xpath: /
			// /html/body/div/div[2]/ul/li[2]/div/div/input
		 
		 //2. relative xpath/custom xpath: //
		 
		//1.	htmltag[@attribute ='value']
		 
		//input[@name='email']
		//input[@name='firstname']
		//input[@id='input-lastname']
		//input[@type='tel']
		 //input[@placeholder='E-Mail Address']
		//input[@id='input-email']
		//input[@value='Login']
		 
		 //2. //htmltag[@attr1='value' and @attr2='value']

		 //htmltag[@attr1='value' and @attr2 ='value']
		 
		//input[@type='text' and @name='email']
		//input[@type='text' and @placeholder='Last Name']
		 
		//input[@name='password' and @placeholder='Password']
		//input[@type='text' and @id='input-email' and @class='form-control']
		//input[@type='email' and @placeholder='E-Mail' and @id='input-email']
		
		 //input[@id and @type and @class]
		 
		 		 
		//parent to child:
		 
		 //direct  	/ --> only direct
		 //indirect  	//---> direct and indirect
		 
		//form/input --> 3 (direct)
		//form//input --> 5(indirect)-it is both direct and indirect
		 
		//div[@id='content']/h1
		 
		 //div[@id='content']/h2
		 
		//div[@id='content']/h1
		//div[@id='content']/form//input[@id='input-firstname']
		//div[@id='content']/form//input[@name='lastname']
		 
		//div[@id='content']/form//input[@id='input-firstname']
		 
		 //https://orangehrm.com/30-day-free-trial
		 
		//select[@id='Form_getForm_Country']/option
		
		 
		 //select[@id='Form_getForm_Country']/option
		 
		//footer:
			//footer//h5 -4
			//footer//a -16
		 
		 //3. Text() - Is a function or method, it is not attribute so do not use @.
		 
		 //text(): paragraph, links, label, span, div, header h1 h2 h3
		 
		//htmltag[text()='value']
		 
		 //htmltag[text()='value']
		 
		//h1[text()='Register Account']
		//h2[text()='New Customer']
		//h2[text()='Returning Customer']
		//a[text()='Register']
		//a[text()='Order History']
		 
		//a[text()='Address Book']
		 
		//label[text()='E-Mail Address']
		//strong[text()='I am a returning customer']
		 
		 
		//4. text() and attribute:
		 
		//htmltag[@attr='value' and text()='value']
		 
		 //htmltag[@attr='value' and text()='value']
		 
		//label[@for='input-email' and text()='E-Mail Address']
		 
		//a[@class='list-group-item' and text()='Address Book']
		 
		 //a[@class='list-group-item' and text()='My Account']
		 
		//htmltag[text()='value' and @attr='value']
		 
		//htmltag[@attr1='value' and @attr2='value' and text()='value']
		 
		 
		 
		//5. contains(): function or method and it is partial attribute , partial text value. NO equals
		 
		//htmltag[contains(text(),'value')]
		 
		 //htmltag[contains(text(),'value']
		 
		//a[contains(text(),'Password')]
		 
		//h2[contains(text(),'Returning')]
		 
		//h2[contains(text(),'New')]
		 
		//p[contains(text(),'shop faster')]
		 
		//p[contains(text(),'keep track')]
		 
		 
		//6. htmltag[contains(@attr,'value')]
		 
		//a[contains(@class, 'btn btn-primary')]
		 
		//a[contains(@href, 'account/address')]
		 
		//input[contains(@placeholder,'E-Mail')]
		 
		//htmltag[contains(@attr,value) and contains(text(),'value')]
		 
		//a[contains(@href, 'account/register') and contains(text(), 'Continue')]
		 
		 //a[contains(@href,'account/order') and contains(text(),'Order')]
		 
		//htmltag[contains(@attr1,'value') and @attr2='value']
		 
		//a[contains(@href,'account/recurring') and @class='list-group-item']
		 
		//a[contains(@class,'list-group-item') and contains(text(),'Wish List')]
		 
		//htmltag[contains(@attr1,'value') and @attr2='value' and contains(text(),'value')]
		 
		//a[contains(@href,'account/recurring') and @class='list-group-item' and contains(text(),'Recurring')]
		 
		//a[contains(@href,'account/reward') and @class='list-group-item' and contains(text(), 'Reward')]
		 
		 
		//7. dynamic attributes/text:
		 
		 //<input id ="firstname_123">
		//<input id ="firstname_345">
		// <input id="firstname_567">
		 
		// <input name="first678name">
		 //<input name="first908name">
		 
	//	 By.id("firstname_123"); //wont work
		 //By.xpath("input[contains(@id,'firstname_']");
//		 By.xpath("//input[contains(@id, 'firstname_')]");
//		 By.xpath("//input[contains(@id, 'lastname_')]");
		 
		//<div>your order id is 12345</div>
		 
	//	 By order = By.xpath("//div[contains(text(),'your order id is')]");
		// String orderText = driver.findElement(order).getText();
	//	 System.out.println(orderText);
		 //orderText =your order is 12345;
		 
		//8. starts-with(): @attr or text() and both @attr and text()
		 
		 //htmltag[starts-with(@attr, 'value')]
			
		//input[starts-with(@placeholder, 'E-Mail')]
		 
		//htmltag[starts-with(text(),'value')]
		 
		//p[starts-with(text(), 'By creating')]
		 
		//9. starts-with() and contains(): 
		 
		 //htmltag[starts-with(@id,'value') and contains(text(), 'value')]
		 
		 //htmltag[starts-with(text(),'value') and contains(@attr, 'value')]
		 
		//a[starts-with(text(), 'My Account') and contains(@class,'list-group-item')]
		 //a[starts-with(text(),'Transac') and contains(@class, 'list-group-item')]
		 
		 //10. //ends-with(): NA in xpath:
		 
		//11. index in xpath: store in capture group and the use index
		 
	//	 (//a[text()='Forgotten Password'])[2] - capture group
		 
	//	 driver.findElement(By.xpath("(//a[text()='Forgotten Password'])[2]")).click();
		 
		driver.findElement(By.xpath("(((//div[@class='navFooterLinkCol navAccessibility'])[last()])//a)[last()]")).isDisplayed();
		 
	// driver.findElement(By.xpath(" (//a[@class='list-group-item'])[last()]"));
	
	//	(//select[@id='Form_getForm_Country']/option)[last()]
		
	}
		 

	}


