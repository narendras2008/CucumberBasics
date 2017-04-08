package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Shaju on 08/04/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"}, glue = "Steps")
public class TestRunner {

}
