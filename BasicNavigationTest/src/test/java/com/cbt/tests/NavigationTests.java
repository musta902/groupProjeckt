package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        Thread.sleep(4000);
        driver.close();

        WebDriver driver1= BrowserFactory.getDriver("firefox");
        driver1.get("https://www.google.com");
        Thread.sleep(4000);
        driver.close();

        WebDriver driver2= BrowserFactory.getDriver("Edge");
        driver2.get("https://www.google.com");
        Thread.sleep(4000);
        driver.close();






    }
    }




