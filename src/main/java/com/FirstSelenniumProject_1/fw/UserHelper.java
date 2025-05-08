package com.FirstSelenniumProject_1.fw;

import com.FirstSelenniumProject_1.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegistrationButton() {
        click(By.cssSelector("#register-button"));
    }


    public void fillRegistrationForm(User user) {
        type(By.name("FirstName"), user.getName());
        type(By.name("LastName"), user.getLastName());
        type(By.name("Email"), user.getEmail());
        type(By.name("Password"), user.getPassword());
        type(By.name("ConfirmPassword"), user.getPassword());
    }

    public void chooseGenger() {
        click(By.cssSelector("#gender-male"));
    }

    public void clickOnRegistrationLink() {
        click(By.cssSelector("[href=\"/register\"]"));
    }

    public void clickOnLoginButton(String cssSelector) {
        click(By.cssSelector(cssSelector));
    }

    public void fillLoginForm(User test1234$) {
        type(By.name("Email"), "Yulia1@gmail.co");
        type(By.name("Password"), "Yulia12345$");
    }

    public void clickOnLoginLink(String cssSelector) {
        click(By.cssSelector(cssSelector));
    }

    public boolean isErrorMessagePresent(){
        return isElementPresent(By.xpath("//div[@class='validation-summary-errors']"));

    }

    public boolean isLogoutPresent() {
        return isElementPresent(By.cssSelector("[href=\"/logout\"]"));
    }
    public boolean isLoginPresent() {
        return isElementPresent(By.cssSelector(".ico-login"));
    }

    public void clickOnHomeLink() {
        click(By.cssSelector("href=\"/\""));

    }

    public void clickOnSignOutButton() {

        click(By.cssSelector("[href=\"/logout\"]"));
    }
}

