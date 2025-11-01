package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser2 {
	
	static WebDriver driver; //null
	public static void main(String[] args) {
		
	String browser ="EDge";
	
	switch (browser.trim().toLowerCase()) {
	case "chrome":
		driver = new ChromeDriver();
		System.out.println("launch chrome");
		break;
		
	case "firefox":
		driver = new FirefoxDriver();
		System.out.println("launch firefox");
		break;
		
	case "edge":
		System.setProperty("SE_MSEDGEDRIVER_MIRROR_URL", "https://msedgedriver.microsoft.com");
		driver = new EdgeDriver();
		System.out.println("launch edge");
		break;

	case "safari":
		driver = new SafariDriver();
		System.out.println("launch safari");
		break;
	
	default:
		System.out.println("plz enter the correct browser");
		throw new RuntimeException("---INVALID BROWSER---");
		
	}
		
					
		driver.get("https://google.com");
		
		String acTitle =driver.getTitle();
		System.out.println("the title is : " +acTitle);
		
		if(acTitle.equals("Google")) {
			System.out.println("title is correct : PASS");
		}
		else {
			System.out.println("title is incorrect : FAIL");
		}
		
		driver.quit();
		}
		
	

	}


