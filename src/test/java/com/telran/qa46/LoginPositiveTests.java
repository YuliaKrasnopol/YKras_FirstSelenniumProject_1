package com.telran.qa46;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPositiveTests extends TestBase{
    @Test
    public void userLoginPositive (){
        clickOnLoginLink(".ico-login");
        fillLoginForm(new User().setEmail("Yulia@test.com").setPassword("Test1234$"));
        clickOnLoginButton("input[value='Log in']");

        Assert.assertTrue(isLogoutPresent());
    }

}
