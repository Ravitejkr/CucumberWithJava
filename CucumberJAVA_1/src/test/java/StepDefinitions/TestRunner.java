package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
glue = {"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/JUnitReport.xml", "html:target/HtmlReports/HTMLReport.html", 
		"json:target/JsonReports/JSONReport.json"},
tags = "@SmokeTest")
public class TestRunner {

}
