package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTest1 {

	public static void main(String[] args) {
	
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\SelTest\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		//chrome on windows (0175bc5c769f05914489e7811a734660)
		
		String title = driver.getTitle();//chrome on windows (0175bc5c769f05914489e7811a734660)
		
		System.out.println(title);
		
		String url = driver.getCurrentUrl();//chrome on windows (0175bc5c769f05914489e7811a734660)
		
		System.out.println(url);
		
	//	driver.quit();//chrome on windows (0175bc5c769f05914489e7811a734660)
		
		///after quit Session id is null. ChromeDriver: chrome on windows (null)
		
		driver.close(); //session id is invalid(0175bc5c769f05914489e7811a734660)
	
		
		System.out.println(driver.getTitle());// invalid session id 0175bc5c769f05914489e7811a734660
	}

}
