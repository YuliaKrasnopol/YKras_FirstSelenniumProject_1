package com.FirstSelenniumProject_1.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {
    String browser;
    WebDriver driver;

CartHelper cart;
UserHelper user;

    public ApplicationManager(String browser) {
        this.browser=browser;
    }

    public void init() {
        if (browser.equalsIgnoreCase("chrome")){
        driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   user =new UserHelper(driver);
   cart = new CartHelper(driver);

    }

    public void stop() {
        driver.quit();
    }

    public CartHelper getCart() {
        return cart;
    }

    public UserHelper getUser() {
        return user;
    }
}
