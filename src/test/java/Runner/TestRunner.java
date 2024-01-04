package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/Orders.feature",
		glue={"stepDefinition","Hooks"},
		 plugin = {"pretty", "html:src/test/resources/target/CucumberReports/CucumberReport.html"}
		
		)
public class TestRunner {
}
