package selnidetestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/selFeatures", 
		glue = "selStepDefinitions",tags="@Selenide1") 
public class selnTestRunner {

	
}
