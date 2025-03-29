package com.telran.qa46;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest extends TestBase{
    @BeforeMethod
    public void userLoginPositive() {
        clickOnLoginLink(".ico-login");
        fillLoginForm(new User().setEmail("Yulia@test.com").setPassword("Test1234$"));
        clickOnLoginButton("input[value='Log in']");

    }
    @Test
    public void addItemToCartPositiveTest(){
        addItemToTheCart();
        Assert.assertTrue(isItemPresentInTheCart());

    }

}
