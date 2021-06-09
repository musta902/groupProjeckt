package com.cybertek.tests.HomeWorks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hwTc3 {
    public static void main(String[] args) {

        WebDriver driver2 = WebDriverFactory.getDriver("chrome");

        driver2.get("http://wikipedia.org");


        WebElement searchWiki= driver2.findElement(By.xpath("//input[@id='searchInput']"));

        searchWiki.sendKeys("selenium webdriver");

        driver2.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();


        driver2.findElement(By.xpath("(//div/a[@href])[4]")).click();

        String expectedURL="Selenium_(software)";
        System.out.println("driver2.getCurrentUrl() = " + driver2.getCurrentUrl());

        if(expectedURL.equals(driver2.getCurrentUrl())){

            System.out.println("PASS");
        }else{
            System.out.println("FAil");
        }





    }
}
