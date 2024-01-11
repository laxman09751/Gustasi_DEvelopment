package Factory;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	static WebDriver driver = null;
	
	public static  void intializeBrowser(String browsername) {
		
		
		if(browsername.equals("chrome")) {
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("headless");
			
			 driver= new ChromeDriver();
			 driver.manage().window().setSize(new Dimension(1440,900));
		}
		
		else if(browsername.equals("firefox")){
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("safari")) {
			driver= new SafariDriver();
			driver.manage().window().maximize();
		}
	}
public static WebDriver getDriver() {
	return driver;
}}
