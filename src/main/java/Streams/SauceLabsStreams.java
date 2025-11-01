package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class SauceLabsStreams {

	
	//RelativeLocator
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> pricesList= driver.findElements(By.cssSelector("div.inventory_item_price"));
		
		//To get the prices only
		
	//	pricesList.stream().forEach(e->System.out.println(e.getText()));
		
		//To ignore dollar($) and only get the double value\
		//$29.99-"29.99"-29.99
		
//		pricesList.stream()
//						.map(e->Double.parseDouble(e.getText().substring(1)))
//							.forEach(e->System.out.println(e));
		
		
		//sorted in ascending order
//	List<Double> sorted_prices=	pricesList.stream()
//									.map(e->Double.parseDouble(e.getText().substring(1)))
//										.sorted()
//											.collect(Collectors.toList());
//	
//	System.out.println(sorted_prices);
	
	//sorted in descending order user comparator
	
//	List<Double> sorted_prices_desc= pricesList.stream()
//										.map(e->Double.parseDouble(e.getText().substring(1)))
//											.sorted(Comparator.reverseOrder())
//												.collect(Collectors.toList());
//	
//	System.out.println(sorted_prices_desc);
	
	//Get the first element(pricing) use findFirst method
		
		
//	Double first_price = pricesList.stream()
//							.map(e->Double.parseDouble(e.getText().substring(1)))
//								.findFirst().get();
//	
//	System.out.println(first_price);
	
	//To find the last element(use reduce method)
	
//	Double last_price= pricesList.stream()
//						.map(e->Double.parseDouble(e.getText().substring(1)))
//							.reduce((first, second)->second).get();
//			
//	System.out.println(last_price);
	
	//To find the maximum value use max method
	
	
	Double max_price= pricesList.stream()
						.map(e->Double.parseDouble(e.getText().substring(1)))
							.max(Double::compareTo).get();
	
	System.out.println(max_price);
	
	//To find the minimum value use min method
	
	Double min_price =	pricesList.stream()
						.map(e->Double.parseDouble(e.getText().substring(1)))
							.min(Double::compareTo).get();
	
	System.out.println(min_price);
	
	//To capture the value of 15.99  , use relative locator 
	
	
	//WebElement products =driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
	
			

	}

}
