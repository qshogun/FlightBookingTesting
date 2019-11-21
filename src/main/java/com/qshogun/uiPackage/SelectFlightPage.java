package com.qshogun.uiPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.qshogun.uiPackage.Help.*;

public class SelectFlightPage {

    WebDriver driver;

    public SelectFlightPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(how = How.XPATH, using = blueSkiesAirlines360Xpath)
    @CacheLookup
        WebElement blueSkiesAirlines360;
    @FindBy(how = How.XPATH, using = blueSkiesAirlines361Xpath)
    @CacheLookup
        WebElement blueSkiesAirlines361;
    @FindBy(how = How.XPATH, using = blueSkiesAirlines630Xpath)
    @CacheLookup
        WebElement blueSkiesAirlines630;
    @FindBy(how = How.XPATH, using = blueSkiesAirlines631Xpath)
    @CacheLookup
        WebElement blueskiesAirlines631;
    @FindBy(how = How.XPATH, using = unifiedAirlines363Xpath)
    @CacheLookup
        WebElement unifiedAirlines363;
    @FindBy(how = How.XPATH, using = unifiedAirlines633Xpath)
    @CacheLookup
        WebElement unifiedAirlines633;
    @FindBy(how = How.XPATH, using = pangaeaAirlines362Xpath)
    @CacheLookup
        WebElement pangaeaAirlines362;
    @FindBy(how = How.XPATH, using = pangaeaAirlines632Xpath)
    @CacheLookup
        WebElement pangaeaAirlines632;
    @FindBy(how = How.XPATH, using = continueButtonXpath)
    @CacheLookup
        WebElement continueButton;

    public void departAirlineWordPress(String departAirline) throws InterruptedException {
        if(departAirline.equalsIgnoreCase("Blue Skies Airlines 360")) {
            blueSkiesAirlines360.click();
        }
        if(departAirline.equalsIgnoreCase("Blue Skies Airlines 361")) {
            blueSkiesAirlines361.click();
        }
        if(departAirline.equalsIgnoreCase("Pangaea Airlines 362")) {
            pangaeaAirlines362.click();
        }
        if(departAirline.equalsIgnoreCase("Unified Airlines 363")) {
            unifiedAirlines363.click();
        }
    }

    public void returnAirlinesWordPress(String returnAirline) throws InterruptedException {
        if(returnAirline.equalsIgnoreCase("Blue Skies Airlines 630")) {
            blueSkiesAirlines630.click();
        }
        if(returnAirline.equalsIgnoreCase("Blue Skies Airlines 631")) {
            blueskiesAirlines631.click();
        }
        if(returnAirline.equalsIgnoreCase("Pangaea Airlines 632")) {
            pangaeaAirlines632.click();
        }
        if(returnAirline.equalsIgnoreCase("Unified Airlines 633")) {
            unifiedAirlines633.click();
        }
    }

    public void continueButtonClick() {
        continueButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
