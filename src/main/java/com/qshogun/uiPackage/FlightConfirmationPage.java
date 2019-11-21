package com.qshogun.uiPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.qshogun.uiPackage.Help.logoutButtonXpath;

public class FlightConfirmationPage {

    WebDriver driver;

    public FlightConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = logoutButtonXpath)
    @CacheLookup
        WebElement logoutButton;

    public void logoutPress() {
        logoutButton.click();
    }
}