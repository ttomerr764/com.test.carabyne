package com.test.task.selenium.test.login_page;

import com.test.task.selenium.test.WebDriverInstance;
import org.openqa.selenium.By;

public class PasswordElement {
    private final By PASSWORD_LOGIN = By.xpath("//*[@id=\"password\"]");

    public void sendKeys(String keys){
        WebDriverInstance.sendKeys(PASSWORD_LOGIN, keys);
    }
}
