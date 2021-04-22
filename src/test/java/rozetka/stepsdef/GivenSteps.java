package rozetka.stepsdef;
import io.cucumber.java.en.Given;
import rozetka.config.Config;

public class GivenSteps {

    @Given("Url of {string} is open")
    public void urlOfIsOpen(String store_url) {
        Config.getDriver().get(store_url);
    }
}
