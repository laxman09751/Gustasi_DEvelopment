package utils;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	 WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnElement(WebElement element,long durationInseconds) {
		
		WebElement webElement= waitForElement(element,durationInseconds);
		
		
		webElement.click();
	}
	
	public void typeTextintoELement(WebElement element, String texttobeTyped,long durationInSeconds) {
		
		WebElement webElement=waitForElement(element,durationInSeconds);
		webElement.click();
		webElement.clear();
		webElement.sendKeys(texttobeTyped);
		
	}
	
	public WebElement waitForElement(Object object,long durationInseconds) {
		WebElement webElement= null;
		try {
			
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInseconds));
		webElement= wait.until(ExpectedConditions.elementToBeClickable((By) object));
		
		}
		catch(Throwable e) {
			e.printStackTrace();
			
		}
		return webElement;
	}
	public void selectOptionInDropdown(WebElement element, String dropDownOption,long durationInSeconds) {
		
		Select select = new Select(element);
		select.selectByVisibleText(dropDownOption);

	}
	
	public void accepetAlert(long durationInSeconds) {
		
		Alert alert = waitForAlert(durationInSeconds);
		alert.accept();
		
	}
	
	public void dismissAlert(long durationInSeconds) {
		Alert alert = waitForAlert(durationInSeconds);
		alert.dismiss();
	}
	public Alert waitForAlert(long durationInSeconds) {
		Alert alert= null;
		
		try {
			
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		 alert=wait.until(ExpectedConditions.alertIsPresent());
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	
	return alert;
	}
	
	public  void mouseHoverAndClick(WebElement element, long durationInSeconds) {
		
		WebElement webElement =waitForVisibilityofElement(element,durationInSeconds);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(webElement).click().build().perform();
		
	}
	public WebElement waitForVisibilityofElement(WebElement element, long durationInSeconds) {
		
		WebElement webElement=null;
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		 webElement =wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		return webElement;
	}
	public void javaScriptClick(WebElement element, long durationInSeconds) {
		WebElement webElement=waitForVisibilityofElement(element,durationInSeconds);
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].click();",webElement);
	}
	
	public void javaScriptType(WebElement element, long durationInSeconds,String textToBeTyped) {
		WebElement webElement=waitForVisibilityofElement(element,durationInSeconds);
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].value='"+textToBeTyped+"'",webElement);
		
	}
	public String getTextFromElement(WebElement element,long durationInSeconds) {
		
		WebElement webElement = waitForElement(element,durationInSeconds);
		return webElement.getText();
		
	}
	
	public boolean displayStatusOfElement(WebElement element,long durationInSeconds) {
		
		try {
			WebElement webElement = waitForElement(element,durationInSeconds);
			return webElement.isDisplayed();
		}catch(Throwable e) {
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
