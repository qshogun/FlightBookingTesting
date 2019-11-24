package com.qshogun.tests;

import com.qshogun.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class HelperClass {

    public static WebDriver driver;

    public HelperClass() {
    }

    @BeforeSuite
    public void beforeSuite() {
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("in @BeforeClass");
    }

    @BeforeMethod
    public void beforeMethodClass() {
        System.out.println("in @BeforeMethod");
        HelperClass.driver = BasePage.getDriver("chrome");
    }

    @AfterMethod
    public void close() {
        //this.driver.close();
    }

    @AfterClass
    public void afterClass() {
    }

    @AfterSuite
    public void afterSuite() throws IOException {
        driver.quit();
    }

}