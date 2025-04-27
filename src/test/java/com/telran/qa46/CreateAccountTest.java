package com.telran.qa46;

import com.FirstSelenniumProject_1.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {


@Test(enabled = false)
    public void newUserRegistrationPositive(){
    app.getUser().clickOnRegistrationLink();
    app.getUser().chooseGenger();
    app.getUser().fillRegistrationForm(new User().setName("Y").setLastName("Test").setEmail("Yulia@test.com").setPassword("Test1234$").setPassword("Test1234$"));
    app.getUser().clickOnRegistrationButton();

    Assert.assertTrue(app.getUser().isLogoutPresent());

}

}
