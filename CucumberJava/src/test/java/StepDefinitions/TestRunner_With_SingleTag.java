package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features_With_Tags", 
glue = "StepDefinitions", 
tags = "@Smoke")
public class TestRunner_With_SingleTag {

}
