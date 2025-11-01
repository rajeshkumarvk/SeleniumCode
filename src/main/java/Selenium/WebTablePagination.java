package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablePagination {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//Single Selection
		
	
//		//Multi Selection
//		
//		while(true) {
//			if(driver.findElements(By.xpath("//td[text()='United States']")).size()>0) {
//				System.out.println("country is found");
//				multiSelectCountry("United States");
//				
//			}
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			By css = By.cssSelector("button.next");
//		WebElement next = wait.until(ExpectedConditions.visibilityOfElementLocated(css));
//		if(next.getDomAttribute("class").contains("disabled")) {
//			System.out.println("pagination is over and not found");
//			break;
//		}
//			try{
//				next.click();
//			}
//			catch(ElementClickInterceptedException ex) {
//				
//			}
//			Thread.sleep(100);
			
//		}
//		
//		
	//	selectCountry("India", 5);
	//	multiSelectCountry("India", 5);
		
		selectDifferentCountry(List.of("India", "Canada") , 5);
		
		
		}
		
	//Multiple Country Selection
	
	public static void selectDifferentCountry(List<String> countryNames, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		By css = By.cssSelector("button.next");
		

		while(true) {
			
			for(String country: countryNames) {
				List<WebElement> countryList = driver.findElements(By.xpath("//td[text()='"+country+"']"));
				if(countryList.size()>0) {
				System.out.println("country is found " +countryNames);
				By xpath = By.xpath("//td[text()='"+country+"']/preceding-sibling::td/input[@type='checkbox']");
				List<WebElement> countryListCheckBox= driver.findElements(xpath);
					for(WebElement e: countryListCheckBox ) {
						try {
							if(!e.isSelected()) {
								e.click();
							}
						}	catch(StaleElementReferenceException ex) {
							WebElement freshCheckBox= driver.findElement(xpath);
							freshCheckBox.click();
						}
					}	
				}
			}
			
			WebElement next = wait.until(ExpectedConditions.visibilityOfElementLocated(css));

				            if (next.getDomAttribute("class").contains("disabled")) {
				                System.out.println("Pagination is over.");
				                break; 
				            }

				            try {
				                next.click();
				        
				            } catch (ElementClickInterceptedException e) {
				                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", next);
				                
				            }
			 
			 
				    }

				    System.out.println(" Country selection process completed.");
				}
			
	//Multiple  Selection	
		
	public static void multiSelectCountry(String countryName, int timeOut) {
		
		while(true) {
			By cName= By.xpath("//td[text()='"+countryName+"']");
			By xpath = By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']");
			if(driver.findElements(cName).size()>0) {
				System.out.println("country is found " +countryName);
				List<WebElement> countryList= driver.findElements(xpath);
					for(WebElement e: countryList ) {
						e.click();
					}				
			}
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			By css = By.cssSelector("button.next");
			WebElement next = wait.until(ExpectedConditions.visibilityOfElementLocated(css));
				if(next.getDomAttribute("class").contains("disabled")) {
					System.out.println("pagination is over");
					break;
				}
			try{
				next.click();
			}
			catch(ElementClickInterceptedException ex) {
			  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", next);
			}
					
		}
	
	}
	//Single Selection
	
	public static void selectCountry(String countryName, int timeOut) {
		while(true){
		By cName= By.xpath("//td[text()='"+countryName+"']");
		By xpath = By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']");
		if(driver.findElements(cName).size()>0) {
		System.out.println("country is found " +countryName);
		WebElement	country =driver.findElement(xpath);
		country.click();
		break;
		}
		else {
		//	pagination logic: next
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			By css = By.cssSelector("button.next");
		WebElement next = wait.until(ExpectedConditions.visibilityOfElementLocated(css));{
			if(next.getDomAttribute("class").contains("disabled")) {
				System.out.println("pagination is over and not found");
				break;
			}
		}
			next.click();
			
	}
		}
	}
}
