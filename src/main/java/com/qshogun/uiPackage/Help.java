package com.qshogun.uiPackage;

public class Help {
    //FlightFinderPage web elements xpaths
    public static final String roundTripXpath = "//input[@name='tripType' and @value='roundtrip']";
    public static final String onewayTripXpath = "//input[@name='tripType' and @value='oneway']";
    public static final String serviceClassXpath = ".//*[@value='Business']";


    //airlines xpaths
    public static final String blueSkiesAirlines360Xpath = "//input[@type='radio' and contains(@value,'360')]";
    public static final String blueSkiesAirlines361Xpath = "//input[@type='radio' and contains(@value,'361')]";
    public static final String blueSkiesAirlines630Xpath = "//input[@type='radio' and contains(@value,'630')]";
    public static final String blueSkiesAirlines631Xpath = "//input[@type='radio' and contains(@value,'631')]";
    public static final String pangaeaAirlines362Xpath = "//input[@type='radio' and contains(@value,'362')]";
    public static final String pangaeaAirlines632Xpath = "//input[@type='radio' and contains(@value,'632')]";
    public static final String unifiedAirlines363Xpath = "//input[@type='radio' and contains(@value,'363')]";
    public static final String unifiedAirlines633Xpath = "//input[@type='radio' and contains(@value,'633')]";
    public static final String continueButtonXpath = "//input[@name='reserveFlights']";

    //flight confirmation page
    public static final String logoutButtonXpath = "//img[contains[@src,'Logout'])";
}
