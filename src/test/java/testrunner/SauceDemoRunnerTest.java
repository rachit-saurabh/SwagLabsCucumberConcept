package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features = "C:\\Users\\admin\\eclipse-workspace\\SwagLabsCucumberConcept\\src\\test\\java\\swagLabsFeatures",
glue= {"stepdefinition"},
dryRun = false
)
public class SauceDemoRunnerTest {
}