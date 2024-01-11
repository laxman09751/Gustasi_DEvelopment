package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Login_page;
import pages.Orders_page;


public class Orders {
	
	WebDriver driver;
	
	@Given("User enters to the url")
	public void User_enters_to_the_url() throws InterruptedException {
		driver= DriverFactory.getDriver();
		Thread.sleep(2000);
		Login_page lp = new Login_page(driver);
		lp.clickloginElements(); 
		
	}
	@And("user enter the mobile {string}")
	public void user_enter_the_mobile(String string) throws InterruptedException {
		Login_page lp = new Login_page(driver);
		   lp.sendusername(string);
	}
	@And("user enter pass {string}")
	public void user_enter_pass(String string) throws InterruptedException {
		Login_page lp = new Login_page(driver);
		   lp.sendpassword(string);
	}
	@And("User clicked login button")
	public void user_clicked_login_button() throws InterruptedException {
		Login_page lp = new Login_page(driver);
	    lp.loginbutton();
	}
	
	@When("User clicks on Liveorders button")
	public void user_clicks_on_liveorders_button() throws InterruptedException {
	    Orders_page op= new Orders_page(driver);
	    Thread.sleep(2000);
	    op.clickonliveorders();;
	    
	}

	@When("User clicks on Menu button")
	public void user_clicks_on_menu_button() throws InterruptedException {
		Orders_page op= new Orders_page(driver);
		Thread.sleep(2000);
		op.clickonmenu();
	}

	@When("User press Escape key")
	public void user_press_escape_key() throws InterruptedException {
		Thread.sleep(2000);
	    Actions act = new Actions(driver);
	    act.sendKeys(Keys.ESCAPE).perform();
	    Thread.sleep(3000);
	  
	}

	@When("user selects the pizza items")
	public void user_selects_the_pizza_items() throws InterruptedException {
		Orders_page op= new Orders_page(driver);
		Thread.sleep(3000);
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.ESCAPE).perform();
		op.margettia();
		Thread.sleep(3000);
		 op.dine();
		 Thread.sleep(3000);
		op.cheese();
		Thread.sleep(2000);
		op.corn();
		Thread.sleep(5000);
	}
	@When("user orders from ordernow button")
	public void user_orders_from_ordernow_button() throws InterruptedException {
	    Orders_page op = new Orders_page(driver);
	    Thread.sleep(3000);
	    //op.order();
	    op.order();
//	    Thread.sleep(3000);
//	    op.livemenu();
//	    Thread.sleep(3000);
//	    op.approved();
//	    Thread.sleep(3000);
//	    op.settle();
	 
	}
	

		    @And("User clicks on Live orders")
		    public void userClicksLiveOrders() throws InterruptedException {
		    	
		    	Orders_page op= new Orders_page(driver);
			    Thread.sleep(3000);
			    op.live_orders();
		        
		    }

		    @And("user clicks on Approved button")
		    public void userClicksApprovedButton() throws InterruptedException {
		    	Orders_page op= new Orders_page(driver);
		    	Thread.sleep(2000);
		    	op.approved();
		    	
		    	}

		    @And("user clicks on update order button")
		    public void userClicksUpdateOrderButton() throws InterruptedException {
		        Orders_page op = new Orders_page(driver);
		        Thread.sleep(2000);
		        op.update();
		    }
		    

		    @And("user clicks on Margharia pizza")
		    public void userClicksMarghariaPizza() throws InterruptedException {
		    	Orders_page op = new Orders_page(driver);
		        Thread.sleep(2000);
		        op.margettia();
		        
		    }

		    @And("user clicks on settlenow button")
		    public void userClicksSettleNowButton() throws InterruptedException {
		    	Orders_page op = new Orders_page(driver);
		        Thread.sleep(2000);
		        op.settlepayment();
		    }

		    @And("user pays with card")
		    public void userPaysWithCard() throws InterruptedException {
		    	Orders_page op = new Orders_page(driver);
		        Thread.sleep(2000);
		        op.card();
		        
		    }
		    @When("user orders from settlenow button")
		    public void user_orders_from_settlenow_button() throws InterruptedException {
		    	Orders_page op = new Orders_page(driver);
		        Thread.sleep(2000);
		        op.settlepayment();
		    }

		    @When("user enters the discount amount")
		    public void user_enters_the_discount_amount() throws InterruptedException {
		    	Orders_page op = new Orders_page(driver);
		        Thread.sleep(2000);
		        op.enter_discount();
		    }
		    @When("user select the percent")
		    public void user_select_the_percent() throws InterruptedException {
		    	Orders_page op = new Orders_page(driver);
		        Thread.sleep(2000);
		        op.percent();
		    }
		        

		    @When("user enters the discount percent")
		    public void user_enters_the_discount_percent() {
		        System.out.println("Discount applied");
		    }


			@When("user hovers the mouse to Teashop and clicks on it")
			public void user_hovers_the_mouse_to_teashop_and_clicks_on_it() {
			    Orders_page op = new Orders_page(driver);
			    op.mouse_hover();
			}
			
			@When("user selects the items from Teashop")
			public void user_selects_the_items_from_teashop() throws InterruptedException {
			    Orders_page op = new Orders_page(driver);
			   
			    op.item_teashop();
			    
			}
			@When("user navigate to the Dashboard")
			public void user_navigate_to_the_dashboard() {
				
				Orders_page op= new Orders_page(driver);
				
				op.dashboard();

			   
			}

			@When("user checks for the inventory units how many in the inventory")
			public void user_checks_for_the_inventory_units_how_many_in_the_inventory() throws InterruptedException {
				Orders_page op= new Orders_page(driver);
				//Thread.sleep(3000);
				//op.threelines();
				Thread.sleep(3000);
				op.inventory();
				Thread.sleep(3000);
				op.manageinventroy();
				Thread.sleep(3000);
				op.tablecontent();
			}
			@When("user checks for the inventory units how many in the inventory0")
			public void user_checks_for_the_inventory_units_how_many_in_the_inventory0() throws InterruptedException {
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
				Thread.sleep(3000);
				op.tablecontent1();
			}
		}

