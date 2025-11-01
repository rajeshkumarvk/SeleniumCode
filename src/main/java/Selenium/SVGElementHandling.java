package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		String xpath = "//*[local-name()='svg' and @id ='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";
		
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
	Thread.sleep(3000);

List<WebElement> regionsList = driver.findElements(By.xpath(xpath));

System.out.println(regionsList.size());

Actions act = new Actions(driver);

for(WebElement e : regionsList) {
	String regionName = e.getDomAttribute("id");
	System.out.println(regionName);
	act.moveToElement(e).pause(500).build().perform();
	Thread.sleep(500);
	
}
	
	}

}
