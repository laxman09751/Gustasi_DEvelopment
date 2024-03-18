package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_signup_page {
	@FindBy(xpath="//input[@formcontrolname='first_name']")
	public WebElement First_name_Element;
	
	@FindBy(xpath="//input[@formcontrolname='last_name']")
	public WebElement Last_name_Element;
	
	@FindBy(xpath="//input[@formcontrolname='phone']")
	public WebElement phone_number_Element;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	public WebElement email_Element;
	
	@FindBy(xpath="//input[@formcontrolname='pwd']")
	public WebElement password_Element;
	
	@FindBy(xpath="//input[@formcontrolname='location']")
	public WebElement City_Element;
	
	@FindBy(id="termcond1")
	public WebElement Term_conditions_Element;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Signup_Element;
	
	@FindBy(xpath="(//div[contains(@class,'menu__btn d-none')]//a)[2]")
	public WebElement dashboard_Element;
	
	@FindBy(xpath="//b[text()='Gustasi Customer ']")
	public WebElement customer_name_Element;
	
	WebDriver driver;
	
	
	public Customer_signup_page(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	public void firstname(String arg1) {
		First_name_Element.sendKeys(arg1);
	}
	public void lastname(String arg2) {
		Last_name_Element.sendKeys(arg2);
	}
	public void phonenumber(String arg3) {
		phone_number_Element.sendKeys(arg3);
	}
	public void email(String arg4) {
		email_Element.sendKeys(arg4);
	}
	public void password(String arg5) {
		password_Element.sendKeys(arg5);
	}
	public void city(String arg6) {
		City_Element.sendKeys(arg6);
	}
	public void termconditions() {
		Term_conditions_Element.click();
	}
	public void signup() {
		Signup_Element.click();
	}
	public void dashboard() {
		dashboard_Element.click();
	}
	public void customername() {
		customer_name_Element.click();
	}
	

}
