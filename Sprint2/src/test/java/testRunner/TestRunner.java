package testRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features/freeCRM.feature"
		,glue= {"stepDefinitions"},
	    tags= {"@smoke"},
		monochrome= true,
		plugin= {"html:target/Destination"}
		
		)
public class TestRunner {

}
