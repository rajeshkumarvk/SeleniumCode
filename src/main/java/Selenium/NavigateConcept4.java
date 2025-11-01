package Selenium;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateConcept4 {

	public static void main(String[] args) throws MalformedURLException{
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
				
		System.out.println(driver.getTitle());
		
		//Difference between driver. get and navigate.to is both do similar or synonums
		//both do get call. To also do get call internally. get will take string whereas to will take both string and URL
		//means get is not method overloaded whereas to is method overloaded.
		
	//	difference between navigate to and get method are synonoumus. 
//To internally call get method. Get doesn't have method overloading and it allows string to be used
		//to supports method overloading, allows String and URL
		
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().to(new URL("http://www.amazon.com"));
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
	
		driver.navigate().forward();
		
		driver.navigate().back();
		
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		
		
		driver.quit();

	}

}
