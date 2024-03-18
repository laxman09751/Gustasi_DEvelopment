package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Inventory_page;
import pages.Login_page;
import pages.Orders_page;

public class Inventory {
	
	
	
	private WebDriver driver;
	public Login_page lp = new Login_page(driver);
	
	@When("Scroll to ManageInvetory")
	public void scroll_to_manage_invetory() throws InterruptedException {
		driver= DriverFactory.getDriver();
		Thread.sleep(2000);
		Orders_page op= new Orders_page(driver);
		Thread.sleep(3000);
		op.threelines();
		Thread.sleep(3000);
		//op.inventory();
		//Thread.sleep(3000);
		WebElement iframe = driver.findElement(By.xpath("//a[contains(text(),'Manage Inventory')]"));
        new Actions(driver)
                .scrollToElement(iframe)
                .perform();
		Thread.sleep(4000);
		op.manageinventroy();
		Thread.sleep(2000);
	}

	@When("Click on create for inventory")
	public void click_on_create_for_inventory() throws InterruptedException {
		Inventory_page ip = new Inventory_page(driver);
		ip.create();
		Thread.sleep(3000);
	}
	@When("Enter the Order_ID {string}")
	public void enter_the_order_id(String string) {
		Inventory_page ip = new Inventory_page(driver);
		ip.orderreferenceId(string);
	}

	@When("Select the supplier Mocktail")
	public void select_the_supplier_mocktail() {
		Inventory_page ip = new Inventory_page(driver);
		ip.selectsupplier();
	}
	@When("Enter the Quantity {string}")
	public void enter_the_quantity(String int1) throws InterruptedException {
		Inventory_page ip = new Inventory_page(driver);
		Thread.sleep(2000);	
		ip.Quantityitem(int1);
	}
	@When("Enter the order Amount {string}")
	public void enter_the_order_amount(String string) throws InterruptedException {
		Inventory_page ip = new Inventory_page(driver);
		ip.Orderamount(string);
		Thread.sleep(3000);
	}
	@When("clicks on Save")
	public void clicks_on_save() throws InterruptedException {
	    Inventory_page ip= new Inventory_page(driver);
	    Thread.sleep(2000);
	    ip.save();
	}

	@When("check the units added in the inventory")
	public void check_the_units_added_in_the_inventory() {
		Inventory_page ip = new Inventory_page(driver);
		ip.table_content1();
	}

}
