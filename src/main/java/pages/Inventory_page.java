package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class Inventory_page {
	

	
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-success')])[2]")
	public WebElement create_button;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div/div[1]/div/div/div/app-inventory/div/div[2]/div/table/tr[1]/td/input")
	public WebElement order_reference_id;
	
	@FindBy(xpath="//div[text()='Select Supplier']/following-sibling::select")
	public WebElement select_supplier;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div/div[1]/div/div/div/app-inventory/div/div[2]/div/table/tr[3]/td/div/input")
	public WebElement Quantity_item;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div/div[1]/div/div/div/app-inventory/div/div[2]/div/table/tr[4]/td/input")
	public WebElement Order_amount;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	public WebElement save_button;
	
	@FindBy(xpath="//tr[2]/td[2]")
	public WebElement table_content;
	
	WebDriver driver;

	
	
	public Inventory_page(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	public void create() {
		create_button.click();
	}
	
	public void orderreferenceId(String arg1) {
		order_reference_id.sendKeys(arg1);
	}
	
	public void selectsupplier() {
		Select  drop = new Select(select_supplier);
		drop.selectByVisibleText("MOCKTAIL");
	}

	public void Quantityitem(String arg3) throws InterruptedException {
		
		Quantity_item.clear();
		Thread.sleep(2000);
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//	        js.executeScript("arguments[0].value = arguments[1];", Quantity_item, arg3);
		Quantity_item.sendKeys(arg3);
		
	}

	
	public void Orderamount(String string) {
		Order_amount.clear();
		Order_amount.sendKeys(string);
	}
	
	public void save() {
		save_button.click();
	}
public int table_content1() {
	String val= table_content.getText();
    String result = val.replaceAll("\\s*bottle\\s*", "");
	int unitsi = Integer.parseInt(result);
	System.out.print(unitsi);
	return unitsi;
}


	
}