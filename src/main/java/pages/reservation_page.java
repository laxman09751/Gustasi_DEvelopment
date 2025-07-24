package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class reservation_page {
	
	 @FindBy(xpath="//a[contains(@class,'open-close hidden-xs')]")
		public WebElement threelines_link;
	 
	 
	 @FindBy(xpath="//span[text()='Reservations']")
		public WebElement reservations_button;
	 
	 @FindBy(xpath="//button[contains(@class,'btn btn-danger')]")
		public WebElement create_booking_button;
	 
	 @FindBy(xpath="//select[contains(@class,'form-control ng-untouched')]")
	 public WebElement menu_dropdown;
	 
	 @FindBy(xpath="(//div[@class='month-label']/following-sibling::div)[2]")
	 public WebElement select_date;
	 
	 @FindBy(xpath="(//div[@class='day'])[2]")
	 public WebElement only_date;
	 
	 @FindBy(xpath="//div[text()='Lunch']")
	 public WebElement lunch_tab;
	 
	 @FindBy(xpath="//div[text()='Dinner']")
	 public WebElement dinner_tab;
	 
	 @FindBy(xpath="//div[text()=' 08:00 PM ']")
	 public WebElement time_item_button;
	 
	 @FindBy(xpath="//i[@class='fa fa-plus-circle']")
	 public WebElement number_of_guests_plus;
	 
	 @FindBy(xpath="//i[@class='fa fa-minus-circle']")
	 public WebElement number_of_guests_minus;
	 
	 @FindBy(xpath="(//input[contains(@class,'form-control ng-untouched')])[1]")
	 public WebElement Guest_name_input;
	 
	 @FindBy(xpath="(//input[contains(@class,'form-control ng-untouched')])[2]")
	 public WebElement whatsappnumber;
	 
	 @FindBy(xpath="//textarea[contains(@class,'form-control ng-untouched')]")
	 public WebElement special_notes;
	 
	 @FindBy(xpath="//div[@class='m-t-20 text-center']//button[1]")
	 public WebElement reserve_button;
	 
	 @FindBy(xpath="(//div[@data-timer='null']//p)[1]")
	 public WebElement review_booking_text;
	 
	 @FindBy(xpath="//div[@class='sa-confirm-button-container']//button[1]")
	 public WebElement yes_button;
	 
	 @FindBy(xpath="(//div[@class='sa-button-container']//button)[1]")
	 public WebElement cancel_button;
	 
	 @FindBy(xpath="//div[@class='sa-confirm-button-container']//button[1]")
	 public WebElement reservation_ok_button;
	 
	 @FindBy(xpath="//a[contains(text(),'My Account')]")
	 public WebElement myaccount_button;
	 
	 @FindBy(xpath="//input[@placeholder='ID/Mobile']")
	 public WebElement id_input;
	 
	 @FindBy(xpath="//button[@class='btn btn-info']")
	 public WebElement search_button;
	 
	 @FindBy(xpath="(//div[@class='time-tabs']//div)[2]")
	 public WebElement upcoming_booking_button;
	 
	 @FindBy(xpath="//div[@class='info']//b[1]")
	 public WebElement reservation_id;
	 
	 @FindBy(xpath="//button[contains(@class,'btn btn-success')]")
	 public WebElement confirm_button;
	 
	 @FindBy(xpath="//button[contains(@class,'btn btn-danger btn-sm')]")
	 public WebElement cancel_reservation_button;
	 
	 @FindBy(xpath="//div[@class='iziToast-wrapper iziToast-wrapper-topRight']")
	 public WebElement success_toast_message;
	 
	 @FindBy(xpath="(//div[contains(@class,'menu__btn d-none')]//a)[2]")
	 public WebElement dashboard_link;
	 
	 @FindBy(xpath="//a[contains(.,'Reserve A Table')]")
	 public WebElement reserveatable_button;
	 
	 @FindBy(xpath="(//a[@class='nav-link'])[3]")
	 public WebElement logout_link; 
	 
	 @FindBy(xpath="//div[@class='time-tab active']")
	 public WebElement past_bookings_button;
	 
	 @FindBy(xpath="(//button[contains(@class,'btn btn-danger')])[2]")
	 public WebElement cancel_button2;
	 
	 @FindBy(xpath="//div[text()=' View Menu']")
	 public WebElement viewmenu_button;
	 
	 @FindBy(xpath="//div[@class='subt']/following-sibling::div[1]")
	 public WebElement restuarant_name;

	 
	 WebDriver driver;
	 
	public reservation_page(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	public void threeline() {
		threelines_link.click();
	}
	public void reservations() {
		reservations_button.click();
	}
	public void create_booking() {
		create_booking_button.click();
	}
	
	
	public void select_menu() {
		Select dropdown = new Select(menu_dropdown);
		String menu="TEASHOP";
        dropdown.selectByVisibleText(menu);
	}
	public void select_date() {
		select_date.click();
	}
	public void lunch() {
		lunch_tab.click();
	}
	
	public void dinner() {
		dinner_tab.click();
	}
	public void time_item() {
		time_item_button.click();
	}
	public void number_of_guests_plus() {
		number_of_guests_plus.click();
	}
	public void number_of_guests_minus() {
		number_of_guests_minus.click();
	}
	public void guest_name() {
		Guest_name_input.sendKeys("Bigdodo");
	}
	public void guest_whatsapp_name() {
		whatsappnumber.sendKeys("9032777886");
	}
	public void special_notes_area() {
		special_notes.sendKeys("Book the city view");
	}
	public void reserver() {
		reserve_button.click();
	}
	public void review_booking() {
		review_booking_text.getText();
	}
	public void confirm_yes() {
		yes_button.click();
	}
	public void confirm_cancel() {
		cancel_button.click();
	}
	public void reservation_ok() {
		reservation_ok_button.click();
	}
	public void myaccount() {
		myaccount_button.click();
	}
	public void search() {
		search_button.click();
	}
	public void confirm() {
		confirm_button.click();
	}
	public void cancel() {
		cancel_reservation_button.click();
	}
	public void dashboard() {
		dashboard_link.click();
	}
	public void reserveatable() {
		reserveatable_button.click();
	}
	public void logout() {
		logout_link.click();
	}
	public void pastbooking() {
		past_bookings_button.click();
	}
	public void cancel2() {
		cancel_button2.click();
	}
	public void viewmenu() {
		viewmenu_button.click();
	}
	public void getrestuarantname() {
		String str=restuarant_name.getText();
		System.out.println("Restuarant name"+str);
		if(str.equals("LAKSHMAN")) {
			System.out.println("Restuarant reservation succesfully opened");
		}
	}
}
