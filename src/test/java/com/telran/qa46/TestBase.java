package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void Setup (){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false)
    public void TearDown(){
        driver.quit();
    }

    public boolean isElementPresent(By locator){
       return driver.findElements(locator).size()>0;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
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

    protected void clickOnLoginButton(String cssSelector) {
        click(By.cssSelector(cssSelector));
    }

    protected void fillLoginForm(User test1234$) {
        type(By.name("Email"), "Yulia1@gmail.com");
        type(By.name("Password"), "Yulia12345$");
    }

    protected void clickOnLoginLink(String cssSelector) {
        click(By.cssSelector(cssSelector));
    }

    protected boolean isLogoutPresent() {
        return isElementPresent(By.cssSelector("[href=\"/logout\"]"));
    }

    public void addItemToTheCart() {
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
        driver.findElement(By.xpath("//li[@id='topcartlink']")).click();
    }

    public boolean isItemPresentInTheCart() {
        return isElementPresent(By.xpath("//a[@class='product-name'][contains(text(),'14.1-inch Laptop')]"));
    }
}
