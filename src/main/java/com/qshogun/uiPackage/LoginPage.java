package com.qshogun.uiPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "userName")
    @CacheLookup
        private WebElement usernameTextbox;
    @FindBy(how = How.NAME, using = "password")
    @CacheLookup
        private WebElement passwordTextBox;
    @FindBy(how = How.NAME, using = "login")
    @CacheLookup
        private WebElement loginButton;

    public void loginWordPress(String userName, String password) {
        usernameTextbox.sendKeys(userName);
        passwordTextBox.sendKeys(password);
        loginButton.click();
    }
}
