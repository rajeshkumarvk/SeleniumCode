package Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverStreamsLambda {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		//Streams 8 JDK- Arraylist object reference. which helps in applying filter, sorted and do some 
		//Manipulation as map and performs action such as for each, collect
		
		//lambda ->
		
	//	allLinks.stream().forEach(e->System.out.println(e.getText()));
		
		//To get only with the Non-emply links
		
	//	allLinks.stream().filter(e->!e.getText().isEmpty()).forEach(e->System.out.println(e.getText()));
		
		
		//To get only linktext with flipkart
//		allLinks
//			.stream()
//				.filter(e->!e.getText().isEmpty())
//					.filter(e->e.getText().startsWith("Flipkart"))
//					.forEach(e->System.out.println(e.getText()));
		
		//Not print  but to collect  and display
		
		List<WebElement> flipkartLinks = allLinks
											.stream()
												.filter(e->!e.getText().isEmpty())
													.filter(e->e.getText().startsWith("Flipkart"))
														.collect(Collectors.toList());
		
	List<String>flipkartLinksText = flipkartLinks.stream().map(e->e.getText()).collect(Collectors.toList());
		System.out.println(flipkartLinksText);
		System.out.println(flipkartLinksText.size());
		
		
		}
	
	}
