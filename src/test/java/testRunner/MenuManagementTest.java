package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/cucumber/learning/features",
        glue = "stepDefinitions",
        plugin = {"pretty"},
        tags = "@SmokeTest and @RegularTest"
)
public class MenuManagementTest {
}
