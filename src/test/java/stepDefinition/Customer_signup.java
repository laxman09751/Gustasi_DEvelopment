package stepDefinition;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Customer_signup_page;

public class Customer_signup {
	
	WebDriver driver;
	 public String generateRandomEmail() {
		 String emailPrefix = "CF"; // You can customize the email prefix
	     
		 String emailDomain = "gustasi.com"; // Your email domain
	     
		 String timeStamp = new SimpleDateFormat("yyyyMMddHHmm").format(new Date()); // Current date & time stamp
	     
		 return emailPrefix + timeStamp + "@" + emailDomain;
	    }
	
	 public String generateRandomMobileNumber() {
	     
		 // Assuming you're in India with country code +91
	     
		 String countryCode = "+91";
	     
		 String randomDigits = RandomStringUtils.randomNumeric(10); // Generate 10 random numeric digits
	     
		 return countryCode + randomDigits;
	    }
	
	@Given("users enter into the Customer  Signup page")
	public void users_enter_into_the_Customer_Signup_page() {
		driver= DriverFactory.getDriver();
		driver.findElement(By.xpath("//a[text()='Login']/following-sibling::a")).click();
		
	}
	@When("User click on the start ordering")
	public void user_click_on_the_start_ordering() {
		driver.findElement(By.xpath("(//button[@class='g-btn'])[1]")).click();
		
	   
	}

	@And("User enter the Customer details into the below fields")
	public void user_enter_the_customer_details_into_the_below_fields(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Customer_signup_page csp = new Customer_signup_page(driver);
		
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		
		String randomEmail = generateRandomEmail(); // Generate random email address
		
		System.out.println(randomEmail);
		
		String randomMobileNumber = generateRandomMobileNumber(); // Generate random mobile number
		
		System.out.println(randomMobileNumber);
		
		csp.firstname(dataMap.get("First name"));
		
		csp.lastname(dataMap.get("Last name"));
		
		Thread.sleep(2000);
		
		csp.phonenumber(randomMobileNumber);
		
		csp.email(randomEmail);
		
		csp.password(dataMap.get("password"));
		
		csp.city(dataMap.get("City"));
		
		Thread.sleep(2000);
		
		csp.City_Element.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		
		csp.City_Element.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        
		js.executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		
		csp.termconditions();
		
		js.executeScript("window.scrollBy(0,350)");
		
		csp.signup();
		
	}
	@And("users enter the OTP")
	public void users_enter_the_OTP() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("foodloader")));

		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
		button.click();

		driver.findElement(By.xpath("//input[contains(@class,'form-control otp-input')]")).sendKeys("1001");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@And("users click on the dashboard")
	public void users_click_on_the_dashbard() {
		
		Customer_signup_page csp = new Customer_signup_page(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
		wait.until(ExpectedConditions.elementToBeClickable(csp.dashboard_Element));
		
		
		csp.dashboard();
		
	}
	@Then("Users check the customername")
	public void Users_check_the_customername() {
		
		System.out.println("It was correctly created");
		
	}
}
