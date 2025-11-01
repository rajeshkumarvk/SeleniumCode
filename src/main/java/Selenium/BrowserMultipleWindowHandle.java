package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandle {

	static WebDriver driver; 

public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://orangehrm.com/30-day-free-trial"); //parent
		String parentWindowId = driver.getWindowHandle();
		
		WebElement fb_ele = driver.findElement(By.xpath("//img[@alt='facebook']"));
		WebElement li_ele = driver.findElement(By.xpath("//img[@src='/public/newweb/footer/youtube.png']"));
		WebElement yt_ele = driver.findElement(By.xpath("//img[@src='/public/newweb/footer/instagram.png']"));
		WebElement x_ele = 	driver.findElement(By.xpath("//img[@src='/public/newweb/footer/x.png']"));
		
		fb_ele.click();
		li_ele.click();
		yt_ele.click();
		x_ele.click();
		
		//Fetch the Windows ID
		
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it =handles.iterator();
		
		while(it.hasNext()) {
			String windowId =it.next();
			//switch to Window
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			if(!windowId.equals(parentWindowId)) {
			driver.close();
			
		}
		
			
		}
		
		//switch back to parent window
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is : " +driver.getTitle());

	}

}
