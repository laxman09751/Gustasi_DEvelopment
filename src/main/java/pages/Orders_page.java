package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Orders_page {
	
	@FindBy(xpath="(//ul[contains(@class,'nav navbar-top-links')]//a)[3]")
	public WebElement liveorders;
	
	@FindBy(xpath="//div[@class='quickactions c1']")
	public WebElement menu;
	
	@FindBy(xpath="//div[@class='quickactions c2']")
	public WebElement live_menu_orders;
	
	@FindBy(xpath="(//div[@class='item-content'])[1]")
	public WebElement marpizza;
	
	@FindBy(xpath="//div[text()='CHEESE & TOMATO PIZZA']")
	public WebElement cheesepizza;
	
	@FindBy(xpath="//div[text()='CHEESE & CORN']")
	public WebElement cornpizza;
	
	@FindBy(xpath="//button[text()=' Settle Now ']")
	public WebElement settlenow;
	
	@FindBy(xpath="(//button[contains(@class,'checkout-btn full')])[2]") 
	public WebElement ordernow;
	
	@FindBy(xpath="//*[@id=\\\"cart-pricing-area\\\"]/div[2]/div/div[1]/div/button")
	public WebElement settle;
	
	@FindBy(xpath="//*[@id=\\\"settle-modal\\\"]/div/div/div[1]/div[3]/button[3]")
	public WebElement cash;
	
	@FindBy(xpath="//*[@id=\\\"settle-modal\\\"]/div/div/div[1]/button[4]")
	public WebElement approvedcash;
	
	@FindBy(xpath="//*[@id=\"dineLocation\"]/div/div/div[1]/button")
	public WebElement dineclose;
	
	@FindBy(xpath="(//button[@class='nav-link order-tab'])[1]")
	public WebElement approvedbutton;
	
	@FindBy(xpath="(//div[@class='header']//div)[1]")
	public WebElement updateorder;
	
	@FindBy(xpath="//div[@class='quickactions c2']")
	public WebElement liveordersbutton;
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-sm')])[2]")
	public WebElement approvesettle;
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-lg')])[3]")
	public WebElement Billcash;
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-lg')])[1]")
	public WebElement Billcard;
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-lg')])[2]")
	public WebElement Billupi;
	
	@FindBy(xpath="//button[text()='Airtel Money']")
	public WebElement BillAirtel;
	
	@FindBy(xpath="(//label[text()='Percent']/following::input)[1]")
	public WebElement discount;
	
	@FindBy(xpath="//h4[text()='Total Amount']/following-sibling::h1")
	public WebElement totalamount;
	
	@FindBy(xpath="//h4[text()='Due']/following-sibling::h1")
	public WebElement dueamount;
	
	@FindBy(xpath="(//input[@name='discounttype'])[2]")
	public WebElement percent_radiobutton;
	
	@FindBy(xpath="(//div[@class='item-content'])[1]")
	public WebElement coco_item;
	
	@FindBy(xpath="(//div[@class='item-content'])[7]")
	public WebElement shai_paneer;

	WebDriver driver;

	
	public Orders_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickonliveorders() {
//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.elementToBeClickable(liveorders));
		liveorders.click();
	}
	public void clickonmenu() {
		menu.click();
	}
	public void margettia() {
		marpizza.click();
	}
	public void cheese() {
		cheesepizza.click();
	}
	public void corn() {
		cornpizza.click();
	}
	public void settlepayment() {
		settlenow.click();
	}
	public void order() {
		ordernow.click();
	}
	public void dine() {
		dineclose.click();
	}
	public void livemenu() {
		live_menu_orders.click();
	}
	public void approved() {
		approvedbutton.click();
		
	}
	public void update() {
		updateorder.click();
	}
	public void settle() {
		approvesettle.click();
	}
	public void cash() {
		Billcash.click();
	}
	
	public void card() {
		Billcard.click();
	}
	public void live_orders() {
		liveordersbutton.click();
	}
	public void enter_discount() throws InterruptedException {
		discount.clear();
		Thread.sleep(2000);
		discount.sendKeys("100");
		
		String tstring =totalamount.getText();
		String t=tstring.replace("₹", "");
		double totamount=Double.parseDouble(t);  
		System.out.println(totamount);
		String dstring = dueamount.getText();
		String d=dstring.replace("₹", "");
		double damount = Double.parseDouble(d);
		System.out.println("Total Amount after discount is"+damount);
		double discount_amount= totamount-damount;
		System.out.println("Discount amount applied"+discount_amount);
	}
	public void percent() throws InterruptedException {
		percent_radiobutton.click();
		discount.clear();
		Thread.sleep(2000);
		discount.sendKeys("10");
		
		String tstring =totalamount.getText();
		String t=tstring.replace("₹", "");
		double totamount=Double.parseDouble(t);  
		System.out.println(totamount);
		String dstring = dueamount.getText();
		String d=dstring.replace("₹", "");
		double damount = Double.parseDouble(d);
		System.out.println("Total Amount after discount is"+damount);
		double discount_amount= totamount-damount;
		System.out.println("Discount amount applied"+discount_amount);
	}
	public void item_teashop() throws InterruptedException {
		Thread.sleep(5000);
		for(int i=0;i<5;i++) {
			coco_item.click();
		}
	shai_paneer.click();
		}
	public void mouse_hover() {
		WebElement mainMenu = driver.findElement(By.xpath("//button[text()='PIZZA SHOP ']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu);
		WebElement subMenu=driver.findElement(By.xpath("//a[contains(text(),'TEASHOP')]"));
		actions.moveToElement(subMenu).click().build().perform();
		WebElement body = driver.findElement(By.tagName("body"));
		actions.moveToElement(body).build().perform();

	
	}

}
