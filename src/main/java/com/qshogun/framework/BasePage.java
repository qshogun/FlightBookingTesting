package com.qshogun.framework;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;

    public BasePage() {

    }

    public static WebDriver getDriver() {
        if(driver==null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.setPageLoadStrategy(PageLoadStrategy.NONE);
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static WebDriver getDriver(String browserName) {
        if(driver==null) {
            if(browserName.equalsIgnoreCase("firefox")) {
                System.out.println("in Mozilla Firefox");
                System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
            } else if(browserName.equalsIgnoreCase("chrome")) {
                System.out.println("in Google Chrome");
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
            }
        }
        return driver;
    }
}