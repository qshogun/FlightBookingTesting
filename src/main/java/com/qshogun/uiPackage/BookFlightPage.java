package com.qshogun.userinterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookFlightPage {

    WebDriver driver;

    public BookFlightPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "passFirst0")
    @CacheLookup
        WebElement firstNameBox;
    @FindBy(how = How.NAME, using = "passLast0")
    @CacheLookup
        WebElement lastnameBox;
    @FindBy(how = How.NAME, using = "pass.0.meal")
    @CacheLookup
        WebElement mealBox;
    @FindBy(how = How.NAME, using = "creditCard")
    @CacheLookup
        WebElement creditCardTypeBox;
    @FindBy(how = How.NAME, using = "creditnumber")
    @CacheLookup
        WebElement creditCardNumberBox;
    @FindBy(how = How.NAME, using = "cc_exp_dt_mn")
    @CacheLookup
        WebElement creditCardExpMonthBox;
    @FindBy(how = How.NAME, using = "cc_exp_dt_yr")
    @CacheLookup
        WebElement creditCardExpYearBox;
    @FindBy(how = How.NAME, using = "cc_first_name")
    @CacheLookup
        WebElement creditCardFirstNameBox;
    @FindBy(how = How.NAME, using = "cc_mid_name")
    @CacheLookup
        WebElement creditCardMidNameBox;
    @FindBy(how = How.NAME, using = "cc_last_name")
    @CacheLookup
        WebElement creditCardLastNameBox;
    @FindBy(how = How.NAME, using = "buyFlights")
    @CacheLookup
        WebElement buyFlightsButton;

    public void PurchasePress(String firstName, String lastName, String meal, String creditCardType, String creditCardNumber, String creditCardExpMonth, String creditCardExpYear, String creditCardFirstName, String creditCardMidName, String creditCardLastName) {
        firstNameBox.sendKeys(firstName);
        lastnameBox.sendKeys(lastName);
        mealBox.sendKeys(meal);
        creditCardTypeBox.sendKeys(creditCardType);
        creditCardNumberBox.sendKeys(creditCardNumber);
        creditCardExpMonthBox.sendKeys(creditCardExpMonth);
        creditCardExpYearBox.sendKeys(creditCardExpYear);
        creditCardFirstNameBox.sendKeys(creditCardFirstName);
        creditCardMidNameBox.sendKeys(creditCardMidName);
        creditCardLastNameBox.sendKeys(creditCardLastName);
        buyFlightsButton.click();
    }
}
