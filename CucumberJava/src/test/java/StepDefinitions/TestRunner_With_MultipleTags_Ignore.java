package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features_With_Tags", 
glue = "StepDefinitions", 
//tags = "(@Smoke or @SmokeTest) and not @Regression")
//tags = "(@Smoke and @SmokeTest) and not @Regression")
//tags = "(@Smoke or @SmokeTest) or not @Regression")
tags = "(@Smoke and @SmokeTest) or not @Regression")
public class TestRunner_With_MultipleTags_Ignore {

}
