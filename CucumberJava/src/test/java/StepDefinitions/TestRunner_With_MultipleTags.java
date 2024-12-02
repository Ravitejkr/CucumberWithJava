package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features_With_Tags", 
glue = "StepDefinitions", 
tags = "@Smoke or @Regression"
//tags = "@Smoke and @Regression"
//tags = "(@Smoke and @Regression) or @Test"
//tags = "@Smoke or (@Regression and @Test)"
//tags = "(@Smoke or @Regression) and @Test"
//tags = "@Smoke and (@Regression or @Test)"
)
public class TestRunner_With_MultipleTags {

}
