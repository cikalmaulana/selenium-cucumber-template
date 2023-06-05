package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.SetupManager;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/scenario",
        glue = "StepDefinition",
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@LoginTest"
)
public class TestRunner {

    @BeforeClass
    public static void setUp() {
        SetupManager.setUp();
    }

    @AfterClass
    public static void tearDown() {
        SetupManager.tearDown();
    }

}