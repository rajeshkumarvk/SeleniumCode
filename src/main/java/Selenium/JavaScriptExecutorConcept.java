package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

	//	sel+java---> JavaScriptExecutor --inject JS code into the browser
		
		//usages
		
		//Scrolling, to get the entire text of the page, zoom in/out.
		
		WebDriver driver = new ChromeDriver();
		
	//	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	//	driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title;").toString();
//		
//		System.out.println(title);
//		
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println(url);
//		

		JavaScriptUtil js = new JavaScriptUtil(driver);
		
//		String title =js.getTitleByJS();
//		System.out.println(title);
//		
//		String url = js.getUrlByJS();
//		System.out.println(url);
//		
//		js.generateJSAlert("this is java with selenium Automation");
//		
//	String pageText =js.getPageInnerText();
//	System.out.println(pageText);
//	if(pageText.contentEquals("Customer Service")) {
//		System.out.println("PASS");
//	}
		
//	js.scrollPageDown();
//	Thread.sleep(2000);
//	js.scrollPageUp();
	
	
//	WebElement element =driver.findElement(By.xpath("//span[contains(text(),'Up to 75% off | Curated products from Small Bu…')]"));
//	Thread.sleep(5000);
////	js.scrollIntoView(element);
//	
//	Actions act = new Actions(driver);
//	act.scrollToElement(element).pause(3000).build().perform();
	
	

		
//		WebElement ele = driver.findElement(By.id("input-email"));
//		WebElement login = driver.findElement(By.cssSelector("div.well form"));
//		WebElement footer = driver.findElement(By.xpath("//footer"));
//		js.drawBorder(ele);
//		js.drawBorder(login);
//		js.drawBorder(footer);
		
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement pwd = driver.findElement(By.id("input-password"));
//	
//	 js.flash(email);
//	 email.sendKeys("test@123.com");
//	 
//	 js.flash(pwd);
//	 pwd.sendKeys("test@123");
	
//	js.zoomChromeEdgeFirefox("300");
	
//	js.zoomFirefox("300");
	
		
		//WebClick(recommended)- ActionsClick(Second Recommended) -- JSClick(Not recommended)
		WebElement agree = driver.findElement(By.name("agree"));
		
		js.clickElementByJS(agree);
		
	}

}
