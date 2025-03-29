package com.telran.qa46;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

@Test
    public void newUserRegistrationPositive(){
    clickOnRegistrationLink();
    chooseGenger();
    fillRegistrationForm(new User().setName("Y").setLastName("Test").setEmail("Yulia@test.com").setPassword("Test1234$").setPassword("Test1234$"));
    clickOnRegistrationButton();

    Assert.assertTrue(isLogoutPresent());

}

}
