package rozetka.stepsdef;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import rozetka.config.Config;

public class GivenSteps {

    private final WebDriver driver = Config.getDriver();

    @Given("Url of {string} is open")
    public void urlOfIsOpen(String store_url) {
        driver.get(store_url);
    }
}