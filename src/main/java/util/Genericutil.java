package util;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import static com.google.common.collect.Iterables.isEmpty;
public class Genericutil {
    public WebDriverWait wait;
    JavascriptExecutor jsExecutor;
    public Genericutil() {
        wait = new WebDriverWait(driver(), Duration.ofSeconds(20));
        jsExecutor = (JavascriptExecutor) driver();
    }
    public WebDriver driver() {
        return DriverFactory.driver();
    }
    /**
     * Javascript executor click on element with mouse action
     */
    public void Clickonjs(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            Actions action = new Actions(driver());
            action.moveToElement(element).build().perform();
            jsExecutor.executeScript("arguments[0].click();", element);
            System.out.println("Successfully clicked on " + element);
        } catch (Exception e) {
            System.out.println("Unable to clicked on element <" + element.toString() + ">");
            System.out.println("Throws Expection :" + e);
            throw e;
        }
    }
    /**
     * Java script executor and click on element
     */
    public void JSClick(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            jsExecutor.executeScript("arguments[0].click();", element);
            System.out.println("Successfully clicked on " + element);
        } catch (Exception e) {
            System.out.println("Unable to clicked on element <" + element.toString() + ">");
            System.out.println("Throws Expection :" + e);
            throw e;
        }
    }
    /**
     *Use WebDriverWait to wait for the visibility of the element
     */
    public void waitForElement(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("Successfully clicked on " + element);
        } catch (Exception e) {
            System.out.println("Element is not visible <" + element.toString() + ">");
            System.out.println("Throws Expection :" + e);
            throw e;
        }
    }
    /**
     * To verify the Text using hard Assert
     */
    public void verifyText(WebElement element, String expectedText) {
        String actualText = element.getText();
        String message = "Expected : " + expectedText + " Found : " + actualText;
        Assert.assertEquals(expectedText, actualText, message);
        System.out.println(element + " contains " + expectedText);
    }
    /**
     *Call the sendValueToTextfield method to interact with the text field or to enter the text values
     */
    public void sendValueToTextfield(WebElement element, String value) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(value);
            System.out.println("Successfully send " + value + " to Textfield <" + element.toString() + ">");
        } catch (Exception e) {
            System.out.println("Unable to send " + value + " to Textfield <" + element.toString() + ">");
            throw e;
        }
    }
    /**
     *Scrolls to the specified WebElement using JavaScript
     */
    public void scrollTO(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
            System.out.println("Scroll to  <" + element.toString() + ">");
        }
        catch(Exception e){
            System.out.println("Unable to Scroll to  <" + element.toString() + ">");
            throw e;
        }
    }
    /**
     *Waits for the specified WebElement to be clickable and then clicks on it
     */
    public void waitAndClick(WebElement element)
    {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            System.out.println("Successfully clicked on "+element);
        }
        catch (Exception e)
        {
            System.out.println("Unable to clicked on element <"+element.toString()+">");
            System.out.println("Throws Exception :" +e);
            throw e;
        }
    }
    /**
     * To avoid synchonization uses the synchonization method (sleep)
     */
    public static void sleep(int milliSecond) {
        try {
            Thread.sleep(milliSecond);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
