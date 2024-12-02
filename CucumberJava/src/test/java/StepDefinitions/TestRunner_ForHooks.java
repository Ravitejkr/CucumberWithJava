package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/DemoForHooks/HooksDemo.feature", 
glue = "StepsForHooks", 
plugin = { "pretty",
		"html:target/HTMLReports/HtmlReport", "json:target/JSONReports/JsonReport.json",
		"junit:target/JUnitReports/JunitReport.xml" }, 
monochrome = true)
public class TestRunner_ForHooks {

}
