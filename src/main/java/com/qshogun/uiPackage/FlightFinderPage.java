package com.qshogun.userinterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.qshogun.userinterface.Help.*;

public class FlightFinderPage {

    WebDriver driver;

    public FlightFinderPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(how = How.XPATH, using = roundTripXpath)
    @CacheLookup
        WebElement roundTripButton;
    @FindBy(how = How.XPATH, using = onewayTripXpath)
    @CacheLookup
        WebElement onewayTripButton;
    @FindBy(how = How.NAME, using = "passCount")
    @CacheLookup
        WebElement passCountBox;
    @FindBy(how = How.NAME, using = "fromPort")
    @CacheLookup
        WebElement fromPortTable;
    @FindBy(how = How.NAME, using = "toPort")
    @CacheLookup
        WebElement toPortTable;
    @FindBy(how = How.NAME, using = "fromMonth")
    @CacheLookup
        WebElement fromMonthTable;
    @FindBy(how = How.NAME, using = "fromDay")
    @CacheLookup
        WebElement fromDayTable;
    @FindBy(how = How.NAME, using = "toMonth")
    @CacheLookup
        WebElement toMonthTable;
    @FindBy(how = How.NAME, using = "toDay")
    @CacheLookup
        WebElement toDayTable;
    @FindBy(how = How.NAME, using = "airline")
    @CacheLookup
        WebElement airlineBox;
    @FindBy(how = How.NAME, using = "findFlights")
    @CacheLookup
        WebElement findFlightsButton;
    @FindBy(how = How.XPATH, using = serviceClassXpath)
    @CacheLookup
        WebElement serviceClassTable;

    public void continueWordPress(String passCount, String fromPort, String toPort, String fromMonth, String fromDay, String toMonth, String toDay, String airline, String serviceClass) {
        roundTripButton.click();
        passCountBox.sendKeys(passCount);
        fromPortTable.sendKeys(fromPort);
        toPortTable.sendKeys(toPort);
        fromMonthTable.sendKeys(fromMonth);
        fromDayTable.sendKeys(fromDay);
        toMonthTable.sendKeys(toMonth);
        toDayTable.sendKeys(toDay);
        airlineBox.sendKeys(airline);
        serviceClassTable.sendKeys(serviceClass);
        findFlightsButton.click();

    }
}
