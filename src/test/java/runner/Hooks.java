package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Hooks {
    /**
     * Executed before each test scenario.
     */
    public WebDriver driver;

    @Before
    public void beforeMethod(Scenario scenario) {
        DriverFactory.driver();
    }

    /**
     * captures a screenshot and saves it to the specified directory
     */
    @After
    /**
     * executed after each test scenario & teardown the driver
     */
    public void TearDown(Scenario scenario) {
        //DriverFactory.driverTearDown(){
        if (scenario.isFailed()) {
            try {
                final byte[] screenshot = ((TakesScreenshot) Objects.requireNonNull(DriverFactory.driver())).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            } catch (Exception e) {
                System.out.println("Unable to take screenshot" + e.getMessage());
            }
        }
    }
}
