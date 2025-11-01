package Selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class OpenCartTest5 {

	public static void main(String[] args) throws MalformedURLException {
	
		BrowserUtil5 brUtil = new BrowserUtil5();
		
		WebDriver driver = brUtil.initDriver("chrome");
		
	
		
	//	brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		URL url = new URL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.launchUrl(url);
		
		String actTitle = brUtil.getTitle();
		if(actTitle.equals("Account Login")) {
			System.out.println("Correct title");
		}
		
		String actUrl = brUtil.getPageUrl();
		if(actUrl.contains("?route=account/login")) {
			System.out.println("url is correct");
		}
		else {
			System.out.println("incorrect url");
		}
		
		brUtil.quitBrowser();

	}

}
