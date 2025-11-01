package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil6 {
	
	private WebDriver driver;
	private Actions act;
	
	public ElementUtil6(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
		
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	private void nullCheck(CharSequence... value) {
		if(value==null) {
			throw new RuntimeException("===VALUE CANNOT BE NULL========");
		}
	}
	public void doSendKeys(By locator,String value) {
		nullCheck(value);
		getElement(locator).sendKeys(value);
	}
	
	public void doSendKeys(By locator,CharSequence... value) {
		nullCheck(value);
		getElement(locator).sendKeys(value);
	}
	
	public String getElementText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println(eleText);
		return eleText;
	}
	
	public  String getElementDOMAttributeValue(By locator , String attrName) {
		nullCheck(attrName);
		return getElement(locator).getDomAttribute(attrName);
	}
	
	public  String getElementDOMPropertyValue(By locator, String propName) {
		nullCheck(propName);
		return getElement(locator).getDomProperty(propName);
	}
	
	public boolean IsElementDisplayed(By locator) {
		try{
			return getElement(locator).isDisplayed();
		}
		
		catch(NoSuchElementException e) {
			System.out.println("element is not present " +locator);
			return false;
		}
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//====================For list of WebElements(findElements Utils)====================================
	
	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		
		List<String> eleTextList = new ArrayList<String>(); //pc=0
		
		for(WebElement e: eleList) {
			String text = e.getText();
			if(text.length()!=0) {
			System.out.println(text);
			eleTextList.add(text);
		}
			
		}
		return eleTextList;
	}
	
	public int getElementsCount(By locator) {
		int eleCount= getElements(locator).size();
		System.out.println("element count " +eleCount);
		return eleCount;
	}
	
	public  boolean getElementDisplayed(By locator) {
		if(getElements(locator).size()==1) {
			System.out.println("element : " +locator +" is dispalyed once in the page");
			return true;
		}
		return false;
	}
	
	public boolean getElementDisplayed(By locator, int expElementCount) {
		if(getElements(locator).size()==expElementCount) {
			System.out.println("element : " +locator +" is dispalyed " +expElementCount +" times in the page");
			return true;
		}
		return false;
	}
	
	public void clickElement(By locator, String value) {
		List <WebElement> eleList =getElements(locator);
		System.out.println("the total number of elements : "+eleList.size());
		for(WebElement e:eleList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}
	
	public void clickElement(By locator,  By query, String value) throws InterruptedException {
		getElement(locator);
		Thread.sleep(3000);
		
		List<WebElement> eleList = getElements(locator);
		for(WebElement e: eleList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
//	==================select class dropdown Utils====================================
	

	public  boolean doSelectDropDownbyIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		try{
			
			select.selectByIndex(index);
			return true;
		}
		catch(NoSuchElementException e) {
			System.out.println(index + " is not present");
			return false;
		}
		
	}
	
	public  boolean doSelectDropDownbyVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		try{
			select.selectByVisibleText(visibleText);
			return true;
		}
		catch(NoSuchElementException e) {
			System.out.println(visibleText + " is not present");
			return false;
		}
	}
	
	public  boolean doSelectDropDownbyValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		try{
			select.selectByVisibleText(value);
			return true;
		}
		catch(NoSuchElementException e) {
			System.out.println(value + " is not present");
			return false;
		}
	}
	//To print if the selected option is selected or not(boolean- true or false)
	public  boolean selectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		boolean flag = false;
		for(WebElement e: optionsList) {
			String text = e.getText();
		//	System.out.println(text);
			if(text.equals(value)) {
				e.click();
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(value +" is selected");
			return true;
		}
		else {
			System.out.println(value + " is not selected");
			return false;
		}
	}
	
	//To get the text of the all the elements of the list
	
	public  List<String> getDropDownValueList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList =select.getOptions();
		System.out.println(optionsList.size());
		
		List<String> optionsValList = new ArrayList<String>();
		for(WebElement e: optionsList) {
			String text = e.getText();
			optionsValList.add(text.trim());
			
		}
		
		return optionsValList;
	}
	
	//Method Overloading- to get the list and verify it the expected list of the total list matches or not
	
	public  boolean getDropDownValueList(By locator, List<String> exOptionsList) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList =select.getOptions();
		System.out.println(optionsList.size());
		
		List<String> optionsValList = new ArrayList<String>();
		for(WebElement e: optionsList) {
			String text = e.getText();
			optionsValList.add(text.trim());
			
		}
		
		if(optionsValList.containsAll(exOptionsList)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	


//============================drop down utils- for non select based========================

/**
 * this method used to select choices with 3 different use cases
 * 1. Single Selection: selectChoice(choice, choiceList, "choice 2")
 * 2. Multiple Selection: selectChoice(choice, choiceList, "choice 2" ,"choice 3", "choice 6 2 1");
 * 3. All Selections: use all/ALL to select all choices: selectChoice(choice, choiceList, "all");
 * @param choice
 * @param choiceList
 * @param choiceValue
 * @throws InterruptedException
 */
	public void selectChoice(By choice, By choiceList, String...choiceValue) throws InterruptedException {
			//driver.findElement(choice).click();
		doClick(choice);
		Thread.sleep(2000);
	
		List<WebElement> choices = getElements(choiceList);
		System.out.println(choices.size());
		
		if(choiceValue[0].equalsIgnoreCase("all")) {
			//logic: to select all choices
			for(WebElement e:choices ) {
				e.click();
			}
		}
		else {
			
		}
		for(WebElement e: choices) {
			String text =e.getText();
			System.out.println(text);
			
			for(String value :choiceValue) {
				if(text.trim().equals(value)) {
					e.click();
					break;
				}
			}
		}
	}
	//==============================Action Utils =====================================
	
	public void doMoveToElement(By locator) throws InterruptedException {
		act.moveToElement(getElement(locator)).build().perform();
		Thread.sleep(2000);
		
	}
	public void handle4LevelMenu(By firstLevelMenu, By secondLevelMenu, By thirdLevelMenu, By forthLevelMenu) throws InterruptedException {
		
		doClick(firstLevelMenu);
		Thread.sleep(2000);
		doMoveToElement(secondLevelMenu);
		Thread.sleep(2000);
		doMoveToElement(thirdLevelMenu);
		Thread.sleep(2000);
		doClick(forthLevelMenu);
	}
	
	public void handleParentSubMenu(By parentMenu, By subMenu) throws InterruptedException {
		
		doMoveToElement(parentMenu);
		Thread.sleep(2000);
		doClick(subMenu);
	}
	
	
	public void doActionSendKeys(By locator, String value) {
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public void doActionsClick(By locator) {
		act.click(getElement(locator)).perform();
	}
	
	public void doSendKeysWithPause(By locator, String value, long pauseTime) {
		char val[]= value.toCharArray();
		for(char ch : val) {
			act
				.sendKeys(getElement(locator), String.valueOf(ch))
					.pause(pauseTime)
						.build()
							.perform();
		}
	}
	//=========================Wait utils==============================================
	
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public List<WebElement> waitForAllElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible. 
	Visibility means that the elements are not only displayed but also have a height and width that is greater than 0
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public List<WebElement> waitForAllElementsVisibility(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public WebElement waitForElementVisibility(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		
	}
	
	/**
	 * An expectation for checking an element is visible and enabled such that you can click it.
	 * @param locator
	 * @param timeOut
	 */
	
	public void clickWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
					
	}
	
	public void clickWithWait(By locator, int timeOut) {
		
		waitForElementVisibility(locator, timeOut).click();
		
	}
	
	public void sendKeysWithWait(By locator, int timeOut, CharSequence...value) {
		waitForElementVisibility(locator, timeOut).sendKeys(value);
		
	}
	
	//=============Wait for Alerts============================
	
	public  Alert waitForAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.pollingEvery(Duration.ofSeconds(timeOut))
			.ignoring(NoAlertPresentException.class)
			.withMessage("===js alert is not present=====");
		return wait.until(ExpectedConditions.alertIsPresent());
		
		
	}
	
	public  void acceptAlert(int timeOut) {
		waitForAlert(timeOut).accept();
		
		
	}
	
	public  void dismissAlert(int timeOut) {
		waitForAlert(timeOut).dismiss();
		
		
	}
	
	public  void getTextAlert(int timeOut) {
		waitForAlert(timeOut).getText();
		
		
	}
	
	public  void sendKeysAlert(int timeOut, String value) {
		waitForAlert(timeOut).sendKeys(value);
		
		
	}
	
	//==============wait for Title =======================================
	
	public  String waitForTitleContains(String fractionTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{
			wait.until(ExpectedConditions.titleContains(fractionTitle)) ;
				return driver.getTitle();
		}
		catch(TimeoutException e) {
			return null;
		}
		
	}
	
	public  String waitForTitleIs(String Title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{
			wait.until(ExpectedConditions.titleIs(Title)) ;
				return driver.getTitle();
		}
		catch(TimeoutException e) {
			return null;
		}
		
	}
	
	//=========wait for URL==================================
	
	public  String waitForUrlContains(String fractionURL, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{
			wait.until(ExpectedConditions.urlContains(fractionURL));
				return driver.getCurrentUrl();
		}
		catch(TimeoutException e) {
			return null;
		}
		
	}
	
	public  String waitForUrlIs(String URL, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{
			wait.until(ExpectedConditions.titleIs(URL)) ;
				return driver.getCurrentUrl();
		}
		catch(TimeoutException e) {
			return null;
		}
		
	}
	
	//==============Wait for Frames=================================
	
	public  void waitForFrameandSwitchToIt(By frameLocator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		
	}

	
	public void waitForFrameandSwitchToIt(String frameLocator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		
	}

	public  void waitForFrameandSwitchToIt(int index, int timeOut) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	
}
	
	public  void waitForFrameandSwitchToIt(WebElement element, int timeOut) {
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	
}
	
	public WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int pollingTime) {
		
	Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(timeOut))
								.pollingEvery(Duration.ofSeconds(pollingTime))
								.ignoring(NoSuchElementException.class)
								.ignoring(StaleElementReferenceException.class)
								.withMessage("==No Element found===");
	
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	}
	
	public WebElement waitForElementPresenceWithFluentWait(By locator, int timeOut, int pollingTime) {
		
	Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(timeOut))
								.pollingEvery(Duration.ofSeconds(pollingTime))
								.ignoring(NoSuchElementException.class)
								.ignoring(StaleElementReferenceException.class)
								.withMessage("==No Element found===");
	
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	}
}