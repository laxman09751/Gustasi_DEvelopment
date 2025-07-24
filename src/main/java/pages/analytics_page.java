package pages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class analytics_page {
	
	@FindBy(xpath="//a[@routerlink='/Analytics']")
	public WebElement analytics_button;
	
	@FindBy(xpath="//select[@class='form-control']")
	public WebElement form_control;
	
	@FindBy(xpath="(//ng-select[@bindlabel='title']//div)[1]")
	public WebElement select_menu_input;
	
	@FindBy(xpath="//button[@class='btn btn-info']")
	public WebElement show_button;
	
	@FindBy(xpath="(//div[@class='ng-option'])[1]")
	public WebElement pizza_shop_select;
	
	@FindBy(xpath="(//span[@class='text-muted']/following-sibling::h1)[1]")
	public WebElement Total_value;
	
	@FindBy(xpath="(//span[@class='text-muted']/following-sibling::h1)[2]")
	public WebElement orders_value;
	
	@FindBy(xpath="(//span[@class='text-muted']/following-sibling::h1)[3]")
	public WebElement Quantitiy_sold;
	
	 WebDriver driver;
	public analytics_page(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	public void analytis() {
		analytics_button.click();
	}
	public void show() {
		show_button.click();
	}
	public void today() throws InterruptedException {
		        Select select = new Select(form_control);

        select.selectByVisibleText("Monthly Wise"); 
        Thread.sleep(2000);
	}
	public void selectmenu() {
		Select select = new Select(select_menu_input);

        // Get user input for the dropdown selection
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value you want to select from the dropdown:");
        String userInput = scanner.nextLine();

        // Select the value from the dropdown based on user input
        if (userInput.equalsIgnoreCase("BAR")) {
            select.selectByVisibleText("BAR");
        } else if (userInput.equalsIgnoreCase("MILK")) {
            select.selectByVisibleText("MILK");
        } else if (userInput.equalsIgnoreCase("CHINESE")) {
            select.selectByVisibleText("CHINESE");
        } else if (userInput.equalsIgnoreCase("BIRYANI")) {
            select.selectByVisibleText("BIRYANI");
        } else if(userInput.equalsIgnoreCase("PIZZA SHOP")) {
        	select.selectByVisibleText("PIZZA SHOP");
        }
        else if (userInput.equalsIgnoreCase("TEA SHOP")) {
        	select.selectByVisibleText("TEA SHOP");
        }
        else {
            System.out.println("Invalid input. Please enter a valid value from the dropdown menu.");
        }
		
	}
	public static void selectByVisibleText(Select select, String value) {
        select.selectByVisibleText(value);
        System.out.println("Selected: " + value);
    }
	public void total() {
		String st= Total_value.getText();
		System.out.println(st);
	}
	public void orders() {
		String st1 = orders_value.getText();
		System.out.println(st1);
	}
	public void quantity() {
		String st2 = Quantitiy_sold.getText();
		System.out.println(st2);
	}
	
}
