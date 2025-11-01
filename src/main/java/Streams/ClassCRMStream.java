package Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Disadvantage: Streams are slow and the debugging is difficult
public class ClassCRMStream {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		
//	List<WebElement> paragraphs =driver.findElements(By.cssSelector("section#details p"));
//	
//	String	allParas = paragraphs.stream().map(e->e.getText()).collect(Collectors.joining("\n"));
//
//	System.out.println(allParas);
	
	//List<WebElement> headers =driver.findElements(By.cssSelector("section#details h3"));
//	
//	String	allHeaders = headers.stream().map(e->e.getText()).collect(Collectors.joining("||"));
//
//	System.out.println(allHeaders);
	
	//headers.stream().forEach(e->System.out.println(e.getText()+ "===" +e.getTagName()));
	
	By headers = By.cssSelector("section#details h3");
	
	if(getHeadersList(headers).contains("Forms")) {
		System.out.println("PASS");
	}
	
	}
	
	public static void printHeadersList(By locator) {
		
		driver.findElements(locator)
			.stream()
				.forEach(e->System.out.println(e.getText()));
	}

	
	public static List<String> getHeadersList(By locator) {
		
		return driver.findElements(locator)
			.stream()
				.map(e->e.getText())
					.collect(Collectors.toList());
	}
}
