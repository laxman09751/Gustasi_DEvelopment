package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;




public class Login_page {
	

	WebDriver driver;
	
	By loginElement = By.xpath("//a[contains(text(),'Login')]");
	
	By userIdElement= By.id("username");
	
	By passElement = By.id("password");
	
	By loginButtonElement = By.xpath("//button[@class='btn red-aquare-btn']");
	
	By logoutBy = By.xpath("//*[@id=\"wrapper\"]/nav/div/ul[2]/li[2]/a/b");
	
	By logout=By.xpath("//*[@id=\"wrapper\"]/nav/div/ul[2]/li[2]/ul/li[3]/a");
	
	By getusername = By.xpath("//b[text()='LAKSHMAN K ']");
	
	By invalid = By.xpath("//p[@class='iziToast-message slideIn']");
	

	public Login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	public  void clickloginElements() throws InterruptedException {
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(loginElement).click();
		Thread.sleep(1000);
	}	
	public void sendusername(String arg1) throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(userIdElement).sendKeys(arg1);
		Thread.sleep(1000);
	}
	public void sendpassword(String arg2) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(passElement).sendKeys(arg2);	
		Thread.sleep(1000);
	}
	public void loginbutton() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(loginButtonElement).click();
		Thread.sleep(1000);
	}
	public void invalidcred() throws InterruptedException {
		Thread.sleep(2000);
		String st =driver.findElement(invalid).getText();	
		System.out.println(st);
	}
	public void getusername() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(driver.findElement(getusername));
	}
}