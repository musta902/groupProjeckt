package tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class HomeWork {

    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com");

        String title = driver.getTitle();

        System.out.println("title = " + title);
        driver.get("https://www.etsy.com");
        String title1 = driver.getTitle();
        System.out.println("title1 = " + title1);

        driver.navigate().back();
        String title2 = driver.getTitle();
        StringUtility.verifyEquals(title,title2);

        driver.navigate().forward();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title1,title3);





    }
}
