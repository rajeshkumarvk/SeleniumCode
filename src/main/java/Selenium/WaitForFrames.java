package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrames {

	static WebDriver driver;
	
	public static void main(String[] args){
		
		WebDriver driver= new ChromeDriver();
		
		//page
		driver.get("https://www.formsite.com/templates/frames/registration-form-templates/vehicle-registration-form/");
		
		
		By image = By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']");
		By frame = By.xpath("//iframe[contains(@id, 'frame-one')]");
		By id = By.id("RESULT_TextField-8");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(image)).click();
		
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		
		waitForFrameandSwitchToIt(frame, 5);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(id)).sendKeys("Rajesh");
		
		driver.switchTo().defaultContent();
		
	String header =driver.findElement(By.xpath("//h3[text()= 'Vehicle Registration Form']")).getText();
	
	System.out.println(header);
		
		
		

	}
	
	public static void waitForFrameandSwitchToIt(By frameLocator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		
	}

	
public static void waitForFrameandSwitchToIt(String frameLocator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		
	}

	public static void waitForFrameandSwitchToIt(int index, int timeOut) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	
}
	
	public static void waitForFrameandSwitchToIt(WebElement element, int timeOut) {
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	
}
}
