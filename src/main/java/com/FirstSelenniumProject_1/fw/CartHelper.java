package com.FirstSelenniumProject_1.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartHelper extends BaseHelper{
    public CartHelper(WebDriver driver) {
        super(driver);
    }

    public void addItemToTheCart() {
        click(By.xpath("(//input[@value='Add to cart'])[2]"));
        click(By.xpath("//li[@id='topcartlink']"));
    }

    public boolean isItemPresentInTheCart() {
        return isElementPresent(By.xpath("//a[@class='product-name'][contains(text(),'14.1-inch Laptop')]"));
    }
}
