package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class analytics_page {
	
	@FindBy(xpath="//a[@routerlink='/Analytics']")
	public WebElement analytics_button;
	
	@FindBy(xpath="//select[@class='form-control']")
	public WebElement form_control;
	
	@FindBy(xpath="(//ng-select[@bindlabel='title']//div)[1]")
	public WebElement select_menu_input;
	
	@FindBy(xpath="//button[@class='btn btn-info']")
	public WebElement show_button;
	
	@FindBy(xpath="(//div[@class='ng-option'])[1]")
	public WebElement pizza_shop_select;
	
	 WebDriver driver;
	public analytics_page(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

}
