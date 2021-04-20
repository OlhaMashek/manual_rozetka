package rozetka.config;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseStep {

    private WebDriver driver;

@BeforeMethod
public void testsSetUp() {
        driver.get("https://rozetka.com.ua");
        }
}


