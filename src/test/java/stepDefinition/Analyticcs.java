package stepDefinition;

import org.openqa.selenium.WebDriver;
import Factory.DriverFactory;
import io.cucumber.java.en.When;
import pages.analytics_page;
import pages.reservation_page;

public class Analyticcs {
	private WebDriver driver;
	
	@When("User click on the three menu lines")
	public void user_click_on_the_three_menu_lines() throws InterruptedException {
		driver= DriverFactory.getDriver();
    	reservation_page rp = new reservation_page(driver);
    	Thread.sleep(2000);
    	rp.threeline();
    	Thread.sleep(2000);
//    	WebElement iframe = rp.reservations_button;
//        new Actions(driver)
//                .scrollToElement(iframe)
//                .perform();
//        Thread.sleep(2000);
       
	}
	@When("user clicks on the Analytics button")
	public void user_clicks_on_the_analytics_button() {
	    analytics_page ap = new analytics_page(driver);
	    ap.analytis();
	}
	@When("User clicks on the Today")
	public void user_clicks_on_the_today() throws InterruptedException {
		 analytics_page ap = new analytics_page(driver);
		 ap.today();
	    
	}
	@When("user clicks on menu and select the Restaurant")
	public void user_clicks_on_menu_and_select_the_restaurant() {
		analytics_page ap = new analytics_page(driver);
	    ap.selectmenu();
	}
	@When("user clicks on show button")
	public void user_clicks_on_show_button() {
		analytics_page ap = new analytics_page(driver);
	    ap.show();
	    
	}
	@When("user gets the Total sales data")
	public void user_gets_the_total_sales_data() {
		analytics_page ap = new analytics_page(driver);
	    ap.total();
	}
	@When("user gets Orders data")
	public void user_gets_orders_data() {
		analytics_page ap = new analytics_page(driver);
	    ap.orders();
	}
	@When("user gets Quantity sold data")
	public void user_gets_quantity_sold_data() {
		analytics_page ap = new analytics_page(driver);
	    ap.quantity();
	}
	@When("user gets Tempered sales data")
	public void user_gets_tempered_sales_data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
