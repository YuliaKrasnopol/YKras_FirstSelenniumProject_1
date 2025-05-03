package com.telran.qa46;

import com.FirstSelenniumProject_1.data.UserData;
import com.FirstSelenniumProject_1.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest extends TestBase{
    @BeforeMethod(alwaysRun = true)

    public void userLoginPositive() {
        if(!app.getUser().isLoginPresent())
            app.getUser().clickOnSignOutButton();
        app.getUser().clickOnLoginLink(".ico-login");
        app.getUser().fillLoginForm(new User().setEmail(UserData.EMAIL).setPassword(UserData.PASSWORD));
        app.getUser().clickOnLoginButton("input[value='Log in']");

    }
    @Test
    public void addItemToCartPositiveTest(){
        app.getCart().addItemToTheCart();
        Assert.assertTrue(app.getCart().isItemPresentInTheCart());

    }

}
