package cucumbertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = {"stepDefinition"},
		tags = "(@SmokeTest or @RegressionTest) and (not @E2ETest)"
		)

public class TestRunner {

	
	
	/*
	 tags = "@SmokeTest or @RegressionTest"
	 
	 tags = "not @E2ETest"  not tagged with that tag 
	 
	 tags = "(@SmokeTest or @RegressionTest) and (not @E2ETest)"
	 */
	
}
