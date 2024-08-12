package com.test.task.selenium.test.products_page;

import com.test.task.selenium.test.WebDriverInstance;
import org.openqa.selenium.By;

public class AddToCartButton {
    private String addToCartId = "//*[@id=\"add-to-cart-sauce-labs-%s\"]";

    public void click(String productId){
        By element = By.xpath(String.format(addToCartId, productId));
        WebDriverInstance.click(element);
    }

}
