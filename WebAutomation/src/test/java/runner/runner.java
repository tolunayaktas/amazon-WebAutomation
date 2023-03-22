package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@iphone",
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions","util"}
)
public class runner extends AbstractTestNGCucumberTests {

}
