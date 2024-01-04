package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Logout_page{
	
	@FindBy(xpath="//a[@class='dropdown-toggle profile-pic']")
	public WebElement name;
	
	@FindBy(xpath="//a[contains(.,'Logout')]")
	public WebElement logout;
	
	@FindBy(xpath="//div[contains(@class,'menu__btn d-none')]//a[1]")
	public WebElement loggin;

WebDriver driver;

public Logout_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void name_as_login() throws InterruptedException {
	Login_page log = new Login_page(driver);
	log.clickloginElements();
	Thread.sleep(2000);
	log.sendusername("123233211");
	Thread.sleep(2000);
	log.sendpassword("12345678");
	Thread.sleep(2000);
	log.loginbutton();
	Thread.sleep(2000);
	
	
}

public void click_on_logout() throws InterruptedException {
	name.click();
	Thread.sleep(2000);
	logout.click();
}

public String check_login() throws InterruptedException {
	Thread.sleep(3000);
	return loggin.getText();
}
}