package rozetka.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

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
           // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    @BeforeMethod
    public void testsSetUp(String url) {
        url = "https://rozetka.com.ua";
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
