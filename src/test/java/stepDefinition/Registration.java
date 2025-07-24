package stepDefinition;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Registration {
	WebDriver driver;
	
	
	 public String generateRandomEmail() {
		 String emailPrefix = "CF"; // You can customize the email prefix
	     
		 String emailDomain = "gustasi.com"; // Your email domain
	     
		 String timeStamp = new SimpleDateFormat("yyyyMMddHHmm").format(new Date()); // Current date & time stamp
	     
		 return emailPrefix + timeStamp + "@" + emailDomain;
	    }
	
	 public String generateRandomMobileNumber() {
	     
		 String countryCode = "+91";
	     
		 String randomDigits = RandomStringUtils.randomNumeric(10); // Generate 10 random numeric digits
	     
		 return countryCode + randomDigits;
	    }
	 
	 
	 
	 @When("User click on the Start Ordering")
	 public void User_click_on_the_Start_Ordering() {
		 
		 driver.findElement(By.xpath("(//button[@class='g-btn'])[1]")).click();
	 }

	@Given("users enter into the Signup page")
	public void users_enter_into_the_signup_page() throws InterruptedException {
		
		driver= DriverFactory.getDriver();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='cmn__btn'])[1]")).click();

	}
	@When("User click on the create your chef store")
	public void user_click_on_the_create_your_chef_store() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=' Create your Chef Store']")).click();  
	}
	@When("User enter the details into the below fields")
    public void user_enter_the_details_into_the_below_fields(DataTable dataTable) throws InterruptedException {
        
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);

        
		String randomEmail = generateRandomEmail(); // Generate random email address
        
		String randomMobileNumber = generateRandomMobileNumber(); // Generate random mobile number

        
		driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-untouched')])[1]"))
                .sendKeys(dataMap.get("First name"));
        
		driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-untouched')])[2]"))
                .sendKeys(dataMap.get("Last name"));
        
		driver.findElement(By.xpath("//*[@id=\"partner-form\"]/div[3]/input"))
                .sendKeys(randomMobileNumber); // Use generated random mobile number
        
		System.out.println(randomMobileNumber);
        
		driver.findElement(By.xpath("//*[@id=\"partner-form\"]/div[4]/input"))
                .sendKeys(randomEmail); // Use generated random email
        
		System.out.println(randomEmail);
        
		driver.findElement(By.id("passwd2")).sendKeys(dataMap.get("password"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        
		js.executeScript("window.scrollBy(0,350)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
		driver.findElement(By.id("selectAddr")).sendKeys(dataMap.get("City"));
        
		Thread.sleep(2000);
        
		driver.findElement(By.id("selectAddr")).sendKeys(Keys.ARROW_DOWN);
        
		Thread.sleep(2000);
        
		driver.findElement(By.id("selectAddr")).sendKeys(Keys.ENTER);
        
		Thread.sleep(2000);
        
	
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
    
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("foodloader")));

		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
		button.click();

		driver.findElement(By.xpath("//input[contains(@class,'form-control otp-input')]")).sendKeys("1001");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
	}
	
	@And("User click on terms and conditions Commissions and payment policies")
	public void User_click_on_terms_and_conditions_Commissions_and_payment_policies() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		js.executeScript("window.scrollTo(0, 0);");
		 
		driver.findElement(By.xpath("//*[@id=\"acceptConditions\"]/div/div/div[2]/div[2]/div[2]/div/div[3]/div[1]/div/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"acceptConditions\"]/div/div/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/input")).click();
	}
	
	@And("user click on Proceed")
	public void user_click_on_Proceed() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"acceptConditions\"]/div/div/div[2]/div[2]/div[2]/div/div[5]")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
	}
	
	@And("user click on individual")
	public void user_click_on_individual()  {
		
		driver= DriverFactory.getDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("/html/body/app-root/div[2]/div[2]/app-step1-profile-basic/div/div[1]/form/div[1]/div/div[1]/input")).click();
		
	}
	
	@And("user enter the Display name {string}")
	public void user_enter_the_Display_name(String string) {
		driver.findElement(By.xpath("/html/body/app-root/div[2]/div[2]/app-step1-profile-basic/div/div[1]/form/div[2]/input")).sendKeys(string);
		
	}

	@And("user upload the Display image")
	public void user_upload_the_Display_image() throws InterruptedException, AWTException {
	
		Thread.sleep(3000);
		
		 String currentDirectory = System.getProperty("user.dir");
	     
		 String imagepath = currentDirectory + "/src/main/resources/Images_items/pine.jpeg";
	    	

			
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
    
		
		fileInput.sendKeys(imagepath);
    
		
    
		Thread.sleep(2000);

    
		driver.findElement(By.xpath("//span[contains(@class,'btn btn-success')]")).click();
    
		Thread.sleep(2000);
    
    
		driver.findElement(By.xpath("//*[@id=\"profile-image-crop-div\"]/div/div/div[3]/span")).click();
    
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
    
		driver.findElement(By.xpath("//button[text()='OK']")).click();
  	           
	}
	@And("user clicks on save and next")
	
	public void user_clicks_on_save_and_next() throws InterruptedException{
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn pull-right']")).click();
		
		
	}
	@And("user Enter contactdetails")
	
	public void user_Enter_contactdetails() {
		
		driver.findElement(By.xpath("(//input[@name='restaurant_contact'])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@name='restaurant_contact_open'])[2]")).click();

		driver.findElement(By.xpath("//input[contains(@class,'form-control ng-untouched')]")).sendKeys("1234567891");
		
		driver.findElement(By.xpath("//button[@class='btn pull-right']")).click();
	}
	@And("user Enter chefinfo")
	
	public void user_Enter_chefinfo() {
		
		driver.findElement(By.xpath("//input[contains(@class,'form-control ng-untouched')]")).sendKeys("Best Cusine");
		
		driver.findElement(By.tagName("textarea")).sendKeys("My passion is cooking food");
		
		driver.findElement(By.xpath("//button[@class='btn pull-right']")).click();
	}
	@And("user Enter workinghours")
	
	public void user_Enter_workinghours() {
		String[] xpaths = {
			    "(//div[contains(@class,'day btn-default')])[1]",
			    "(//div[contains(@class,'day btn-default')])[2]",
			    "(//div[contains(@class,'day btn-default')])[3]",
			    "//div[text()='W ']",
			    "(//div[text()='T '])[2]",
			    "//div[text()='F ']",
			    "(//div[text()='S '])[2]"
			};

			
			for (String xpath : xpaths) {
			   
			    WebElement element = driver.findElement(By.xpath(xpath));
			    
			    element.click();
			}
			driver.findElement(By.xpath("//button[@class='btn pull-right']")).click();		
	}
		@And("user Enter services")
	
	public void user_Enter_services() throws InterruptedException {
			driver = DriverFactory.getDriver();
			
			Thread.sleep(3000);
		    
			driver.findElement(By.id("chefOrderType1")).click();
		    

		    driver.findElement(By.id("cod")).click();	
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		    js.executeScript("window.scrollBy(0,350)");
		    
		    Thread.sleep(2000);
		    
		    js.executeScript("window.scrollBy(0,350)");
		    
		    Thread.sleep(2000);

		    js.executeScript("window.scrollBy(0,350)");

		    WebElement label = driver.findElement(By.xpath("//label[@for='dine']"));
		    label.click();
		    
		    WebElement label2 = driver.findElement(By.xpath("//label[@for='delivery']"));
		    label2.click();
		    	
		    Thread.sleep(2000);
		    
		    js.executeScript("window.scrollBy(0,350)");
		    
		    

		          
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
		    WebElement inputElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'form-control ng-untouched')])[1]")));
		    
		    inputElement1.sendKeys("199");
		    // Wait for the second input element to be visible
		    
		    WebElement inputElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'form-control ng-untouched')])[2]")));
		    
		    inputElement2.sendKeys("15");
		    // Wait for the input element for 'delvCharge' to be visible
		    
		    WebElement delvChargeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='delvCharge']")));
		    
		    delvChargeInput.sendKeys("20");
		    
		    // Wait for the input element for 'pkgCharge' to be visible
		    
		    WebElement pkgChargeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='pkgCharge']")));
		    
		    pkgChargeInput.sendKeys("5");
		    
		    // Wait for the input element for 'freeDelvCharge' to be visible
		    
		    WebElement freeDelvChargeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='freeDelvCharge']")));
		    
		    freeDelvChargeInput.sendKeys("500");

		    driver.findElement(By.xpath("//button[@class='btn pull-right']")).click();
	}
	@And("user Enter Cuisiness")	
	public void user_Enter_Cuisiness() throws InterruptedException {
		driver = DriverFactory.getDriver();
		
		Thread.sleep(2000);
		
		String keyword = "South Indian"; // The keyword to search for
	
		WebElement searchInput = driver.findElement(By.tagName("input"));
		
		searchInput.sendKeys(keyword);
		
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-default')]")).click();
		
		searchInput.clear();
		
		String Keyword2= "North Indian";
		
		searchInput.sendKeys(Keyword2);
		
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-default')]")).click();
	
		driver.findElement(By.xpath("//button[@class='btn pull-right']")).click();
	
	}
	@And("user Enter PickupAddress")
	public void user_Enter_PickupAddress() throws InterruptedException {
		
		driver = DriverFactory.getDriver();
		
		driver.findElement(By.xpath("//input[@formcontrolname='street1']")).sendKeys("Mana Inti ruchulu");
			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@formcontrolname='street1']")).sendKeys(Keys.ARROW_DOWN);
	    
		Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//input[@formcontrolname='street1']")).sendKeys(Keys.ENTER);
	    
		Thread.sleep(2000);
	    
		JavascriptExecutor js = (JavascriptExecutor) driver;
	   
	    js.executeScript("document.querySelector(\"div[class='flex-item']\").scrollBy(0,450)");
	    
	    driver.findElement(By.xpath("//input[@formcontrolname='doorno']")).sendKeys("123");
	    
	    driver.findElement(By.xpath("//input[@formcontrolname='landmark']")).sendKeys("Gudivada");
	    
	    driver.findElement(By.xpath("//button[@class='btn pull-right']")).click();
	}
	@And("user Enter Identification")
	public void user_Enter_Identification() throws InterruptedException, AWTException {
		
		driver = DriverFactory.getDriver();
		
 String currentDirectory = System.getProperty("user.dir");
	     
		 String imagepath = currentDirectory + "/src/main/resources/Images_items/pine.jpeg";
	    	

			
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
    
		
		fileInput.sendKeys(imagepath);
//		
//		WebElement uploadButton = driver.findElement(By.xpath("//img[@class='thumb-xl img-circle']"));
//	    
//	    uploadButton.click();
//	
//	    String imagePath = "/Users/konalakshmanarao/Desktop/tt.png";
//	    
//	    WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
//	
//	    // Set the file path to the file input element using JavaScript
//	    
//	    ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", fileInput);
//	    
//	    fileInput.sendKeys(new File(imagePath).getAbsolutePath());
//	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    js.executeScript("window.scrollBy(0,350)");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//span[contains(@class,'btn btn-success')]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"profile-image-crop-div\"]/div/div/div[3]/span")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[text()='Yes']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[text()='OK']")).click();
	    
	    driver.findElement(By.xpath("//input[@formcontrolname='entityDob']")).sendKeys("12/23/2004");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@formcontrolname='entityDob']")).sendKeys(Keys.ENTER);
	    
	    js.executeScript("document.querySelector(\"div[class='flex-item']\").scrollBy(0,450)");
	    
	    Thread.sleep(2000);
	    
	    String filePath = "/Users/konalakshmanarao/Desktop/tt.png";
	
	    
	    StringSelection stringSelection = new StringSelection(filePath);
	    
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	
	    // Create a Robot instance
	    Robot robot = new Robot();
	
	    // Open the file upload dialog
	    
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    
	    robot.keyPress(KeyEvent.VK_V);
	    
	    robot.keyRelease(KeyEvent.VK_V);
	    
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	
	    // Press Enter to confirm the file upload
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    robot.keyRelease(KeyEvent.VK_ENTER);
	  
	
	    
	     WebElement fileInput2 = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
	
	    // Set the file path to the file input element using JavaScript
	   
	     ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", fileInput2);
	    
	     fileInput2.sendKeys(new File(imagepath).getAbsolutePath());
	    
	     WebElement dropdown = driver.findElement(By.name("side"));
	
		 // Create a Select object
		 Select select = new Select(dropdown);
		
		 // Select "Aadhar card" option by visible text
		 select.selectByVisibleText("Aadhar card");
		 
		 driver.findElement(By.xpath("//input[@placeholder='Expire date']")).sendKeys("12/23/2099");
		 
		 driver.findElement(By.xpath("//input[@placeholder='Expire date']")).sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Comments']")).sendKeys("Nothing");
		 
		 Thread.sleep(3000);
		 
		 js.executeScript("document.querySelector(\"div[class='flex-item']\").scrollBy(0,250)");
		 
		 driver.findElement(By.xpath("//div[@class='row']/following-sibling::button[1]")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[text()='OK']")).click();
		 
		 driver.findElement(By.xpath("//button[@class='btn pull-right']")).click();
		}
		
		@And("user Enter PayoutInformation")
		public void user_Enter_PayoutInfomration() throws InterruptedException {
		
			driver = DriverFactory.getDriver();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@data-toggle='modal']")).click();
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		@Then("user Verify the user name")
		public void user_Verify_the_user_name() {
			
			driver = DriverFactory.getDriver();
			
			String ChefStore = driver.findElement(By.className("hidden-xs")).getText();
			
			System.out.println(ChefStore);
		}
}
