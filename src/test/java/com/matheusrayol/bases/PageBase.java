package com.matheusrayol.bases;

import com.matheusrayol.GlobalParameters;
import com.matheusrayol.utils.DriverUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static jdk.nashorn.internal.objects.Global.print;

public class PageBase {

    // Global variables
    protected WebDriverWait wait;
    protected WebDriver driver;
    protected JavascriptExecutor javaScriptExecutor;

    // Constructor
    public PageBase() {
        wait = new WebDriverWait(DriverUtils.INSTANCE, Duration.ofSeconds(GlobalParameters.DEFAULT_TIMEOUT));
        driver = DriverUtils.INSTANCE;
        javaScriptExecutor = (JavascriptExecutor) driver;
    }

    // Method to wait for the page to load
    private void waitForPageToLoad() {
        StopWatch timeOut = new StopWatch();
        timeOut.start();

        while (timeOut.getTime() <= GlobalParameters.DEFAULT_TIMEOUT) {
            String documentState = javaScriptExecutor.executeScript("return document.readyState").toString();
            if (documentState.equals("complete")) {
                timeOut.stop();
                break;
            }
        }
    }

    // Method to wait for an element to be present
    protected WebElement waitForElement(By locator) {
        waitForPageToLoad();
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    // Method to send keys to an element
    protected void sendKeys(By locator, String text) {
        waitForElement(locator).sendKeys(text);
    }

    // Method to click on an element
    protected void click(By locator) {
        waitForElement(locator).click();
    }

    // Method to check if an element is displayed
    protected boolean isElementDisplayed(By locator) {
        return waitForElement(locator).isDisplayed();
    }

}
