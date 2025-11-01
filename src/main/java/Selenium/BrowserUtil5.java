package Selenium;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author 
 */
public class BrowserUtil5 {
	
	private WebDriver driver;
	
	/**
	 * this is used to init the driver on the basis of the browser name: chrome, firefox, edge, safari
	 * @param browserName
	 * @return it returns the driver
	 */
	public WebDriver initDriver(String browserName) {
		
		System.out.println("browser name : " +browserName);
		
		switch (browserName.trim().toLowerCase()) {
		
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("please pass the correct browser");
			throw new BrowserException("======INVALID BROWSER===");
			
		}
		
		return driver;
		
	}
	
	
	public void launchUrl(String url) {
		nullCheck(url);
		lengthCheck(url);
		httpCheck(url);
		driver.get(url);
	}
	
	public void launchUrl(URL url) {
		String appUrl= String.valueOf(url);
		nullCheck(appUrl);
		lengthCheck(appUrl);
		httpCheck(appUrl);
		driver.navigate().to(url);
	
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		System.out.println("page title is " +title);
		return title;
	}
	
	
	public String getPageUrl() {
		String pageUrl = driver.getCurrentUrl();
		System.out.println("page url  is " +pageUrl);
		return pageUrl;
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();	
			System.out.println("browser is closed");
		}
		
	}
	
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
			System.out.println("browser is closed");
		}
	}
	
	private void nullCheck(String value) {
		if(value==null) {
			System.out.println("the null value is not allowed" +value);
			throw new BrowserException("===NULL VALUE===");
		}
		
	}
	private void lengthCheck(String value) { 
		if(value.length()==0) {
			System.out.println("the url length cannot be blank " +value);
			throw new BrowserException("===BLANK URL===");
			
		}
		
	}
	
	private void httpCheck(String urlValue) {
		if(urlValue.indexOf("http")!=0) {
			System.out.println("the http is missing " +urlValue);
			throw new BrowserException("===HTTP is missing===");
		}
		
	}
	}
	

