package stepDefinition;

import java.time.Duration;
import java.util.Map;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Registration {
	WebDriver driver;
	
	@Given("users enter into the Signup page")
	public void users_enter_into_the_signup_page() throws InterruptedException {
		driver= DriverFactory.getDriver();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='cmn__btn'])[1]")).click();

	}
	@When("User click on the create your chef store")
	public void user_click_on_the_create_your_chef_store() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/div[2]/app-signup-profile/div[2]/div/div/div[2]/div/button")).click();  
		
	}
	@When("User enter the details into the below fields")
	public void user_enter_the_details_into_the_below_fields(DataTable dataTable) throws InterruptedException {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-untouched')])[1]")).sendKeys(dataMap.get("First name"));
		driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-untouched')])[2]")).sendKeys(dataMap.get("Last name"));
		driver.findElement(By.xpath("//*[@id=\"partner-form\"]/div[3]/input")).sendKeys(dataMap.get("Phone Number"));
		driver.findElement(By.xpath("//*[@id=\"partner-form\"]/div[4]/input")).sendKeys(dataMap.get("Email"));
		driver.findElement(By.id("passwd2")).sendKeys(dataMap.get("password"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("selectAddr")).sendKeys(dataMap.get("City"));
		Thread.sleep(2000);
		driver.findElement(By.id("selectAddr")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("selectAddr")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");

	
	}

	@And("User click on terms and conditions")
	public void user_click_on_terms_and_conditions() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("termcond1")).click();
	}

	@And("User clicks on Create Account")
	public void user_clicks_on_create_account() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn red-aquare-btn']")).click();
	}

	@And("User enters the OTP")
	public void User_enters_the_OTP() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
		button.click();

		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		    js.executeScript("window.scrollTo(0, 0);");
		
		@SuppressWarnings("resource")
		
		Scanner myObj = new Scanner(System.in);  
		
	    System.out.println("Enter OTP");

	    String otp = myObj.nextLine();  
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	   

		
	    driver.findElement(By.xpath("//input[contains(@class,'form-control otp-input')]")).sendKeys(otp);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@And("User click on terms and conditions Commissions and payment policies")
	public void User_click_on_terms_and_conditions_Commissions_and_payment_policies() {
		
	driver.findElement(By.xpath("//*[@id=\"acceptConditions\"]/div/div/div[2]/div[2]/div[2]/div/div[3]/div[1]/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"acceptConditions\"]/div/div/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/input")).click();
	}
	@And("user click on Proceed")
	public void user_click_on_Proceed() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"acceptConditions\"]/div/div/div[2]/div[2]/div[2]/div/div[5]")).click();
		Thread.sleep(3000);
		
		
	}
	
	@And("user click on individual")
	public void user_click_on_individual() {
		driver.findElement(By.xpath("/html/body/app-root/div[2]/div[2]/app-step1-profile-basic/div/div[1]/form/div[1]/div/div[1]/input")).click();
		
	}
	@And("user enter the Display name {string}")
	public void user_enter_the_Display_name(String string) {
		driver.findElement(By.xpath("/html/body/app-root/div[2]/div[2]/app-step1-profile-basic/div/div[1]/form/div[2]/input")).sendKeys(string);
		
	}

	@And("user upload the Display image")
	public void user_upload_the_Display_image() throws InterruptedException {
		Thread.sleep(3000);
		
		// Find the input element where you can upload the image
        WebElement uploadElement = driver.findElement(By.xpath("//body/app-root[1]/div[2]/div[2]/app-step1-profile-basic[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]"));

        // Specify the file path of the image you want to upload
        String imagePath = "/Users/konalakshmanarao/Desktop/tt.jpeg";

        // Use JavaScript Executor to set the value of the input element to the file path
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', arguments[1]);", uploadElement, imagePath);
	}
	@And("user clicks on save and next")
	public void user_clicks_on_save_and_next(){
		
		driver.findElement(By.xpath("/html/body/app-root/div[2]/div[2]/app-step1-profile-basic/div/div[1]/form/div[5]/app-onboard-footer/div/div/button")).click();
		
	}
	
	
}
