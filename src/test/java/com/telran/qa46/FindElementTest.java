package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import java.time.Duration;

public class FindElementTest {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());

        WebElement a = driver.findElement(By.tagName("a"));

        List<WebElement> a1 = driver.findElements(By.tagName("w"));
        System.out.println(a1.size());

    }
    @Test
    public void findElemantBySimpleLocators(){
        //by id
        driver.findElement(By.id("city"));
        //by class name
        driver.findElement(By.className("input-container"));
        //by partialLinkText
        driver.findElement(By.partialLinkText("Let"));
    }
    //css selectors
    @Test
    public void findElementByCssSelectorTest(){
        //id=>css(#)
        driver.findElement(By.cssSelector("#city"));
        //class name=>css(.)
        driver.findElement(By.cssSelector(".input-container"));
        //[attr='value']
        driver.findElement(By.cssSelector("[href=\'assets/images/icon.svg\']"));
        driver.findElement(By.cssSelector("[href*=\'icon.svg\']"));
        //start->^
       //driver.findElement(By.cssSelector("[href^=\'icon.svg\']"));
        //start->$
        driver.findElement(By.cssSelector("[href$='search']"));
        //tag+id
        driver.findElement(By.cssSelector("input#city"));
        //tag+class
        driver.findElement(By.cssSelector("div.mobile-header"));


    }
    //         //*[@attr='value']

    @Test
    public void findElementByXpath(){
        //id->xpath //*[@id='xpath']
        //driver.findElement(By.xpath("//input[@id='city']"));
        driver.findElement(By.xpath("//*[@id='city']"));
    driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));
    driver.findElement(By.xpath("//h2[.='Type your data and hit Yalla!']"));
    driver.findElement(By.xpath("//label[starts-with(@for,'ci')]"));
    //move up
    driver.findElement(By.xpath("//a[@class='navigation-link']/.."));
    //parent
    driver.findElement(By.xpath("//h1/parent::*"));
    driver.findElement(By.xpath("//h1/.."));
    //ancestor
        driver.findElement(By.xpath("//h1/ancestor::div[2]"));//2 options
        driver.findElement(By.xpath("//h1/ancestor::div"));// uniqe locator
        driver.findElement(By.xpath("//h1/ancestor::*"));// all
        driver.findElement(By.xpath("//h1/following-sibling::form"));
    }


}
//input-container