package com.telran.qa46;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

@Test
    public void newUserRegistrationPositive(){
    click(By.cssSelector("[href=\"/register\"]"));
    click(By.cssSelector("#gender-male"));
    type(By.name("FirstName"), "Yulia");
    type(By.name("LastName"), "Krasnopolskaia");
    type(By.name("Email"), "Yulia1@gmail.com");
    type(By.name("Password"), "Yulia12345$");
    type(By.name("ConfirmPassword"), "Yulia12345$");
    click(By.cssSelector("#register-button"));

    Assert.assertTrue(isElementPresent(By.cssSelector("[href=\"/logout\"]")));

}

}
