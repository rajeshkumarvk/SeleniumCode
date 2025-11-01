package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Alert API used to tackle pop-ups
//1. JS Alert Pop-ups: 
//a. Alert- Ok 
//b. Confirm - cancel or Ok button
//c. Prompt only one field text - cancel or Ok button

//2. Fileupload ( use sendKeys)

//3. Auth ( basic Auth: sendkeys through url): 2 textfield
//b. HasAuthentication (Interface) which implemented by Chromium driver

public class JsAlertHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
	//	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//1. JS ALert Pop-up
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Thread.sleep(4000);
//		
//		Alert alert =driver.switchTo().alert();
		
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
//		alert.dismiss();
		
		//2. JS Confirm pop-up
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//		Thread.sleep(4000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
//		
//		alert.dismiss();

		//3. JS Prompt pop-up
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		
//		Thread.sleep(4000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.sendKeys("test automation");
//		
//		alert.accept();
//		
//		alert.dismiss();
		
		//4. Another website
		
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		Thread.sleep(4000);
		
		Alert alert =driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
	//	alert.dismiss();
		
		
	}

}
