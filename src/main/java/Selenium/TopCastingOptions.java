package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class TopCastingOptions {
	
	

	public static void main(String[] args) {
	
	//1. chromeDriver to chromeDriver
	//Valid not recommended
	//ChromeDriver driver = new ChromeDriver();
	
	//2. Topcasting
	//WebDriver to ChromeDriver
	//Valid and recommended- for local execution
	//WebDriver driver = new ChromeDriver();
	
	//3. SearchContext to ChromeDriver
	//Valid but not recommended since it can access only two(FE and FES)
	//SearchContext driver = new ChromeDriver();
	
	//4. WebDriver to RemoteWebDriver
	//Valid and recommended for remote execution. when we want to run the testcases in remote machine, cloud, AWS, grid.
	//WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities); //os/browser
		
		
	//5.SearchContext to RemoteWebDriver
		//Valid but not recommended
	//	SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
		
	//6. RemoteDriver to ChromeDriver
		//Valid for local execution - not used because of other interface cannot be accessed(such as JavaScript Executor)
		//RemoteWebDriver driver = new ChromeDriver();
		
		//7. ChromiumDriver to ChromeDriver
		//Valid but not recommended because you can execute for Chrome and Edge drivers only
		//ChromiumDriver driver = new ChromeDriver();
	
	//8.RemoteWebDriver to RemoteWebdriver
		//Valid for only remote execution but recommended
		//RemoteWebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);

}
}