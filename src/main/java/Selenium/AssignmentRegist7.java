package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignmentRegist7 {

	public static void main(String[] args) {
		
		BrowserUtil5 brUtil = new BrowserUtil5();
		WebDriver driver = brUtil.initDriver("chrome");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		ElementUtil6 eleUtil = new ElementUtil6(driver);
		
		//1. by id
		By firstname = By.id("input-firstname");
		
		eleUtil.doSendKeys(firstname, "rajesh");
		
		//2. by name
		
		By lastname = By.name("lastname");
		
		eleUtil.doSendKeys(lastname, "hegde");
		
		//3. By id
		
		By email = By.id("input-email");
		eleUtil.doSendKeys(email, "rajesh_hegde@gmail.com");
		
		//4. by name
		
		By telephone = By.name("telephone");
		
		eleUtil.doSendKeys(telephone, "9845712345");
		
		//5. by xpath
		
		By xpathpwd = By.xpath("//*[@id=\"input-password\"]");
		
		eleUtil.doSendKeys(xpathpwd, "test@123");
		
		//6. by cssSelector
		
		By cssconfirm = By.cssSelector("#input-confirm");
		
		eleUtil.doSendKeys(cssconfirm, "test@123");
		
		//7. by xpath
		
		By xpathagree = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		
		eleUtil.doClick(xpathagree);
		
		//8. by xpath
		
		By xpathxcontinue= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		eleUtil.doClick(xpathxcontinue);
		
		//9. by tagname
		
		By headertext = By.tagName("h1");
		
		String header = eleUtil.getElementText(headertext);
		if(header.equals("Your Account Has Been Created!")) {
			System.out.println(" header is correct-- PASS");
		}
		else {
			System.out.println("header is incorrect -- FAIL");
		}
		
		String actTitle =brUtil.getTitle();
		if(actTitle.equals("Your Account Has Been Created!")) {
			System.out.println("Page title is correct-- PASS");
		}
		else {
			System.out.println("Page title is incorrect-- FAIL");
		}

		String currentUrl =brUtil.getPageUrl();
		
		if(currentUrl.contains("route=account/success")) {
			System.out.println("page url is correct-- PASS");
		}
		else {
			System.out.println("page url is incorrect-- FAIL");
		}
		
		//10. by linktext
		
		By logout = By.linkText("Logout");
		
		eleUtil.doClick(logout);
		
		//11. logout
		
		brUtil.quitBrowser();
	}
     
}
