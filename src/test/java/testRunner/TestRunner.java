package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = {"src/test/resources/Features"},      // Path to feature files
	    glue = {"stepdefinitions", "Hooks"},              // Package for step definitions and hooks
	    plugin = {
	        "pretty",                                    // Output formatted logs in console
	        "html:target/cucumber-report.html",           // Generate HTML report
	        "json:target/cucumber-report.json"            // Optional: Generate JSON report for further analysis
	    }
	)
	public class TestRunner extends AbstractTestNGCucumberTests {
	    // Empty class - the annotations drive the configuration
}