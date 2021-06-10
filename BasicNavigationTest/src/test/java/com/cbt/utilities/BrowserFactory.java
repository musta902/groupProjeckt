package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {


     public  staticgetDriver (WebDriver String browserType) {
          WebDriver driver = null;
          //Chrome,CHROME,CHROme
          switch (browserType.toLowerCase()) {
               case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

               case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

               case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();


                    break;






          }

          return driver;


     }


}
