package com.test.task.selenium.test.login_page;

import com.test.task.selenium.test.WebDriverInstance;
import org.openqa.selenium.By;

public class LoginButton {
    private final By LOGIN_BUTTON = By.xpath("//*[@id=\"login-button\"]");

    public void click() {
        WebDriverInstance.click(LOGIN_BUTTON);
    }
}
