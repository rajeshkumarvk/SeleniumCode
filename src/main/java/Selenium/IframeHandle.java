package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		//page
		driver.get("https://www.formsite.com/templates/frames/registration-form-templates/vehicle-registration-form/");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		Thread.sleep(2000);
		
		//go to the iframe
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Rajesh Kumar");
		
		Thread.sleep(2000);
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Bangalore");
		
		Thread.sleep(2000);
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("09/19/2025");
		
		Thread.sleep(2000);
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("This is an optional comment place");
		Thread.sleep(2000);
		
	driver.findElement(By.id("RESULT_FileUpload-6")).sendKeys("C:\\Users\\hp\\Downloads\\VI161517.pdf");
		
		Thread.sleep(2000);
	driver.findElement(By.id("RESULT_TextField-8"))	.sendKeys("Ramesh");
	Thread.sleep(2000);
	driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Kumar");
	Thread.sleep(2000);
	driver.findElement(By.id("RESULT_TextField-10")).sendKeys("3rd main, 1st cross");
	Thread.sleep(2000);
	driver.findElement(By.id("RESULT_TextField-11")).sendKeys("janabharathi nagar");
	Thread.sleep(2000);
	driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Bangalore");
	Thread.sleep(2000);
	
	Select select = new Select(driver.findElement(By.id("RESULT_RadioButton-13")));
	select.selectByValue("Radio-3");
	
	Thread.sleep(2000);
	driver.findElement(By.id("RESULT_TextField-14")).sendKeys("675711");
	Thread.sleep(2000);
	
	driver.findElement(By.id("RESULT_TextField-15")).sendKeys("1223333222");
	Thread.sleep(2000);
	driver.findElement(By.id("RESULT_TextField-16")).sendKeys("test@test123.com");
	
	driver.findElement(By.id("FSsubmit")).click();
	
		
		
		
		//switch back to main page
		
		driver.switchTo().defaultContent();
		
		String header = driver.findElement(By.tagName("h3")).getText();
		
		System.out.println(header);
		
		
	}

}
