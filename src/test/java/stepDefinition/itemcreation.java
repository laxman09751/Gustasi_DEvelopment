package stepDefinition;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Factory.DriverFactory;
import io.cucumber.java.en.And;
import pages.Itemcreation_page;
import pages.Orders_page;
public class itemcreation {
	private WebDriver driver;
	
	
		@And("user click on Mystore")
		public void user_click_on_Mystore() throws InterruptedException {
			driver= DriverFactory.getDriver();
			Itemcreation_page icp = new Itemcreation_page(driver);
			Orders_page op= new Orders_page(driver);
			Thread.sleep(3000);
			op.threelines();
			WebElement iframe = icp.Mystore_button;
	        new Actions(driver)
	                .scrollToElement(iframe)
	                .perform();
			icp.mystore();
			icp.mystore();
		}
	    @And("user click on managemenu")
	    public void user_click_on_managemenu() throws InterruptedException {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	icp.managemenu();
	    	Thread.sleep(2000);
	    }
	    @And("user click on create item")
	    public void user_click_on_create_item() throws InterruptedException {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	icp.createitem();
	    }
	   
		@And("user uploads the image")
	    public void user_uploads_the_image() throws AWTException, InterruptedException {
	    	WebElement uploadButton = driver.findElement(By.cssSelector("input[type='file']"));
	        String currentDirectory = System.getProperty("user.dir");
	        String filePath = currentDirectory + "/src/main/resources/Images_items/tt.png";
	    	uploadButton.sendKeys(filePath);
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[text()=' Done ']")).click();
	        
	    }
	    @And("user Enters the Title of the item {string}")
	    public void user_Enters_the_Title_of_the_item(String arg) {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	icp.title(arg);
	    }
	    @And("user gives description of the item {string}")
	    public void user_give_description_of_the_item(String arg1) throws InterruptedException {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	Thread.sleep(1000);
	    	icp.shortdescription(arg1);
	    }
	    @And("user selects item menu type")
	    public void user_selects_item_menu_type() throws InterruptedException {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	icp.itemmenutype();
	    	Thread.sleep(2000);
	    }
	    @And("user selects category of the item")
	    public void user_selects_category_of_the_item() throws InterruptedException {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	icp.category(); 	
	    	Thread.sleep(2000);
	    }
	    @And("user selects the organic or Glutenfree")
	    public void user_selects_the_organic_or_Glutenfree() throws InterruptedException  {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	icp.organicandgluten();
	    	Thread.sleep(2000);
	    }
	    @And("user selects food avail")
	    public void user_selects_food_avail() throws InterruptedException {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	icp.foodavail();
	    	Thread.sleep(2000);
	    }
	    @And("user selects foodtype")
	    public void user_selects_foodtype() throws InterruptedException {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	icp.vegetarian();
	    	Thread.sleep(2000);
	    }
	    @And("user enter the price of the item {string}")
		public void user_enter_the_price_of_the_item(String arg3) throws InterruptedException  {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
			icp.price(arg3);
			Thread.sleep(2000);
			
		}
	    @And("saves the item")
	    public void saves_the_item() throws InterruptedException {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	icp.save();
	    	Thread.sleep(2000);
	    }
	    @And("item saves succesfully")
	    public void item_saves_succesfully() throws InterruptedException {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	Thread.sleep(2000);
	    	icp.ok();
	    }
	    @And("make the item publish")
	    public void make_the_item_publish() throws InterruptedException {
	    	Itemcreation_page icp = new Itemcreation_page(driver);
	    	Thread.sleep(2000);
	    	icp.publishing();Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[2]/div[7]/div/button")).click();
	    }
}
