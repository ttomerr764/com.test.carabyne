package com.test.task.selenium.test.products_page;

import com.test.task.selenium.test.WebDriverInstance;

public class ProductPage {
    private AddToCartButton addToCartButton;
    private CartButton cartButton;

    public ProductPage(){
        addToCartButton = new AddToCartButton();
        cartButton = new CartButton();
    }

    public void waitForPage() {
        WebDriverInstance.waitForPage(5);
    }

    public AddToCartButton getAddToCartButton() {
        return addToCartButton;
    }

    public CartButton getCartButton() {
        return cartButton;
    }
}
