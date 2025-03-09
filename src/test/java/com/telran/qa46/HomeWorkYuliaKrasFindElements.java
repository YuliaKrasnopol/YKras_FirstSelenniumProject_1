package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorkYuliaKrasFindElements {

    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void After(){
        driver.quit();
    }

    @Test

    public void FinfElementSimpleLocators(){
        driver.findElement(By.className("header-logo"));
        driver.findElement(By.className("button-1"));
       driver.findElement(By.className("ico-login"));

       driver.findElement(By.id("topcartlink"));
       driver.findElement(By.id("flyout-cart"));
       driver.findElement(By.id("dialog-notifications-success"));

       driver.findElement(By.tagName("h3"));
        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println(a.size());

        driver.findElement(By.tagName("h2"));

        driver.findElement(By.name("NewsletterEmail"));
        driver.findElement(By.name("pollanswers-1"));
    }

    @Test
    public void FindElementByCss(){
        driver.findElement(By.cssSelector("#flyout-cart"));
        driver.findElement(By.cssSelector("#topcartlink"));
        driver.findElement(By.cssSelector("#small-searchterms"));

        driver.findElement(By.cssSelector("li[id='topcartlink']"));
        driver.findElement(By.cssSelector("div.header-logo"));
        driver.findElement(By.cssSelector(".header-links-wrapper"));

        driver.findElement(By.cssSelector("a[href='/digital-downloads']"));
        driver.findElement(By.cssSelector("[href*='/cart']"));

        driver.findElement(By.cssSelector("#pollanswers-1"));

        driver.findElement(By.cssSelector("[href$='search']"));


    }

}
