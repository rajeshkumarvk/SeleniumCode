package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {

	public static void main(String[] args) {

		//launch the browser
		//get the url
		//get the title of the page
		//validate the title
		//quit the browser
		
		ChromeDriver driver = new ChromeDriver();

		
		//enter the url
		
		driver.get("https://google.com");
	
		//get the title of the page
		
		String acTitle = driver.getTitle();
		System.out.println("the title is : " +acTitle);
		
				
		//checkpoint/validation/assertion: to check if the title is correct or not: act vs exp result:
		
		//Automation steps + Checkpoint = Automation Testing
		
		if(acTitle.equals("Google")) {
			System.out.println("title is correct: PASS");
		}
		else {
			System.out.println("title is Incorrect: FAIL");
		}
		
		//close the browser
		
		
		driver.quit();
	}

}
