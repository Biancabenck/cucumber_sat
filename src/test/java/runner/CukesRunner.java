package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty",
				"html:target/default-cucumber-reports",
		"json:target/cucumber.json" },
		features = "src/test/resources/feature", 
		glue = {"step_def"} ,
		dryRun = false,
		monochrome = true
		//,tags = "@cucumberSample"

)

public class CukesRunner {

}
