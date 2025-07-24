package stepDefinition;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_page;
import pages.reservation_page;

public class reservations {
	
	private WebDriver driver;
	public Login_page lp = new Login_page(driver);
	private   String reservationID;
	private  String id;
	private  String success_toast;
	int n=9;

	    @When("^user scroll and click on Reservations tab$")
	    public void clickReservationsTab() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	Thread.sleep(2000);
	    	rp.threeline();
	    	Thread.sleep(2000);
	    	WebElement iframe = rp.reservations_button;
	        new Actions(driver)
	                .scrollToElement(iframe)
	                .perform();
	        Thread.sleep(2000);
	        rp.reservations();
		}

	    @When("^User clicks on creating booking in reservation tab$")
	    public void clickCreateBooking() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.create_booking();
	    	Thread.sleep(2000);
	    	Set<String> windows = driver.getWindowHandles();
	    	Iterator<String> it =windows.iterator();
	    	String parentId = it.next();
	    	String childId=it.next();
	    	driver.switchTo().window(childId);
	    }
	    @And("user select the required menu in resturants")
	    public void user_select_the_required_menu_in_resturants() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.select_menu();
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	 js.executeScript("window.scrollBy(0,350)");
	    	 Thread.sleep(2000);
	    }
	   

	    @And("user select the required date")
	    public void userSelectTheRequiredDate() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.select_date();
	    	
	    	 
	    }

	    @And("select the require time")
	    public void selectTheRequireTime() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	 js.executeScript("window.scrollBy(0,350)");
	    	 Thread.sleep(1000);
	    	rp.dinner();
	    	rp.time_item();
	    }

	    @And("Add required number of guests")
	    public void addRequiredNumberOfGuests() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    
	    	for(int i=0;i<n;i++) {
	    	rp.number_of_guests_plus();
	    	}
	    }

	    @And("enter the name of the guest")
	    public void enterTheNameOfTheGuest() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.guest_name();
	    }
	    @And("enter the whatsapp contact number of guest")
	    public void enterTheWhatsappContactNumberOfGuest() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.guest_whatsapp_name();
	    }

	    @And("enter the required notes for resturants")
	    public void enter_the_require_notes_for_resturants() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.special_notes_area();
	    	//JavascriptExecutor js = (JavascriptExecutor) driver;
	    	 //js.executeScript("window.scrollBy(0,350)");
	    }



		@And("Click on the reserve table")
	    public void clickOnTheReserveTable() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	Thread.sleep(2000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,350)");
	    	WebElement element = rp.reserve_button;
	    	Actions actions = new Actions(driver);
	    	actions.moveToElement(element).click().perform();
	    }

	  @And("Validate the user entered data with review booking details")
	    public void validateTheUserEnteredDataWithReviewBookingDetails() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	Thread.sleep(2000);
	    	rp.confirm_cancel();
	    	int people = 10;
	    	String date = rp.only_date.getText();
	    	int dateValue = Integer.parseInt(date);
	    	System.out.println("Date Entered"+date);
	    	String timeText = rp.time_item_button.getText();
	    	System.out.println("Time Entered"+timeText);
	    	//String guestname= rp.Guest_name_input.getText();
	    	int expectedPeople = 10;
	        // String expectedGuest = "Bigdodo";
	         int expectedDate = dateValue;
	         String expectedTime = "08:00 PM";
	        if (people==expectedPeople&& dateValue==expectedDate  && timeText.equals(expectedTime)) {
	                System.out.println("Booking details are correct.");
	                Thread.sleep(2000);
	                WebElement element = rp.reserve_button;
	    	    	Actions actions = new Actions(driver);
	    	    	actions.moveToElement(element).click().perform();
	    	    	Thread.sleep(2000);
	                rp.confirm_yes();
	            } 
	        else {
	                System.out.println("Booking details are incorrect.");
	                System.out.println("Expected: People - " + expectedPeople + 
	                        ", Date - " + expectedDate + ", Time - " + expectedTime);
	                System.out.println("Actual: People - " + people + 
	                        ", Date - " + dateValue + ", Time - " + timeText);
	            }
	    }

	    @And("Observe the four-digit reservation id")
	    public void observeTheFourDigitReservationId() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	Thread.sleep(5000);
	    	String msg = rp.review_booking_text.getText();
	    	Thread.sleep(2000);
	    	System.out.println(msg);
	    	String pattern = "reservation ID: (\\w+)";
	        Pattern regex = Pattern.compile(pattern);
	        Matcher matcher = regex.matcher(msg);
	        Thread.sleep(2000);
	        if (matcher.find()) {
	            reservationID = matcher.group(1);
	            System.out.println("Reservation ID:" + reservationID);
	        } else {
	            System.out.println("Reservation ID not found in the message.");
	        }
	    }
	    
	    @And("Click OK")
	    public void clickOK() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.reservation_ok();
	    }
	    @And("Click on myaccount tab on top right side")
	    public void clickOnMyaccountTabOnTopRightSide() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.myaccount();
	    }

	    @And("enter the above submitted reservation ID in the ID input field")
	    public void enterTheAboveSubmittedReservationIDInTheIDInputField() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.id_input.click();
	    	Thread.sleep(2000);
	    	rp.id_input.sendKeys(reservationID);
	    }

	    @And("click on the search button")
	    public void clickOnTheSearchButton() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.upcoming_booking_button.click();
	    	Thread.sleep(2000);
	    	rp.search();
	    }

	    @And("Observer the entered reservation ID")
	    public void observerTheEnteredReservationID() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	Thread.sleep(2000);
	    	reservation_page rp = new reservation_page(driver);
	    	id =rp.reservation_id.getText();
	    	System.out.println(id);
	    }

	    @And("click on the confirm button")
	    public void clickOnTheConfirmButton() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    		if(id.equals(reservationID)) {
	    		rp.confirm();
	    	}
	    }
	    @And("click on the cancel button")
	    public void clickOnThecancelButton() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.cancel();
	    	
	    }

	    @Then("check for the toast confirmed message")
	    public void checkForTheToastConfirmedMessage() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.visibilityOf(rp.success_toast_message));
	    	success_toast=rp.success_toast_message.getText();
	    	System.out.println(success_toast);
	    	
	    }
	    @And("user clicks on dashboard")
	    public void userclicksondashboard() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	Thread.sleep(2000);
	    	rp.dashboard();
	    	
	    	
	    }
	    @And("user landing on the vendor URL")
	    public void userlandingonthevendorURL() throws InterruptedException{
	    	driver= DriverFactory.getDriver();
	    	driver.get("https://devweb.gustasi.com/chef/ZK9SMZ");
	    	Thread.sleep(3000);
	    }
	    @And("user clicks on reserve a table")
	    public void userclicksonreseveatable() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.reserveatable();
	    	Thread.sleep(2000);
	    	Set<String> windows = driver.getWindowHandles();
	    	Iterator<String> it =windows.iterator();
	    	String parentId = it.next();
	    	String childId=it.next();
	    	driver.switchTo().window(childId);
	    }
	    @And("user click on logout button on top right side")
	    public void userclickonlogoutbuttonontoprightside() {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	rp.logout();
	    	
	    }
	    @When("^user scroll and click on Reservations tab2$")
	    public void clickReservationsTab2() throws InterruptedException {
	    	driver= DriverFactory.getDriver();
	    	reservation_page rp = new reservation_page(driver);
	    	Thread.sleep(2000);
	    	//rp.threeline();
	    	Thread.sleep(2000);
	    	WebElement iframe = rp.reservations_button;
	        new Actions(driver)
	                .scrollToElement(iframe)
	                .perform();
	        Thread.sleep(2000);
	        rp.reservations();
		}
	}



