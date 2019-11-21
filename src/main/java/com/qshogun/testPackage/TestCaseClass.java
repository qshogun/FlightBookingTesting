package com.qshogun.testPackage;

import com.qshogun.uiPackage.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.junit.Test;

import static com.qshogun.testPackage.DataClass.*;

public class TestCaseClass extends HelperClass {

    public TestCaseClass() {

    }

    @Test
    public void loginCredentialsCorrect() throws Exception {
        System.out.println("in loginCredentialsCorrect");
        driver.get(websiteLink);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginWordPress(usernameCorrect, passwordCorrect);
        Assert.assertEquals(afterLoginPageTitle, driver.getTitle());
    }
}