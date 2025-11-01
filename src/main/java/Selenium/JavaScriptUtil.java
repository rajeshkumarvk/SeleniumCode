package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	private WebDriver driver;
	private JavascriptExecutor js;
	
	public JavaScriptUtil(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor)this.driver;
	}

	
	public String getTitleByJS() {
	return js.executeScript("return document.title;").toString();
	}
	
	public String getUrlByJS() {
	return js.executeScript("return document.URL;").toString();
		
	}
	
	public void refreshBrowserByJS() {
		js.executeScript("return history.go(0);");
	}
	
	public void navigateToBackPage() {
		js.executeScript("return history.go(-1);");
	}
	
	public void navigateToForwardPage() {
		js.executeScript("return history.go(1)");
	}
	
	public void generateJSAlert(String mesg) {
		js.executeScript("alert('"+mesg+"')");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		driver.switchTo().alert().dismiss();
	
	}
	
	public String getPageInnerText() {
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	public void scrollPageDown() {
		
		js.executeScript("return window.scrollTo(0, document.body.scrollHeight);");
		
	}
	
	public void scrollPageDown(String height) {
		
		js.executeScript("return window.scrollTo(0, '"+height+"');");
		
	}
	
	public void scrollPageUp() {
		
		js.executeScript("return window.scrollTo(document.body.scrollHeight, 0);");
		
	}
	
		
	public void scrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void drawBorder(WebElement element) {
		js.executeScript("arguments[0].style.border='3px solid red';", element);
		
	}
	
	public void flash(WebElement element) {
	String bgcolor = element.getCssValue("backgroundColor");
	for(int i =0; i<7; i++) {
		changeColor("rgb(0,200,0)", element);
		changeColor(bgcolor, element);
	}
	
	
		
	}
	public void changeColor(String color, WebElement element) {
			js.executeScript("arguments[0].style.backgroundColor = '"+ color +"'", element);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			
			
			}
	}
	
	public void zoomChromeEdgeFirefox(String zoompercentage) {
		js.executeScript("document.body.style.zoom='"+zoompercentage+"%'");
	}
	
	public void zoomFirefox(String zoompercentage) {
		js.executeScript("document.body.style.MozTransform='scale("+zoompercentage+"%)'");
	}
	
	public void clickElementByJS(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}
	
	public void sendKeysUsingWithIdByJS(String id, String value) {
		js.executeScript("document.getElementbyId('"+id+"').value='"+value +"'");
	}
}
