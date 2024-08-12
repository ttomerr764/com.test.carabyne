package com.test.task.selenium.test.cart_page;

import com.test.task.selenium.test.WebDriverInstance;

public class CartPage {
    private RemoveButton removeButton;

    public CartPage() {
        removeButton = new RemoveButton();
    }

    public void waitForPage() {
        WebDriverInstance.waitForPage(5);
    }

    public RemoveButton getRemoveButton() {
        return removeButton;
    }
}
