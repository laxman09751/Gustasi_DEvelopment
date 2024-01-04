package Hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.configreader;

public class MyHooks {
	 WebDriver driver;
	@Before
	public void setup() {
		Properties prop = configreader.intiliazeProperties();
		DriverFactory.intializeBrowser(prop.getProperty("browser"));
		driver=DriverFactory.getDriver();
		 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
	}
	@After
	public void teardown(Scenario scenario) {
		String scenarioname= scenario.getName().replaceAll(" ","_");
		if(scenario.isFailed()) {
			byte[] srcScreenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "img/png", scenarioname);
		}
		//driver.quit();
	}
}
