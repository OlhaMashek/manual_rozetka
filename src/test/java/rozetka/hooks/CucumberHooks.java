package rozetka.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CucumberHooks {

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
       // driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        TestContext.setDriver(driver);
    }

    @After
    public void closeDriver() {
        TestContext.getDriver().close();
    }
}
