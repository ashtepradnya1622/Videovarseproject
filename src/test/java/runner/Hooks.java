package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.DriverFactory;

public class Hooks {
    /**
     * Executed before each test scenario.
     */
    @Before
    public void beforeMethod(Scenario scenario)
    {
        DriverFactory.driver();
    }
//   @After
//    /**
//     * executed after each test scenario & teardown the driver
//     */
//    public void afterMethod(Scenario scenario) {
//        DriverFactory.driverTearDown();
//    }
}
