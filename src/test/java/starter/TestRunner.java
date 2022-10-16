package starter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber" }, 
		features = "src/test/resources/features", 
		glue = {"amazonTests" },
		publish = true)
public class TestRunner {

}
