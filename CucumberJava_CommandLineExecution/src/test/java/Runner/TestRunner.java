package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", 
glue = "Steps",
plugin = {"json:target/Reports/cucumber-report.json"})//, "rerun:target/FailedTestCase/failedrerun.txt"})
public class TestRunner {

}
