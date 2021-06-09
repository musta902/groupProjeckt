package com.cybertek.tests.HomeWorks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.SourceVersion;

public class hw {
//Test case 1
//Go to Ebay
//enter search term
//click on search button
//print number of results
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://www.ebay.com");


        WebElement a= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        a.sendKeys("adidas");

        WebElement numberOfResults= driver.findElement(By.xpath("//input[@type='submit']"));
        numberOfResults.click();

       WebElement numberOfResults1 = driver.findElement(By.xpath("//div/div/div/h1/span[@class='BOLD'][1]"));
        System.out.println("numberOfResults1.getText() = " + numberOfResults1.getText());

        driver.close();



        WebDriver driver1 = WebDriverFactory.getDriver("chrome");

        driver1.get("http://www.ebay.com");
        WebElement selenium= driver1.findElement(By.xpath("//input[@type='text']"));
        selenium.sendKeys("Selenium");
        WebElement searchBox= driver1.findElement(By.xpath("//input[@type='submit']"));
        searchBox.click();

        WebElement term=driver1.findElement(By.xpath("//div/div/div/h1/span[@class='BOLD'][2]"));
        term.getText();
        String expectedResult="Selenium";
        if(expectedResult.equals(term.getText())){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
        }














    }

}
//Locator HW
//Feel free to use any project for automation.
//Test case 1
//Go to Ebay
//enter search term
//click on search button
//print number of results
//
//Test case 2
//Go to Ebay
//search Selenium
//click on search button
//verify title contains Selenium
//
//Test case 3
//Go to wikipedia.org (Links to an external site.)
//enter search term `selenium webdriver`
//click on search button
//click on search result `Selenium (software)`
//verify url ends with `Selenium_(software)'