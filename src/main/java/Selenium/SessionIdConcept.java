package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIdConcept {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver(); //sesssion id 123
		driver.get("https://www.google.com");//sesssion id 123
		
		String actTitle = driver.getTitle();//sesssion id 123
		
		System.out.println(actTitle);
		
		//driver.quit();//sesssion id 123\
		//after quit the session is NULL
		
		System.out.println(driver.getTitle());//sesssion id NUll
		driver.close(); //session id 123 but invalid
		
		System.out.println(driver.getTitle());//sesssion id invalid

	}

}
