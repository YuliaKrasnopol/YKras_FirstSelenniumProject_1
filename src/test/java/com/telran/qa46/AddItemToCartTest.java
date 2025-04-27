package com.telran.qa46;

import com.FirstSelenniumProject_1.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest extends TestBase{
    @BeforeMethod(alwaysRun = true)
    public void userLoginPositive() {
        app.getUser().clickOnLoginLink(".ico-login");
        app.getUser().fillLoginForm(new User().setEmail("Yulia@test.com").setPassword("Test1234$"));
        app.getUser().clickOnLoginButton("input[value='Log in']");

    }
    @Test
    public void addItemToCartPositiveTest(){
        app.getCart().addItemToTheCart();
        Assert.assertTrue(app.getCart().isItemPresentInTheCart());

    }

}
