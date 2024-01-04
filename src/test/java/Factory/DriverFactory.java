package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	static WebDriver driver = null;
	
	public static  void intializeBrowser(String browsername) {
		
		
		if(browsername.equals("chrome")) {
			 driver= new ChromeDriver();
		}
		else if(browsername.equals("safari")) {
			driver= new SafariDriver();
		}
	}
public static WebDriver getDriver() {
	return driver;
}}
