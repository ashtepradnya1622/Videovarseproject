package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import static com.google.common.collect.Iterables.isEmpty;

public class Base {
    WebDriverWait wait;
    JavascriptExecutor jsExecutor;
    public Base()
    {
        wait = new WebDriverWait(driver(), Duration.ofSeconds(20));
        jsExecutor = (JavascriptExecutor) driver();
    }
    public WebDriver driver()
    {
        return DriverFactory.driver();
    }
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

    public void actionClick(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
            Actions action = new Actions(driver());
            action.moveToElement(element).click().build().perform();
            System.out.println("Successfully clicked on " + element);
            System.out.println("Unable to clicked on element <" + element.toString() + ">");
    }


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

    public void waitAndClick(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            System.out.println("Successfully clicked on " + element);
        } catch (Exception e) {
            System.out.println("Unable to clicked on element <" + element.toString() + ">");
            System.out.println("Throws Expection :" + e);
            throw e;
        }
    }
    public boolean isElementVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println(element+ " is visible");
        return true;
         }

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

    public static void sleep(int milliSecond) {
        try {
            Thread.sleep(milliSecond);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isListSorted(List<String> listOfStrings) {
        if (isEmpty(listOfStrings) || listOfStrings.size() == 1) {
            return true;
        }
        Iterator<String> iter = listOfStrings.iterator();
        String current, previous = iter.next();
        while (iter.hasNext()) {
            current = iter.next();
            if (previous.compareTo(current) > 0) {
                System.out.println("previous  : " + previous);
                System.out.println("current  : " + current);
                return false;
            }
            previous = current;
        }
        return true;
    }

}
