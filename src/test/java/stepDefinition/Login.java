package stepDefinition;

import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_page;

public class Login {
	
	
	
	private WebDriver driver;
	public Login_page lp = new Login_page(driver);
	
	@Given("Users enter the login to the application using URL")
	public void users_enter_the_login_to_the_application_using_url() throws InterruptedException {
		driver= DriverFactory.getDriver();
		Thread.sleep(2000);
		Login_page lp = new Login_page(driver);
		lp.clickloginElements();
	}

	@When("User enter the mobile number with {string}")
	public void user_enter_the_mobile_number_with(String string) throws InterruptedException {
		Login_page lp = new Login_page(driver);
	   lp.sendusername(string);
	}

	@And("User enter the password with {string}")
	public void user_enter_the_password_with(String string) throws InterruptedException {
		Login_page lp = new Login_page(driver);
	   lp.sendpassword(string);
	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		Login_page lp = new Login_page(driver);
	    lp.loginbutton();
	}

	@Then("User logged into the gustasi webpage")
	public void user_logged_into_the_gustasi_webpage() throws InterruptedException {
		Login_page lp = new Login_page(driver);
	    lp.getusername();
	}

	@Then("User unable to login with invalid details")
	public void user_unable_to_login_with_invalid_details() throws InterruptedException {
		Login_page lp = new Login_page(driver);
	   lp.invalidcred();
	}

	@Then("User unable to logged into the gustasi webpage")
	public void user_unable_to_logged_into_the_gustasi_webpage() throws InterruptedException {
		Login_page lp = new Login_page(driver);
	    lp.invalidcred();
	}

}
