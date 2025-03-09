package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;



public class FirstSeleniumTest {
    WebDriver driver;

    //opt+enter
    //precondition-before method
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ilcarro.web.app/login?url=%2Fsearch");
        //implecity wait for all elements on the page load
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com/");
    }
        //test
        @Test
        public void openGoogleTest() {
            System.out.println("okey");
        }
        //after
        @AfterMethod(enabled = true)
        public void tearDown() {
            driver.close();
        }
    }

