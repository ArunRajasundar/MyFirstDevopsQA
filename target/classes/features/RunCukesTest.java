package features;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", tags= {"@tc01"}, glue= {"stepDefs"})

public class RunCukesTest {

}
