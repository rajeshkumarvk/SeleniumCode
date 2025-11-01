package Selenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandling {
	
	//::before is psuedo class

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	Thread.sleep(2000);
	
	String script ="return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'),'::before').getPropertyValue('content');";
	String scriptColor ="return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'),'::before').getPropertyValue('color');";
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	String content = js.executeScript(script).toString();
	System.out.println(content);
	
	if(content.contains("*")) {
		System.out.println("this is mandatory field");
	}

	
	String color = js.executeScript(scriptColor).toString();
	System.out.println(color);
	
	
	}
	
	

}
