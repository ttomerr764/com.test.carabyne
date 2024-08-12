package com.test.task.selenium.test;

import com.test.task.selenium.test.cart_page.CartPage;
import com.test.task.selenium.test.login_page.LoginPage;
import com.test.task.selenium.test.login_page.PasswordElement;
import com.test.task.selenium.test.login_page.UserNameElement;
import com.test.task.selenium.test.products_page.ProductPage;

public class Main {

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();
        WebDriverInstance.getInstance().get("https://www.saucedemo.com/");

        loginPage.waitForPage();
        loginPage.getUserNameElement().sendKeys("standard_user");
        loginPage.getPasswordElement().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();

        productPage.waitForPage();
        productPage.getAddToCartButton().click("fleece-jacket");
        productPage.getAddToCartButton().click("onesie");
        productPage.getAddToCartButton().click("backpack");
        productPage.getCartButton().click();

        cartPage.waitForPage();
        cartPage.getRemoveButton().click("onesie");


    }
}
