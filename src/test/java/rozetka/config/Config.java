package rozetka.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Config {
    private static WebDriver driver;

    @Before
    public static WebDriver getDriver(){
        if (driver==null)
        {
            chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
        }
        return driver;
    }

    public void testsSetUp(String url) {
        url = "https://rozetka.com.ua";
        driver.get(url);
    }
}
