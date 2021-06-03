package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkTextandPartialLinkText {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //make browser fullscreen,max
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");


        WebElement link1=driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));

        //link1.click();

       driver.findElement(By.partialLinkText("Example 4")).click();

    }

}
