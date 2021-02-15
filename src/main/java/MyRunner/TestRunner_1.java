package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\Selenium_workspace\\mvnetsyBDD\\src\\main\\java\\Features\\SignUp.feature",
		glue = {"Stepsdefinations"},
		monochrome = true,
		format= {"pretty","html:test-output","json:json_output/cucumber.jsont"}
		
		
		
		)
public class TestRunner_1 {
	
	

}
