package com.qshogun.testPackage;

import com.qshogun.uiPackage.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static com.qshogun.testPackage.DataClass.*;

public class TestCaseClass extends HelperClass {

    public TestCaseClass() {

    }

    @Test
    public void checkIfWebsiteOpens() throws Exception {
        System.out.println("in checkIfWebsiteOpens");
        driver.get(websiteLink);
        org.junit.Assert.assertEquals(homepageTitle, driver.getTitle());
    }

    @Test
    public void loginCredentialsCorrect() throws Exception {
        System.out.println("in loginCredentialsCorrect");
        driver.get(websiteLink);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginWordPress(usernameCorrect, passwordCorrect);
        org.junit.Assert.assertEquals(afterLoginPageTitle, driver.getTitle());
    }

    @Test
    public void loginCredentialsIncorrect() throws Exception {
        System.out.println("in loginCredentialsIncorrect");
        driver.get(websiteLink);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginWordPress(usernameCorrect, passwordIncorrectLowercase);
        org.junit.Assert.assertEquals(signonPageTitle, driver.getTitle());
    }

}