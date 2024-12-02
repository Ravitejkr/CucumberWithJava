package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/BcakgroundDemo/DemoForBackground.feature", 
glue = "Steps_ForBackground", 
plugin = { "pretty",
		"html:target/HTMLReports/HtmlReport", "json:target/JSONReports/JsonReport.json",
		"junit:target/JUnitReports/JunitReport.xml" }, 
monochrome = true)
public class TestRunner_ForBackground {

}
