package com.telran.qa46;

import com.FirstSelenniumProject_1.data.UserData;
import com.FirstSelenniumProject_1.models.User;
import com.FirstSelenniumProject_1.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateAccountTest extends TestBase {


@Test
    public void newUserRegistrationPositive(){
    app.getUser().clickOnRegistrationLink();
    app.getUser().chooseGenger();
    app.getUser().fillRegistrationForm(new User().setName(UserData.NAME).setLastName(UserData.LASTNAME).setEmail(UserData.EMAIL).setPassword(UserData.PASSWORD));
    app.getUser().clickOnRegistrationButton();

    Assert.assertTrue(app.getUser().isLogoutPresent());

}


@Test(dataProvider = "newUserPositiveFromCsv", dataProviderClass = DataProviders.class)
    public void newUserRegistrationPositiveFromCsv(User user){
    app.getUser().clickOnRegistrationLink();
    app.getUser().chooseGenger();
    app.getUser().fillRegistrationForm(user);
    app.getUser().clickOnRegistrationButton();

    Assert.assertTrue(app.getUser().isLogoutPresent());

}

@Test(dataProvider = "addNewUser", dataProviderClass = DataProviders.class)
    public void newUserRegistrationPositiveFromDataProviderTest(String name,
                                                                String lastName,
                                                                String email,
                                                                String password){
    app.getUser().clickOnRegistrationLink();
    app.getUser().chooseGenger();
    app.getUser().fillRegistrationForm(new User().setName(name).setLastName(lastName).setEmail(email).setPassword(password));
    app.getUser().clickOnRegistrationButton();

    Assert.assertTrue(app.getUser().isLogoutPresent());

}

}
