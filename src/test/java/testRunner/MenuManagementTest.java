package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/cucumber/learning/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@listofstrings",
        plugin = {"pretty",
                "html:target/SystemReports/html/report.html",
                "json:target/SystemReports/json/report.json",
                "junit:target/SystemReports/junit/report.xml"
                },
        dryRun = false,
        monochrome = true
)
public class MenuManagementTest {
}
