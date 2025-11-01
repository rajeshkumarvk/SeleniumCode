package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserBlankWindowTab {
//In Selenium 4.x , new method called newWindow is provided, where we can open a new blank window/tab
	//and then you open another url and do something on it and then cameback to parent window
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://orangehrm.com/30-day-free-trial");
		String parentWindow = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		System.out.println("child title is: " +driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindow);
		System.out.println(" parent window title is : " +driver.getTitle());
		
	}

}
