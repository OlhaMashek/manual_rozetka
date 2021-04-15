package rozetka.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class TestContext {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null)
        {
            chromedriver().setup();
            driver = new ChromeDriver(); //singltone - read.me
            driver.manage().window().maximize();



        }
        return driver;
    }
    static void setDriver(WebDriver driver){
        TestContext.driver = driver;
    }
}
