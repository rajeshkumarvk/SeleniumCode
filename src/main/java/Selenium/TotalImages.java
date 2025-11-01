package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://www.amazon.co.in/");
		List<WebElement> imagelist = driver.findElements(By.tagName("img"));
		
		System.out.println("total images count:" +imagelist.size());
		
		for(WebElement e: imagelist) {
			String altVal  =e.getDomAttribute("alt");
			String srcVal = e.getDomAttribute("src");
			
			
			System.out.println(altVal +" : " +srcVal);
		}
	}
 
}
