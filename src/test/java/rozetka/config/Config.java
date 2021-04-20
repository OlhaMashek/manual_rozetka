package rozetka.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Config {
    private static WebDriver driver;

    @BeforeTest
    public static WebDriver getDriver(){
        if (driver==null)
        {
            chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
    static void setDriver(WebDriver driver){
        Config.driver = driver;
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
