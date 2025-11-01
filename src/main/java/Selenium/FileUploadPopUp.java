package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	//In file upload , the type attribute should always be file.
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/upload");
		
		driver.findElement(By.cssSelector("input#fileInput")).sendKeys("C:\\Users\\hp\\Downloads\\image.png");

	}

}
