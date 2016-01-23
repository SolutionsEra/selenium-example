package com.seleniumtut20.Tut20;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by yaredtseghu on 23/01/2016.
 */
public class GooglePageFactoryTest {

    public static WebDriver webDriver;
    GooglePageFactory googlePageFactory;

    @BeforeClass
    public static void setup(){
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Before
    public void goToGooglePage(){
        webDriver.get("http:www.google.com");
    }

    @Test
    public void performSearch(){
        googlePageFactory = new GooglePageFactory(webDriver);
        googlePageFactory.performFullSearch("Selenium");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void closeBrowser(){
        webDriver.close();
        webDriver.quit();
    }
}
