package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features", glue = {"pages"})
public  class TestRunner extends AbstractTestNGCucumberTests {
}
