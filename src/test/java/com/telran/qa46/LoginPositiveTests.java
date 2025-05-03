package com.telran.qa46;

import com.FirstSelenniumProject_1.data.UserData;
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
        app.getUser().fillLoginForm(new User().setEmail(UserData.EMAIL).setPassword(UserData.PASSWORD));
        app.getUser().clickOnLoginButton("input[value='Log in']");

        Assert.assertTrue(app.getUser().isLogoutPresent());
    }


}

