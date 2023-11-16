package util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

/**
 *  DriverFactory class is responsible for managing WebDriver instances in a multi-threaded environment.
 */
public class DriverFactory {
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    /**
     *  ThreadLocal variable to store thread-specific data
     */
    private static ThreadLocal dataThreadLocal = new ThreadLocal<>();
    /**
     * * Retrieves the WebDriver instance for the current thread.
     */
    public static WebDriver driver()
    {
        if (driverThreadLocal.get() == null) {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driverThreadLocal.set(driver);
        }
        return driverThreadLocal.get();
    }

    public static void driverTearDown() {
    }
}





