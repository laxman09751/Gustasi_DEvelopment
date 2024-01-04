package stepDefinition;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_page;
import pages.Logout_page;


public class Logout {
	WebDriver driver;
	
	@Given("User navigate to the url")
	public void user_navigate_to_the_url() throws InterruptedException {
		driver= DriverFactory.getDriver();
		Thread.sleep(2000);
		Login_page lp = new Login_page(driver);
		lp.clickloginElements(); 
	}
	@And("user enter the mobile number {string}")
	public void user_enter_the_mobile_number(String string) throws InterruptedException {
		Login_page lp = new Login_page(driver);
		   lp.sendusername(string);
	}
	@And("user enter password {string}")
	public void user_enter_password(String string) throws InterruptedException {
		Login_page lp = new Login_page(driver);
		   lp.sendpassword(string);
	}
	@And("User clicked on the login")
	public void user_clicked_on_the_login() throws InterruptedException {
		Login_page lp = new Login_page(driver);
	    lp.loginbutton();
	}
	@When("user clicked on the Logout button")
	public void user_clicked_on_the_logout_button() throws InterruptedException {
		Logout_page logp= new Logout_page(driver);
		Thread.sleep(2000);
		logp.click_on_logout();
	}
	@Then("User should logout from the application")
	public void user_should_logout_from_the_application() throws InterruptedException {
		Logout_page logp= new Logout_page(driver);
		String st=logp.check_login();
		String st1="Login";
		Assert.assertEquals(st, st1);
	}

}
