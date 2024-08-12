package com.test.task.selenium.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

import static java.util.concurrent.TimeUnit.SECONDS;

public class WebDriverInstance {
    private static WebDriver webDriver;
    private static WebDriverWait webDriverWait;

    public WebDriverInstance() {

    }

    public static WebDriver getInstance() {
        if (Objects.isNull(webDriver)) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
            webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        }
        return webDriver;
    }

    public static void quit() {
        webDriver.quit();
    }

    public static void get(String url) {
        webDriver.get(url);
    }

    public static void click(By element) {
        webDriver.findElement(element).click();
    }

    public static void sendKeys(By element, String keys) {
        webDriver.findElement(element).sendKeys(keys);
    }

    public static String getText(By element) {
        return webDriver.findElement(element).getText();
    }

    public static void waitForPage(int timeInSecond) {
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeInSecond));    }
}
