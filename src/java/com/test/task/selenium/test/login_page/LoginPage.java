package com.test.task.selenium.test.login_page;

import com.test.task.selenium.test.WebDriverInstance;
import org.openqa.selenium.By;

public class LoginPage {

    private final UserNameElement userNameElement;
    private final PasswordElement passwordElement;
    private final LoginButton loginButton;

    public LoginPage(){
        userNameElement = new UserNameElement();
        passwordElement = new PasswordElement();
        loginButton = new LoginButton();
    }

    public void waitForPage() {
        WebDriverInstance.waitForPage(5);
    }

    public LoginButton getLoginButton() {
        return loginButton;
    }

    public PasswordElement getPasswordElement() {
        return passwordElement;
    }

    public UserNameElement getUserNameElement() {
        return userNameElement;
    }
}
