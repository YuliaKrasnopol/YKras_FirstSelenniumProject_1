package com.telran.qa46;

import com.FirstSelenniumProject_1.fw.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeSuite
    public void Setup (){
        app.init();
    }

    @AfterSuite(enabled = false)
    public void TearDown(){
        app.stop();
    }
    @BeforeMethod
    public void StartTest (Method method, Object[]user){
        logger.info("Start test "+method.getName()+ Arrays.asList(user));

    }
    @AfterMethod
    public void EndTest(ITestResult result){
        if(result.isSuccess()){
            logger.info("Passed "+result.getMethod().getMethodName());
        }
        else {logger.error("Failed "+result.getMethod().getMethodName()+" Screenshot path "
        +app.getUser().takeScreenshot());
        logger.info("End test ");
        logger.info("****************");
        }
    }

}

