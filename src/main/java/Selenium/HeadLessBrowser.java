package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {
//Headless: 
	//Speed is fast. 
	//and the testing is done behind the scene
	//it wont interfer any other work
	
	//problem
		//It is not used in read time simulation
	//for complex DOM and lots of navigation script might get failed.
	
	//Usage
	//NOt GUI like linux or CI/CD jenkins. for small applications
	
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		
	//	co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);
		
//		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--headless");
//		WebDriver driver = new EdgeDriver(eo);
			
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
