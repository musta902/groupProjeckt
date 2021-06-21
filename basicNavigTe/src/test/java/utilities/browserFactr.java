package utilities;

public class browserFactr {


    public  staticgetDriver WebDriver (String browserType) {
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
