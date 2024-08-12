package com.test.task.selenium.test.login_page;

import com.test.task.selenium.test.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserNameElement {
    private final By USERNAME_LOGIN = By.xpath("//*[@id=\"user-name\"]");

    public void sendKeys(String keys){
        WebDriverInstance.sendKeys(USERNAME_LOGIN, keys);
    }
}
