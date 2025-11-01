package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

	//handle Auth popup
	//basic Auth: username/password
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		//it will not work if username/password contains @
		
		String username = "admin";
		String password = "admin";
		
	//	1st Approach
	//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	//	driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		//2nd Approach using HasAuthenticator Interface
		
		//selenium 4.x 
		//basic Auth: it will work for un/pwd with @a also
		//it will work only for chromium based browsers: chrome, edge
		((HasAuthentication)driver).register(()-> new UsernameAndPassword(username, password));
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		String mesg = driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println(mesg);
		
		

	}

}
