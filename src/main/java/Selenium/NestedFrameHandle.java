package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-scenario");
		
		driver.switchTo().frame("pact1"); //f1
		
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		
		driver.switchTo().frame("pact2"); //f2
		
		driver.findElement(By.id("jex")).sendKeys("Automation");
		
		driver.switchTo().frame("pact3"); //f3
		
		driver.findElement(By.id("glaf")).sendKeys("google");

		//f3 to f2:
		
//		driver.switchTo().parentFrame();
//		
//		driver.findElement(By.id("jex")).sendKeys(" with Selenium");
//		
//		//f2 to f1
//		driver.switchTo().parentFrame();
//		
//		driver.findElement(By.id("inp_val")).sendKeys(" in NAL");
		
		//f1 to page(DC)
		
//		driver.switchTo().defaultContent();
//		
//		String header =driver.findElement(By.tagName("h3")).getText();
//		
//		System.out.println(header);
		
		
	
		//f1 to page(PF)
		
//		driver.switchTo().parentFrame();
//		
//		String header =driver.findElement(By.tagName("h3")).getText();
//		
//		System.out.println(header);
		
	
		
		
		//can 1 go directly from f1 to f3. no , you have to go via f2.
//		
//		driver.switchTo().frame("pact3"); //f3
//		
//		driver.findElement(By.id("glaf")).sendKeys("Meta");
		
		
		//page--->f1 - yes
		//f1-f2 -- yes
		//f2-f3-- yes
		//page -f3--no
		//page-f2-- no
		//page--f1--f2-f3-- yes
		
		//f3-f2: yes(PF)
		//f2-f1:yes(PF)
		//f1-page:yes(PF, DC)
		
		//f3-f1: invalid
		
	//	driver.switchTo().frame("pact1");
	//	driver.findElement(By.id("inp_val")).sendKeys("manual");
		
		//f3-page: yes(DC)
		
//		driver.switchTo().defaultContent();
//		
//		String header =driver.findElement(By.tagName("h3")).getText();
//		
//		System.out.println(header);
		
	//f2-page: yes(DC)
		
		driver.switchTo().defaultContent();
		
		String header =driver.findElement(By.tagName("h3")).getText();
		
		System.out.println(header);
	}

}
