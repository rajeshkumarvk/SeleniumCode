package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUpHandling {
	
	//window handler api: tabs/windows : browser popup
	//url, titlepage, webelements
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://orangehrm.com/30-day-free-trial"); //parent
		
		driver.findElement(By.linkText("About Us")).click();  //child
		
		//1st Fetch the window IDs
		
		Set<String> handles  =driver.getWindowHandles();
			Iterator<String> it =	handles.iterator();
			
			String parentwindowID = it.next();
			System.out.println("parent window ID is : "+parentwindowID);
			
			String childwindowID= it.next();
			System.out.println("child window ID is : "+childwindowID);
			
			//2nd: switching window
			
			driver.switchTo().window(childwindowID);
			System.out.println("Child window title is : " +driver.getTitle());
			
			Thread.sleep(2000);
			//close the child window
			driver.close();
			
			//switch back to parent window
			driver.switchTo().window(parentwindowID);
			System.out.println("parent window title is :" +driver.getTitle());
			
			Thread.sleep(2000);
			
			driver.quit();
			
	}

}
