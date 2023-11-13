package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
@CucumberOptions(
        features = {"src\\test\\java\\feature"},
        glue = {"runner","stepDefinitions"},
        tags = " @Test6",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
/**
 * TestRunner class that extends AbstractTestNGCucumberTests to run Cucumber scenarios.
 *  Overrides the scenarios() method to disable parallel execution for scenarios.
 */
public class TestRunner extends AbstractTestNGCucumberTests
{
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }

}
