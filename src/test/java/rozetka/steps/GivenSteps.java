package rozetka.steps;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import rozetka.hooks.TestContext;

public class GivenSteps extends BaseStep{

    @Given("Url of store is open")
    public void urlOfStoreIsOpen() {
        TestContext.getDriver().get("https://rozetka.com.ua");
    }

    @Given("Url of {string} is open")
    public void urlOfIsOpen(String store_url) {
        TestContext.getDriver().get(store_url);
    }
}
