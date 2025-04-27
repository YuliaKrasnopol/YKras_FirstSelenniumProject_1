package com.telran.qa46;

import com.FirstSelenniumProject_1.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.telran.qa46.TestBase.app;



public class LoginPositiveTests extends TestBase{
    @BeforeMethod(alwaysRun = true)
    public void ensurePrecondition(){
        if(!app.getUser().isLoginPresent())
            app.getUser().clickOnSignOutButton();
    }

    @Test
    public void userLoginPositive (){
        app.getUser().clickOnLoginLink(".ico-login");
        app.getUser().fillLoginForm(new User().setEmail("Yulia@test.com").setPassword("Test1234$"));
        app.getUser().clickOnLoginButton("input[value='Log in']");

        Assert.assertTrue(app.getUser().isLogoutPresent());
    }


}

