package com.telran.qa46;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPositiveTests extends TestBase{
    @Test
    public void userLoginPositive (){
        click(By.cssSelector(".ico-login"));
        type(By.name("Email"), "Yulia1@gmail.com");
        type(By.name("Password"), "Yulia12345$");
        click(By.cssSelector("input[value='Log in']"));

        Assert.assertTrue(isElementPresent(By.cssSelector("[href=\"/logout\"]")));
    }
}
