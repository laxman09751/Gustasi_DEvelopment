package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Itemcreation_page {
	
	
	@FindBy(xpath="//a[contains(@class,'open-close hidden-xs')]")
	public WebElement threelines_link;
	
	@FindBy(xpath="//span[text()='My Store ']")
	public WebElement Mystore_button;
	
	@FindBy(xpath="//a[contains(text(),'Manage Menu')]")
	public WebElement managemenu_button;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	public WebElement create_item_button;
	
	@FindBy(xpath="//input[@formcontrolname='title']")
	public WebElement title_text;
	
	@FindBy(xpath="//input[@formcontrolname='sDesc']")
	public WebElement short_text;
	
	@FindBy(xpath="//select[@formcontrolname='menuCatCode']")
	public WebElement item_dropdown;
	
	@FindBy(xpath="//select[@formcontrolname='menucourse']")
	public WebElement categorin_dropdwon;
	
	@FindBy(css="input[name='gluten']")
	public WebElement glutenfree_label;
	
	@FindBy(css="input[name='organic']")
	public WebElement orgainc_label;
	
	@FindBy(xpath="//label[text()='Breakfast']")
	public WebElement breakfast_label;
	
	@FindBy(xpath="//label[text()='Brunch']")
	public WebElement Brunch_label;
	
	@FindBy(xpath="//label[text()='Lunch']")
	public WebElement lunch_label;

	@FindBy(xpath="//label[text()='Snack']")
	public WebElement snack_label;
	
	@FindBy(xpath="//label[text()='Dinner']")
	public WebElement Dinner_label;
	
	@FindBy(xpath="//label[text()='Supper']")
	public WebElement Supper_label;
	
	@FindBy(xpath="(//input[@name='foodType'])[1]")
	public WebElement meat_radio;
	
	@FindBy(xpath="(//input[@name='foodType'])[2]")
	public WebElement Vegetarian_radio;
	
	@FindBy(xpath="(//input[@name='foodType'])[3]")
	public WebElement vegan_radio;
	
	@FindBy(xpath="//input[@formcontrolname='price']")
	public WebElement price_text;
	
	@FindBy(xpath="//input[@formcontrolname='excludeTaxes']")
	public WebElement excludefromtaxes_radio;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement save_button;
	
	@FindBy(xpath="//button[text()='OK']")
	public WebElement Ok_button;
	
	@FindBy(xpath="//*[@id=\"items-list\"]/div[8]/div/div[2]/div/label/span")
	public WebElement unpulish_button;
	
	@FindBy(xpath="(//span[@class='slider round'])[8]")
	public WebElement pineapple_item;
	
	WebDriver driver;

	public Itemcreation_page(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	public void threelines() {
		threelines_link.click();
		
        
	}
	
	public void mystore() {
		Mystore_button.click();
	}
	public void managemenu() {
		managemenu_button.click();
	}
	public void createitem() throws InterruptedException {
		create_item_button.click();
		Thread.sleep(2000);
	}
	public void title(String arg1) {
		title_text.sendKeys(arg1);
	}
	public void shortdescription(String arg2) {
		short_text.sendKeys(arg2);
	}
	
	public void itemmenutype() {
		Select dropdown = new Select(item_dropdown);
        dropdown.selectByVisibleText("PIZZA SHOP");
	}
	public void category() {
		Select dropdown = new Select(categorin_dropdwon);
        dropdown.selectByVisibleText("PIZZA");
	}
	
	public void organicandgluten() throws InterruptedException {
		//WebElement element = driver.findElement(By.cssSelector("input[name='organic']"));
		//element.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orgainc_label);
        Thread.sleep(2000);
		orgainc_label.click();
		Thread.sleep(2000);
		glutenfree_label.click();
	}
	public void foodavail() {
		breakfast_label.click();
		Brunch_label.click();
		lunch_label.click();
		snack_label.click();
		Dinner_label.click();
		Supper_label.click();
	}
	public void meat() {
		meat_radio.click();
	}
	public void vegetarian() {
		Vegetarian_radio.click();
	}
	public void vegan() {
		vegan_radio.click();
	}
	public void price(String arg3) {
		price_text.sendKeys(arg3);
	}
	public void excludefromtaxes() {
		excludefromtaxes_radio.click();
	}
	public void save() {
		save_button.click();
	}
	public void ok() {
		Ok_button.click();
	}
	public void publishing() {
		System.out.println("Item created successfully");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		pineapple_item.click();
	}
}
