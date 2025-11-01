package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks9 {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		
		//to find the number of links and print the linktext 
		//html tag: <a>
		
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("total link list : "+linklist.size());
//		
//		
//		//to find the list  using for for loop
		
		for(int i =0;i<linklist.size();i++) {
			String text= linklist.get(i).getText();
			if(text.length()!=0)
			System.out.println(text);
		}
		
		System.out.println("------------");
	
		for(WebElement e: linklist) {
			String text = e.getText();
			if(text.length()!=0) {
				System.out.println(text);
			}
		}
	


	}

}
