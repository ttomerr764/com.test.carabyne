package com.test.task.selenium.test.products_page;

import com.test.task.selenium.test.WebDriverInstance;
import org.openqa.selenium.By;

public class CartButton {
    private final By CART_BUTTON = By.xpath("//*[@id=\"shopping_cart_container\"]");

    public void click(){
        WebDriverInstance.click(CART_BUTTON);
    }

    //*[@id="remove-sauce-labs-onesie"]
}
