package com.test.task.selenium.test.cart_page;

import com.test.task.selenium.test.WebDriverInstance;
import org.openqa.selenium.By;

public class RemoveButton {
    private String removeFromCartId = "//*[@id=\"remove-sauce-labs-%s\"]";

    public void click(String productId){
        By element = By.xpath(String.format(removeFromCartId, productId));
        WebDriverInstance.click(element);
    }
}
