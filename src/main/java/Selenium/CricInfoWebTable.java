package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoWebTable {
	
	//if the parent doesn't have text, in selenium the child text will be collected and displayed.
	//

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/south-africa-in-england-2025-1448336/england-vs-south-africa-3rd-odi-1448356/full-scorecard");
		
		Thread.sleep(4000);
		
	//String wktaker=	driver.findElement(By.xpath("//span[text()='Jamie Smith']/ancestor::td/following-sibling::td")).getText();

		
//		List<WebElement> scoreCard =driver.findElements(By.xpath("//span[text()='Jamie Smith']/ancestor::td/following-sibling::td"));
//		
//	
//		for(WebElement e: scoreCard) {
//			String text= e.getText();
//			System.out.println(text);
//			
//		}
		
//		List<WebElement> bowlerStats =driver.findElements(By.xpath("//span[text()='Nandre Burger']/ancestor::td/following-sibling::td"));
//		
//		for(WebElement e : bowlerStats) {
//			String text = e.getText();
//			System.out.println(text);
//		}
	//System.out.println(wktaker);
	//	getWktTaker("KL Rahul");
	//	getWktTaker("Karun Nair");
		
//		getWktTaker("Harry Brook");
		getBowlerStats("Brydon Carse");
		//getplayerScore("Joe Root");

	}
	

	public static List<String> getBowlerStats(String playerName) {
		List<WebElement> bowlerStats =driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td"));
		
		List<String>bowlerStatsList = new ArrayList<String>();
		for(WebElement e : bowlerStats) {
			String text = e.getText();
			System.out.println(text);
			bowlerStatsList.add(text);
		}
		return bowlerStatsList;
	}
//public static List<String> getplayerScore(String playerName) {
//	List<WebElement> scoreCard =driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td"));
//	
//	List<String> scoreCardList = new ArrayList<String>();
//	for(WebElement e : scoreCard) {
//		String text = e.getText();
//		System.out.println(text);
//		scoreCardList.add(text);
//	}
//		return scoreCardList;
//	
//}
	
	
//	public static String getWktTaker(String playerName) {
//		String wktaker=	driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td")).getText();
//		System.out.println(playerName + " OUT " +wktaker);
//		return wktaker;
//	}
//	
//	public static List<String> getBowlerStats(String playerName) {
//		List<WebElement> getBowlers =driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
//
//		System.out.println(getBowlers.size());
//		List<String> bowlersStat = new ArrayList<String>();
//		for(WebElement e: getBowlers) {
//			String text = e.getText();
//			System.out.println(text);
//			bowlersStat.add(text);
//		}	
//		return bowlersStat;
//	}
}
